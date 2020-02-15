package ir.org.acm.session10.composition;

public class C {

    private A a = new A();
    private B b = new B();

    int f3;

    public C() {
        System.out.println("An object of C is created!");
    }

    public void m1() {
        a.m1();
    }

    public void m2() {
        b.m2();
    }

    public void m3() {}

    static void staticMethod() { B.staticMethod(); }

}
