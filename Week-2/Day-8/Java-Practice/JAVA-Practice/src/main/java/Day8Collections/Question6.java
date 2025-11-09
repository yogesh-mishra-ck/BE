package Day8Collections;

//6. Write a Java program with two threads: Thread 1 prints table of number 2. Thread 2 prints table of number 4. Threads should be synced to print output one by one.

class PrintTables {

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
            notify();
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
            notify();
        }
    }
}

class Table1 implements Runnable{

    private final PrintTables printTables;
    Table1(PrintTables printTables){
        this.printTables = printTables;
    }

    @Override
    public void run(){
        printTables.printTable2();
    }
}

class Table2 implements Runnable{

    private final PrintTables printTables;
    Table2(PrintTables printTables){
        this.printTables = printTables;
    }

    @Override
    public void run(){
        printTables.printTable4();
    }
}

public class Question6 {
    public static void main(String[] args) {
        PrintTables printTables = new PrintTables();

        Table1 table1 = new Table1(printTables);
        Table2 table2 = new Table2(printTables);

        Thread t1 = new Thread(table1);
        Thread t2 = new Thread(table2);

        t1.start();
        t2.start();
    }
}
