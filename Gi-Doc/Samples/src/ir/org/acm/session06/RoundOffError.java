package ir.org.acm.session06;

public class RoundOffError {

    public static void main(String[] args) {
        //m();
        //m0();
        //m1();
        m2();
    }
    
    static void m() {
        System.out.println("1 / 7 as double is " + 1/7d);
        System.out.println("1 / 7 as float is " + 1/7f);
        System.out.printf("Round off error = %1.30f \n" , (1/7f - 1/7d) );
    }
    
    static void m0() {
        float a = 0.7f;
        float x = a + 0.1f;
        System.out.println("0.7 + 0.1 = " + x);
        System.out.printf("%f\n" , x);
    }
    
    static void m1() {
        double a = 0.7;
        double x = a + 0.1;
        System.out.println("0.7 + 0.1 = " + x);
        System.out.println("0.7 + 0.1 = " + (float)x);
        System.out.printf("%f\n" , x);
        
    }
    
    static void m2() {
        double a = 0.7;
        double b = 0.9;
        double x = a + 0.1;
        double y = b - 0.1;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x == y);
        System.out.println( Math.abs(x - y) < 0.0001 );
    }

}
