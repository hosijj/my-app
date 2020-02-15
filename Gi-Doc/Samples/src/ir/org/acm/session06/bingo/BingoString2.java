package ir.org.acm.session06.bingo;

public class BingoString2 {

    public static void main(String[] args) {

        printStar("BINGO");

    }

    static void printStar(String str) {

        System.out.println(str);
        StringBuffer s = new StringBuffer(str);
        for (int i=0; i < str.length(); i++) {
            s.replace(i, i+1, "*");
            System.out.println(s);
        }

    }

}
