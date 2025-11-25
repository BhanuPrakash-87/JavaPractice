package handsonPractice;

public class Singleton {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                Abc obj1 = Abc.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Abc obj2 = Abc.getInstance();
            }
        });

        t1.start();
        t2.start();
    }
}

class Abc {
    static Abc obj;
    private Abc() {
        System.out.println("Instance created");
    }

    // synchronized will make a thread to wait
    public static synchronized Abc getInstance () {
        if (null == obj) {
            obj = new Abc();
        }
        return obj;
    }
}