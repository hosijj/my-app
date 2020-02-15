package ir.org.acm.session20.thread;

public class T12TestPriority {

    public static void main(String args[]) {
        
        System.out.println("Wait for 1 minute...");
        
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Counter hi = new Counter(Thread.MAX_PRIORITY);
        Counter lo = new Counter(Thread.MIN_PRIORITY);
        lo.start();
        hi.start();
        
        // Wait for 1 minute
        try {
            Thread.sleep(1*60*1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        lo.stop();
        hi.stop();
        
        // Wait for hi/lo threads to terminate.
        try {
            hi.t.join();
            lo.t.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        
        System.out.printf("High Priority Thread had %2.2f times more CPU time than low priority thread.\n", (double)hi.count / lo.count);
    }
}

class Counter implements Runnable {

    long count = 0;
    Thread t;
    private volatile boolean running = true;

    public Counter(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    public void run() {
        while (running) {
            count++;
        }
    }

    public void stop() {
        running = false;
    }

    public void start() {
        t.start();
    }
    
}
