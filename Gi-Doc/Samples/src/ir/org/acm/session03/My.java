
package ir.org.acm.session03;

public class My {

    void m(int i) {
        System.out.println("Kill the project!");
    }

    void m(long i) {
        System.out.println("promote the project!");
    }

    public static void main(String[] args) {

        new My().m(10L);

    }

}
