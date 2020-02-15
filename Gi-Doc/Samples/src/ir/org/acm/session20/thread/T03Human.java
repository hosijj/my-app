
package ir.org.acm.session20.thread;

public class T03Human {
    
    String name;

    public T03Human(String name) {
        this.name = name;
    }
    
    void eat() {
        System.out.println(name + " is eating...");
    }
    
    void walk() {
        System.out.println(name + " is walk...");
    }

    void talk() {
        System.out.println(name + " is talk...");
    }

}
