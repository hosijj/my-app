
package ir.org.acm.session20.thread;

public class T04TestHumanRunnable {
    
    public static void main(String[] args) {
        
        T04HumanRunnable ali    = new T04HumanRunnable("Ali");
        T04HumanRunnable reza   = new T04HumanRunnable("Reza");
        T04HumanRunnable hassan = new T04HumanRunnable("Hassan");

//        Runnable ali    = new T04HumanRunnable("Ali");
//        Runnable reza   = new T04HumanRunnable("Reza");
//        Runnable hassan = new T04HumanRunnable("Hassan");

        Thread t1 = new Thread( ali );
        Thread t2 = new Thread( reza );
        Thread t3 = new Thread( hassan );
        
        t1.start(); // create OS thread & call ali.run()
        t2.start(); // create OS thread & call reza.run()
        t3.start(); // create OS thread & call hassan.run()

        // End of main & mainThread
        
    }
        
}
