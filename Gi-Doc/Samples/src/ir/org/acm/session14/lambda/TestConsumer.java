package ir.org.acm.session14.lambda;

import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {

        Consumer c = System.out::print;

        c.accept("ACM");

        // System.out.print("ACM");

    }

    void x(Consumer c, String s) {

        c.accept( s );

        // System.out.print("ACM");

    }


}
