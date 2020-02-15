package ir.org.acm.session05;

public class TestVarArgs {

    public static void main(String[] args) {

        sayHello("A");

        sayHello("B", "C");

        sayHello("D", "E", "F");

        //sayHello( new String[] {"D", "E", "F"} );

    }

    static void sayHello(String... names) {

        for (int i=0; i < names.length; i++)
            System.out.println("Hello " + names[i]);

    }

}
