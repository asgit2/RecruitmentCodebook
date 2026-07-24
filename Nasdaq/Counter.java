package Nasdaq;

import java.util.concurrent.atomic.AtomicInteger;

// Qus - make it thread safe
public class Counter {
    private int count = 0;
    // -- did allow
    //public synchronized void increment() {
    //    count++;
    //}
// without changing the method signature
 public static int increment() {
    synchronized (Counter.class) {
        count++;
        return count;
    }
}
}

// If qus allows to chnage the filed type we can use Atomic Integrer and make it thread safe without using synchronized block.
class Counter {
    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();
    }
}
