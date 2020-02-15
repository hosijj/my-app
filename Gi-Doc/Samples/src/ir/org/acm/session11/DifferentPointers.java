package ir.org.acm.session11;

import ir.org.acm.session10.inheritance.*;

public class DifferentPointers {

    public static void main(String[] args) {

        C ref3   = new C(); // Actual Object is C
        B ref2   = ref3; // upcast, implicit
        A ref1   = ref2; // upcast, implicit
        Object o = ref1; // upcast, implicit

        ( (C)o ).m3(); // Valid DownCast

        A p1   = new A();
       ((B)p1).m2(); // Invalid DownCast
       // at Runtime...
       // java.lang.ClassCastException: A cannot be cast to B

        m( "ABC" ) ;

    }

    static void m(Object obj) {

        ( (A) obj ).m1(); // Invalid DownCast
        // java.lang.ClassCastException: String cannot be cast to A

    }


}
