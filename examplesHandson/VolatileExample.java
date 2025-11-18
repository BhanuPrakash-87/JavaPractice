public class VolatileExample {

    private static volatile int sharedCounter = 0;
    public static void main(String[] args) {
        
        Runnable volatileTask = () -> {
            for (int i = 0; i < 10000; i++) {
                sharedCounter++;
            }
        };

        Thread t1 = new Thread(volatileTask);
        Thread t2 = new Thread(volatileTask);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            System.out.println("Volatile counter : "+sharedCounter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
