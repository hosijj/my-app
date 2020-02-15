package ir.org.acm.session14.Comparator;

import java.util.Comparator;

// For Strings
public class CompareName implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {

        return o1.getName().compareTo(o2.getName());

    }
}
