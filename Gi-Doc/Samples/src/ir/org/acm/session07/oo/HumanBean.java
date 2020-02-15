package ir.org.acm.session07.oo;

public class HumanBean { // JavaBean

    private int age;

    public HumanBean() { } // 1-public no-argument constructor

    public int getAge() { // 2-Accessor, Getter
        return age;
    }
    // if field is boolean we use "is" instead of "get"


    public void setAge(int a) { // 3-Mutator, Setter
        age = a;
    }

}
