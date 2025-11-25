package handsonPractice;

public class RunnableThread {
    public static void main (String a[]) {

        // Runnable obj1 = new A();
        // Written this using lambda since Runnable is Functional Interface
        Runnable obj1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        // Runnable obj2 = new B();
        // Written this using lambda since Runnable is Functional Interface
        Runnable obj2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        // Runnable interface will not have Thread methods,
        // So create a Thread object
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
