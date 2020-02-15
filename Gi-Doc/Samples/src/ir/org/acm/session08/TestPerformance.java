package ir.org.acm.session08;

public class TestPerformance {

    public static void main(String[] args) {

        int a = 0;

        long start = System.currentTimeMillis();

        for (int i=0; i < 100_000; i++)
            a++;
            //System.out.println(".");

        long end = System.currentTimeMillis();

        System.out.println( end-start );

    }

}
