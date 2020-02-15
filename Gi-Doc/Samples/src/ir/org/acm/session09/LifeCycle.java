package ir.org.acm.session09;

public class LifeCycle {

    static int s = sm();
    int f = m();

    public static int sm() {
        System.out.println("1: Initializing static fields...");
        System.out.println("   Running Static method sm()...");
        return 5;
    }

    static {
        System.out.println("2: Running Static Initialization Block...");
        System.out.println("   Class Loaded into JVM, But No Object!");
    }

    public int m() {
        System.out.println("3: Initializing non-static fields...");
        System.out.println("   Running Static method m()...");
        return 4;
    }

    {
        System.out.println("4: Running Initialization Block...");
        System.out.println("   Object was created!");
    }

    public LifeCycle() {
        System.out.println("5: Running Constructor...");
        System.out.println("   (The version that user called)");
    }
    
    public void m1() {
        System.out.println("6: Running method m1()...");
    }


    protected void finalize() throws Throwable {
        System.out.println("7: Running Finalize...");
        System.out.println("   GC called finalize() and is going to reclaim the object from Heap");
    }
    
}
