
package ir.org.acm.session20.thread;

public class T13ThreadCacheVolatile {
    
    public static void main(String[] args) {
        
        My m = new My();
        m.start();

        System.out.println("Thread starts and will be run while b is true");
        try { Thread.sleep(2*1000); } catch(Exception e) { e.printStackTrace(); }
        System.out.println("Now after 2 seconds we set f to false...");
        m.b = false;
        System.out.println("Conclusion: If b is volatile, thread will end!");
        System.out.println("But if b is not volatile, thread will not end!");
        System.out.println("(Because the b value is cached and do not see the change!)");
        
    }
    
}

class My extends Thread {
    
   public volatile boolean b = true;

   public void run() {
       while (b);
   }
  
}
