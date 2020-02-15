package ir.org.acm.session13.multipleinheritance;

public class CatDog implements Cat, Dog {

    @Override
    public void eat() {

        Cat.super.eat();

        //Dog.super.eat();

        //System.out.println("Milk + Bone");

    }

    public void miomio() {
        System.out.println("MioMio....");
    }

}
