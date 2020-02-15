package ir.org.acm.session13.multipleinheritance;

public interface Dog extends Animal {

    default void eat() {
        System.out.println("Eating bone...");
    }

    default void bark() {
        System.out.println("Dog is barking...");
    }

}
