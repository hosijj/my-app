package ir.org.acm.session09.staticSample;

public class TestMy {

    public static void main(String[] args) {

        My ref = new My();

//        ref.m(); // non-static
//
//        My.s(); // call s() without object
//
//        ref.s(); // call s() on the object

        //-----------------------------------

        My.sf = 1000;

        My obj1 = new My();
        My obj2 = new My();
        My obj3 = new My();

        System.out.println( obj1.sf );
        System.out.println( obj2.sf );
        obj2.sf = 5;
        System.out.println( obj3.sf );

    }

}
