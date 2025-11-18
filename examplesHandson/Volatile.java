import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Volatile {
    public static void main(String[] args) {
        final UnsafeClass myClass = new UnsafeClass();
        final int numThreads = 2;
        try (final var executorService = Executors.newFixedThreadPool(numThreads)) {
            executorService.submit(() -> {
                try {
                    myClass.loop();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            executorService.submit(myClass::waitToFinish);
        }
    }
}
