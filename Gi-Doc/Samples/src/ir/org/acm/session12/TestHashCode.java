package ir.org.acm.session12;

// VM Option --> -XX:hashCode=3

public class TestHashCode {

    public static void main(String[] args) {

        for(int i=0; i<10; i++) {

            Object o = new Object();

            System.out.println( o.hashCode() );
            System.out.println( o.toString() );

        }

    }

}

/*

Without -XX:hashCode=3

21685669
2133927002
1836019240
325040804
1173230247
856419764
621009875
1265094477
2125039532
312714112

*/

/*

With -XX:hashCode=3

44
45
46
47
48
49
50
51
52
53

*/
