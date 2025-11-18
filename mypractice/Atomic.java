
import java.util.concurrent.Executors;

public class Atomic {

    public static void main(String[] args) {
        final AtomicClass atomicClass = new AtomicClass();
        final int numThreads = 5;
        final int numIters = 10_000;
        final var executorService = Executors.newFixedThreadPool(numThreads);

        try {
            for (int i = 0; i < numThreads; i++) {
                executorService.submit(() -> {
                    for (int j = 0; j < numIters; j++) {
                            atomicClass.increment();
                    }
                });
            }
        }
        finally {
            System.out.println(atomicClass.get());
        }
    }
}
