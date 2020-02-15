package ir.org.acm.session06;

public class TestShift {
    
    public static void main(String[] args) {
        
        int num = -4;
        
        System.out.println( num >> 1 ); // -2 signed shift

        System.out.println( num >>> 1 ); // 2,147,483,646 unsigned shift (zero filled)

    }

}
