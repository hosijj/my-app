
package ir.org.acm.session09.singleton;

// Singleton Design Pattern
public final class God { // Lazy

    // fields
    // method

    private God() { }
    
    private static God instance = null;
    
    public static God getInstance() {
        if (instance == null)
            instance = new God();
        return instance;
    }

}
