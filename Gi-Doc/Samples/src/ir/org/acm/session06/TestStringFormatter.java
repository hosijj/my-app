package ir.org.acm.session06;

public class TestStringFormatter {

    public static void main(String[] args) {

        // Data to print
        int a = 1;
        double b = 3.141582;
        String str = "ACM";

        // Data Format
        String format = "Integer=%d Float=%1.2f String=%5s \n ";  // a=1  b=3.14  s=  ACM

        //System.out.println( String.format(format, a , b, str) );
        // return new Formatter().format(format, args).toString();

        System.out.printf( format , a , b, str ); // a=1  b=3.14  s=  ACM

    }

}
