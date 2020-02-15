package ir.org.acm.session23.io;

public class TestIoOverhead {

    public static void main(String[] args) {

        int num=0;

        long start = System.currentTimeMillis();

        for (int i=0; i<1_000_000; i++) {
            num++;
            System.out.print(".");
        }

        long end = System.currentTimeMillis();

        System.out.println( end-start );

    }


}
