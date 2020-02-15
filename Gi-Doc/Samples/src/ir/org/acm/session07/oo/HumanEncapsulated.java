package ir.org.acm.session07.oo;

public class HumanEncapsulated {

    private int age;

    public int readAge() { // Accessor
        return age;
    }

    public void writeAge(int a) { // Mutator
        // if a<0 ????
        age = a;
    }

}




