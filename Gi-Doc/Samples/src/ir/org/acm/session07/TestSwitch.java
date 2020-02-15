package ir.org.acm.session07;

public class TestSwitch {

    public static void main(String[] args) {

        String name = "Java";

        switch(name) {

            case "ACM"     : System.out.println("1");
                             break;
            case "Java"    : System.out.println("2");
                             break;
            case "Gosling" : System.out.println("3");
                             break;
            default        : System.out.println("4");

        }

    }

}
