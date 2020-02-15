package ir.org.acm.session06.bingo;

public class BingoString1 {

    public static void main(String[] args) {

        new BingoString1().star("BINGO");

    }

    public void star(String str) {

        System.out.println(str);
        StringBuffer myStar = new StringBuffer("");
        for (int i=1; i <= str.length(); i++) {
            myStar.append("*");
            str = myStar + str.substring(i); // "unhappy".substring(2) returns "happy"
            System.out.println(str);
        }

    }

}
