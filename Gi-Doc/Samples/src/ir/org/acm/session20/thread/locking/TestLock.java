package ir.org.acm.session20.thread.locking;

public class TestLock {

    static ResourceLock obj = new ResourceLock();

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                System.out.println("Thread 1 Started...");
                TestLock.obj.m1();
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                System.out.println("Thread 2 Started...");
                TestLock.obj.m1();
            }
        };


        t1.setName("Thread 1");
        t1.start();

        try { Thread.sleep(2*1000); } catch(InterruptedException e) { }

        t2.setName("Thread 2");
        t2.start();

    }

}


