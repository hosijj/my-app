package ir.org.acm.session17.exception;

public class TestArray {

    public static void main(String[] args) {

        try {

            if (args == null) {
                System.out.println("args is null!");
                return;
            }

            String s = args[0];

            System.out.println(s);

        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
        
        System.out.println("edameh!");

    }

}
