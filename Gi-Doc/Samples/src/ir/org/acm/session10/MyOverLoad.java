package ir.org.acm.session10;

// Overloading Resolution Priority: A,B,C,D

public class MyOverLoad {
    
    void m(int a , int b) { System.out.println("A");  }

    void m(long a , long b) {
        System.out.println("B");
    }

    void m(Integer a , Integer b) {
        System.out.println("C");
    }

    void m(int... a) {
        System.out.println("D");
    }

    // Ambiguty, Phase 3
    // Compile-time error, reference to m is ambiguous
//    void m(Integer... a) {
//        System.out.println("E");
//    }

    
    public static void main(String[] args) {
        new MyOverLoad().m(1,2);
    }
//    public static void main(String[] args) {
//        new MyOverLoad().m( new int[] {1,2}  ); // to call arity method
//    }

}

/*

Overload Resolution (Compile-time)
-----------------------------------
If several applicable methods have been identified during one of the three phases
of applicability testing, then the most specific one is chosen.

Phase 1: performs without permitting boxing or unboxing conversion,
or the use of variable arity (...) method invocation.

Phase 2: performs overload resolution while allowing boxing and unboxing,
but still precludes the use of variable arity method invocation.

Phase 3: Allows overloading to be combined with variable arity methods, boxing,
and unboxing.

*/
