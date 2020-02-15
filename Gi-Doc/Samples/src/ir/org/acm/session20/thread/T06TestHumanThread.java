
package ir.org.acm.session20.thread;

public class T06TestHumanThread {
    
    public static void main(String[] args) {
        
        new T06HumanThread("Ali").start();

        new T06HumanThread("Reza").start();

        new T06HumanThread("Hassan").start();
        
    }

}
