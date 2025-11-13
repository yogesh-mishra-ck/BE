package Day9AdvanceJava;

import java.util.ArrayDeque;
import java.util.Queue;

class ProducerConsumer{

    private final Queue<Integer> sharedBuffer;
    private final int bufferSize;

    ProducerConsumer(Queue<Integer> sharedBuffer){
        this.sharedBuffer = sharedBuffer;
        this.bufferSize = 5;
    }

    public void produce() throws InterruptedException{
            for(int i=1; i<=50; i++){
                synchronized (sharedBuffer){
                    while (sharedBuffer.size() == bufferSize){ //wait if its full
                        sharedBuffer.wait();
                    }

                    sharedBuffer.add(i);
                    System.out.println("Produced " + i + "\n"+ "Buffer Current State: " + sharedBuffer);
                    System.out.println("Produced by "+Thread.currentThread().getName());
                    sharedBuffer.notifyAll();

                }
            }

    }

    public void consume() throws InterruptedException{
        int counter=1;
        while(counter!=50){
            synchronized (sharedBuffer){
                while(sharedBuffer.isEmpty()) //wait if its empty
                    sharedBuffer.wait();
                int consumed = sharedBuffer.poll();
                System.out.println("Consumed " + consumed + "\n"+ "Buffer Current State: " + sharedBuffer);
                System.out.println("Consumed by "+Thread.currentThread().getName());


                counter++;
                sharedBuffer.notifyAll();
            }
        }
    }

}
public class Q1 {
    public static void main(String[] args) {
        Queue<Integer> sharedBuffer = new ArrayDeque<>();

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
