package ir.org.acm.session10.inheritance;

public class TestPolymorphism {

    void m(A a) {
        a.m1();
    }

    public static void main(String[] args) {

        TestPolymorphism obj = new TestPolymorphism();

        // Type 2: sub-typing Polymorphism (Inclusion Polymorphism)

        obj.m( new A() );
        obj.m( new B() );
        obj.m( new C() );

        C c = new C();
        A a = c;
        B b = c;

    }

}
