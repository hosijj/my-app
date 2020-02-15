package ir.org.acm.session20.thread;

public class T09DaemonThread {

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                for (int i=0; i<100; i++) {
                    System.out.println("A: " + i + " of 100");
                    delay(10);
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i=0; i<300; i++) {
                    System.out.println("B: " + i + " of 300");
                    delay(10);
                }
            }
        };
        t2.setDaemon(true);

        Thread t3 = new Thread() {
            public void run() {
                for (int i=0; i<200; i++) {
                    System.out.println("C: " + i + " of 200");
                    delay(10);
                }
            }
        };

        t1.start(); // non-Daemon
        t2.start(); // Daemon
        t3.start(); // non-Daemon

    }

    static void delay(int delayTime) {

        try {
            Thread.sleep(delayTime);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }


}
