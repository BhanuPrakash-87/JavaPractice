import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClass {

    private AtomicInteger counter;

    public void increment () {
        this.counter.incrementAndGet();
    }

    public int get () {
        return this.counter;
    }
}
