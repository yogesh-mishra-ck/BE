package Day9AdvanceJava;

import java.util.ArrayList;

// Concurrency

// Goal
// Implement Producer and Consumer threads that work together using a shared buffer.

// Requirements
// Producer generates numbers 1 to 50
// Consumer reads and prints the numbers
// Shared buffer size = 5
// Producer waits if buffer is full
// Consumer waits if buffer is empty
// Use wait() & notify()



class ProducerConsumer{

    private final ArrayList<Integer> sharedBuffer;
    private final int bufferSize;

    ProducerConsumer(ArrayList<Integer> sharedBuffer){
        this.sharedBuffer = sharedBuffer;
        this.bufferSize = 5;
    }

    public void produce() throws InterruptedException{
            for(int i=1; i<=50; i++){
                synchronized (sharedBuffer){
                    while (sharedBuffer.size() == bufferSize){ //wait if its full or it is consumer turn
                        sharedBuffer.wait();
                    }

                    sharedBuffer.add(i);
                    System.out.println("Produced " + i + " | Buffer: " + sharedBuffer);
                    sharedBuffer.notifyAll();

                }
//                Thread.sleep(200);
            }

    }

    public void consume() throws InterruptedException{
        int counter=1;
        while(counter!=50){
            synchronized (sharedBuffer){
                while(sharedBuffer.isEmpty()) //wait if its empty or its producer's turn
                    sharedBuffer.wait();
                int consumed = sharedBuffer.remove(0);
                System.out.println("Consumed " + consumed + " | Buffer: " + sharedBuffer);                sharedBuffer.notifyAll();

                counter++;
                sharedBuffer.notifyAll();
            }
//            Thread.sleep(200);
        }
    }

}
public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> sharedBuffer = new ArrayList<>(5);

        ProducerConsumer producerConsumer = new ProducerConsumer(sharedBuffer);
        Thread producer = new Thread(()->{
            try{
                producerConsumer.produce();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());;
            }
        });

        Thread consumer = new Thread(()->{
            try{
                producerConsumer.consume();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());;
            }
        });

        producer.start();
        consumer.start();
    }
}
