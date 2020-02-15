package ir.org.acm.session14.Comparator;

import java.util.Arrays;

public class LamdaComparator {
    
    public static void main(String[] args) {
        
        Human[] humanArray = {
            new Human(20,80,180),
            new Human(45,110,180),
            new Human(25,40,173)
        };
        
        //Compare Age
        Arrays.sort( humanArray,(Human o1, Human o2) -> {
            return o1.getAge() - o2.getAge();
        } );
        
    }
}
