
package ir.org.acm.session20.thread;

public class T05TestHumanRunnable2 {
    
    public static void main(String[] args) {
      
        new Thread( new T04HumanRunnable("Ali") ).start();

        new Thread( new T04HumanRunnable("Reza") ).start();
        
        new Thread( new T04HumanRunnable("Hassan") ).start();
        
    }

}
