package handsonPractice;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClass {

    private AtomicInteger counter;

    public void increment () {
        this.counter.incrementAndGet();
    }

    public AtomicInteger get () {
        return this.counter;
    }
}
