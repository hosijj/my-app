package ir.org.acm.session14.Comparator;

import java.util.Comparator;

// For Integers
public class CompareAge implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {
        
        return o1.getAge() - o2.getAge();

    }
    
}
