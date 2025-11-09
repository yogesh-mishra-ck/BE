package Day8Collections;

//7. Write a Java program with two threads: Thread 1 prints table of number 2. Thread 2 prints table of number 4. Threads should be synced to print output one by one.
//Write above program using ExecutorService

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintTheTables {

    private boolean isTable2Turn = true;

    synchronized void printTable2(){
        for(int times=1; times<=10; times++){
            while( !isTable2Turn ){ //wait until lock is acquired to print table2
                try{
                    wait();
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }

            System.out.println("2 X "+times+" = "+2*times);
            isTable2Turn = false;
            notifyAll();
        }
    }

    synchronized void printTable4(){
        for(int times=1; times<=10; times++){
            while( isTable2Turn ){ //wait until lock is acquired to print table4
                try{
                    wait();
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }

            System.out.println("4 X "+times+" = "+4*times);
            isTable2Turn = true;
            notifyAll();
        }
    }
}

class TableOne implements Runnable{

    private final PrintTheTables printTheTables;
    TableOne(PrintTheTables printTheTables){
        this.printTheTables = printTheTables;
    }

    @Override
    public void run(){
        printTheTables.printTable2();
    }
}

class TableTwo implements Runnable{

    private final PrintTheTables printTheTables;
    TableTwo(PrintTheTables printTables){
        this.printTheTables = printTables;
    }

    @Override
    public void run(){
        printTheTables.printTable4();
    }
}

public class Question7 {
    public static void main(String[] args) {

        PrintTheTables printTheTables = new PrintTheTables();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new TableOne(printTheTables));
        executorService.submit(new TableTwo(printTheTables));

        executorService.shutdown();
    }
}
