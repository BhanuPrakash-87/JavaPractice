public class VolatileDemo {

     private static volatile boolean flag = false;
    public static void main(String[] args) {
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(5000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("Flag has been set to true");
        });
        
        Thread readerThread = new Thread(() -> {
            while (!flag) {
                // Busy - wait until the flag becomes true
            }
            System.out.println("Flag is now true");
        });

        writerThread.start();
        readerThread.start();
    }
}
