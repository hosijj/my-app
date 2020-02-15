package ir.org.acm.session07;

import java.math.BigDecimal;

public class TestBigDecimal {

    public static void main(String[] args) {

        // BigDecimal big = new BigDecimal("123");

        BigDecimal big = new BigDecimal(10);

        BigDecimal veryBig  = big.pow(10);

        int num = veryBig.intValue();

        System.out.println( veryBig );

    }

}
