package ir.org.acm.session14.Comparator;

import java.util.Comparator;

// For doubles...
public class CompareWeight implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {

        if (o1.getWeight() > o2.getWeight()) {

            return 1;

        } else if(o1.getWeight() == o2.getWeight()){

            return 0;

        } else {

            return -1;

        }
    }
    
}
