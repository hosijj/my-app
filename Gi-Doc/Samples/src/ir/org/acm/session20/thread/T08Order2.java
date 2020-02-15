package ir.org.acm.session20.thread;

public class T08Order2 {

    public static void main(String[] args) throws Exception {

        System.out.println( "current thread is: " + Thread.currentThread().getName() );

        System.out.println("1");

        Thread t1 = new Thread(){ public void run() { System.out.println("2");  } };
        t1.start();

        t1.join(); // main thread waits for t1 to finish!

        System.out.println("3");

        Thread t2 = new Thread(){ public void run() { System.out.println("4"); } };
        t2.start();

        t2.join(); // main thread waits for t2 to finish!

        System.out.println("5");

        System.out.println("6");

    }

}
