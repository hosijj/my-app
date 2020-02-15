package ir.org.acm.session12.generics;

public class TestMethod {

    public static void main(String[] args) {

        Object[] list = { 1000, "ABC", new Object(), new int[0] };

        for( Object obj : list)
            m1(obj);

    }

    /*
    java.lang.Integer
    java.lang.String
    java.lang.Object
    [I
    */

    static void m1(Object o) {
        System.out.println( o.getClass().getName() );
    }

    <T> void m2(T o) {
        System.out.println( o.getClass().getName() );
    }

}
