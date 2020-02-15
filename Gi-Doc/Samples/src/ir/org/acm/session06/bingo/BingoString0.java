package ir.org.acm.session06.bingo;

public class BingoString0 {

    public static void main(String[] args) {
        m("Bingo");
    }

    public static void m(String str) {
        for (int i = 0; i <= str.length(); i++) {
            if (i != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println(str.substring(i));
        }
    }

}
