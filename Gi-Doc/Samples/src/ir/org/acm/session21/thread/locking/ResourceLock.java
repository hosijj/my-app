package ir.org.acm.session21.thread.locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceLock {

    Lock lock = new ReentrantLock();

    void m1() {
        System.out.println(Thread.currentThread().getName() + " Entered m1()...");
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " Aquires lock...");
        try {
            // Do something...
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
            }
        } finally {
            lock.unlock();
        }
        System.out.println(Thread.currentThread().getName() + " Release lock...");
        System.out.println(Thread.currentThread().getName() + " Exiting m1()...");
    }

    void m2() {
        System.out.println(Thread.currentThread().getName() + " Entered m2()...");
        try { Thread.sleep(10*1000); } catch(InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + " Exiting m2()...");
    }

}
