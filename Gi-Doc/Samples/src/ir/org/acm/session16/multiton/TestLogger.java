package ir.org.acm.session16.multiton;

public class TestLogger {

    public static void main(String[] args) {

        // new MultitonLogger(); // NO!

        MultitonLogger log1 = MultitonLogger.getLogger("");
        MultitonLogger log2 = MultitonLogger.getLogger("a");
        MultitonLogger log3 = MultitonLogger.getLogger("a");
        MultitonLogger log4 = MultitonLogger.getLogger("b");
        MultitonLogger log5 = MultitonLogger.getLogger("");

        System.out.println( log1.hashCode() );
        System.out.println( log2.hashCode() );
        System.out.println( log3.hashCode() );
        System.out.println( log4.hashCode() );
        System.out.println( log5.hashCode() );

    }

}
