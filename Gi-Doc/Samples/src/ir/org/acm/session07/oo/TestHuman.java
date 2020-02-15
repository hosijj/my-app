package ir.org.acm.session07.oo;

public class TestHuman {

    public static void main(String[] args) {

        Human ali = new Human();
        ali.age = -1; // Invalid
        ali.weight = 70;
        ali.height = 180;

        ali.eat();

    }

}
