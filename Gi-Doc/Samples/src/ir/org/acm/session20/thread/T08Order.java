package ir.org.acm.session20.thread;

public class T08Order { // non-deterministic

    public static void main(String[] args) {
        
        System.out.println("1");

        Thread t1 = new Thread(){ public void run() { System.out.println("2"); } };
        t1.start();
        
        System.out.println("3");

        Thread t2 = new Thread(){ public void run() { System.out.println("4"); } };
        t2.start();
        
        System.out.println("5");
        
        System.out.println("6");
        
    }
    
}
