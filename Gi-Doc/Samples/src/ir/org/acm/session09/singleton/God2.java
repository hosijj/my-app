
package ir.org.acm.session09.singleton;

public final class God2 { // Eager

    // fields
    // method

    private God2() { }
    
    private final static God2 instance = new God2();
    
    public static God2 getInstance() {
        return instance;
    }

}
