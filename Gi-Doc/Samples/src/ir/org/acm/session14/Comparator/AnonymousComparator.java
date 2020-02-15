package ir.org.acm.session14.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousComparator {
    
    public static void main(String[] args) {
        
        Human[] humanArray = {
            new Human(20,80,180),
            new Human(45,110,180),
            new Human(25,40,173)
        };
        
        //compare Age
        Arrays.sort(humanArray, new Comparator<Human>(){ // Anonymous class
            public int compare(Human o1, Human o2) {
                return o1.getAge()-o2.getAge();
            }
        });

    }
     
}
