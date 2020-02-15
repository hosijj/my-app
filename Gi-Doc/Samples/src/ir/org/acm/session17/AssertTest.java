package ir.org.acm.session17;

class AssertTest {

    public static void main(String args[]) {

        for (int i=1; i < 10; i++) {

            assert i < 5 : "i should be less than 5" ;

            System.out.println("i is " + i);
        }

    }

}
