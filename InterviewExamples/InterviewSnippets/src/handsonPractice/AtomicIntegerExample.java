package handsonPractice;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    private static AtomicInteger atomicCounter = new AtomicInteger();
    public static void main(String[] args) {
        Runnable atomicTask = () -> {
            for (int i = 0; i < 10000; i++) {
                atomicCounter.incrementAndGet();
            }
        };

        Thread t1 = new Thread(atomicTask);
        Thread t2 = new Thread(atomicTask);

        t1.start();
        t2.start();

        try {
            // Wait for threads to finish
            t1.join();
            t2.join();
            System.out.println("Atomic counter : "+atomicCounter.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
