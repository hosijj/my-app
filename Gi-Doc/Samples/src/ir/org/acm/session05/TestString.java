package ir.org.acm.session05;

public class TestString {

    public static void main(String[] args) {

        String str = new String("ABC");

        String s = "ABC";
        s = s + "D";

        StringBuffer sb = new StringBuffer("ABC");
        System.out.println( sb.length() ); // 3
        System.out.println( sb.capacity() ); // 3+16=19

        StringBuffer sb2 = new StringBuffer();
        sb2.append("ABC");
        System.out.println(sb2.length()); // 3
        System.out.println(sb2.capacity() ); // 16

        StringBuffer sb3 = new StringBuffer(50);
        sb3.append("ABC");
        System.out.println(sb3.length()); // 3
        System.out.println(sb3.capacity() ); // 50

        String compact = sb3.toString();
        sb3.trimToSize(); // reduce to actual size

    }

}
