package ir.org.acm.session14.lambda;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {

        Function f1 = new Function() {
            @Override
            public Object apply(Object o) {
                return "Hello " + o;
            }
        };

        System.out.println( f1.apply("ACM") );

        //----------------------------------------------------

        Function f2 = (Object o) -> {
            return "Hello " + o;
        };

        System.out.println( f2.apply("ACM") );

        //----------------------------------------------------

        f( (Object o) -> { return "Hello " + o; } );

    }

    static void f(Function g) {
        g.apply("ACM");
    } // f(g(x))

}
