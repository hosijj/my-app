package ir.org.acm.session21.thread.telsynch;

public class TelHandSet {
    
    public synchronized void dial(String name) {

        System.out.println(name + " is dialing...");
        try { Thread.sleep(2*1000); } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(name + " is hanging...");
        
    }
    
}
