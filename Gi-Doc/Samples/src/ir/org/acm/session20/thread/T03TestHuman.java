
package ir.org.acm.session20.thread;

public class T03TestHuman {
    
    public static void main(String[] args) {
    
        // Single Threaded
        
        T03Human ali    = new T03Human("Ali");
        T03Human reza   = new T03Human("Reza");
        T03Human hassan = new T03Human("Hassan");
        
        ali.eat();     // blocks the flow of main thread for running eat()
        reza.talk();   // blocks the main thread for running
        hassan.walk(); // blocks the main thread for running
        
    }

}
