
package ir.org.acm.session09.singleton;

public class TestGod {
    
    public static void main(String[] args) {

        God g1 = God.getInstance();
        God g2 = God.getInstance();
        
        if (g1 == g2) System.out.println("the same god");
        else System.out.println("2 gods!!!");

        God2 g3 = God2.getInstance();

        God3 g4 = God3.INSTANCE;

    }

}
