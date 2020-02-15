package ir.org.acm.session14.stream;

import java.util.function.Function;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {

        Function f;

        Stream.of(1.5, 2.5, 3.5)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "acm" + i)
                .forEach(System.out::println);

    }

}
