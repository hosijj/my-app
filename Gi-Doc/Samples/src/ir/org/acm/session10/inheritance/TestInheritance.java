package ir.org.acm.session10.inheritance;

public class TestInheritance {

    public static void main(String[] args) {

//        A ref1 = new C();
//        B ref2 = new C();

        C ref3 = new C();

        ref3.m1();
        ref3.m2();
        ref3.m3();

        ref3.f1 = 1;
        ref3.f2 = 2;
        ref3.f3 = 3;


       B.staticMethod();

       C.staticMethod();

    }

}
