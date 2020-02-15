package ir.org.acm.session14.Comparator;

import java.util.Arrays;

public class SortHumanArrays {

    public static void main(String[] args) {

        Human[] humanArray = {
                new Human(20,80,180),
                new Human(45,110,180),
                new Human(25,40,173)
        };

        Arrays.sort( humanArray, new CompareAge() );
        for (Human h : humanArray)
            System.out.println(h.getAge());

        Arrays.sort( humanArray, new CompareWeight() );
        for (Human h : humanArray)
            System.out.println(h.getWeight());

    }

}
