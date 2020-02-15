package ir.org.acm.session14.stream;

import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("acm", "c4", "java", "c2"); // ArrayList

        myList  .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                //.map( (Object o) -> { return "Hello " + o; } )
                //.map( o -> "Hello " + o )
                //.map( s -> s.toUpperCase() )
                .sorted()
                .forEach(System.out::println);

    }

}
