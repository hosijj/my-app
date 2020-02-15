
package ir.org.acm.session20.thread;

public class T07AnonymousThread {
    
    public static void main(String[] args) {
        
        System.out.println("Main");
        
        new Thread() {
            public void run() {
                System.out.println("Anonymous");
            }
        }.start();
        
        new Thread( () -> System.out.println("Lambda") ).start();
        
    }

}
