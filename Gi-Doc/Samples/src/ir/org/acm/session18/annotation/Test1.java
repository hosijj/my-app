package ir.org.acm.session18.annotation;

public class Test1 {
    
    @Good
    void m1() { 
        System.out.println("Running m1()....");
    }
    
    //@Expensive(value=1000)
    @Expensive(1000)
    //@Expensive
    void m2() {
        System.out.println("Running m2()...");
    }

    void m3() {
        System.out.println("Running m3()....");
    }
    
}
