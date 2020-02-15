
package ir.org.acm.session20.thread;

public class T06HumanThread extends Thread {
    
    String name;

    public T06HumanThread(String name) {
        this.name = name;
    }
    
    void eat() {
        System.out.println(name + " is eating...");
        delay(33);
    }
    
    void walk() {
        System.out.println(name + " is walk...");
        delay(50);
    }

    void talk() {
        System.out.println(name + " is talk...");
        delay(20);
    }
    
    @Override
    public void run() {
        
        for (;;) {
            eat();
            talk();
            walk();
        }
        
    }
    
    void delay(int delayTime) {
        
        try {
            Thread.sleep(delayTime);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        
    } 

}
