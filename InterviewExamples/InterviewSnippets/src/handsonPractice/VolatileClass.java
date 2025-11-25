package handsonPractice;

public class VolatileClass {

    private volatile boolean done = false;

    public void loop () {
        System.out.println("Entering loop method");
        for (int i = 0; i < 3; i++) {
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Sleep for 1 second.
        }
        System.out.println("Setting done to true");
        done = true;
    }

    public void waitToFinish() {
        System.out.println("waitToFinish entering");
        while (!done);
        System.out.println("waitToFinish exiting");
    }
}
