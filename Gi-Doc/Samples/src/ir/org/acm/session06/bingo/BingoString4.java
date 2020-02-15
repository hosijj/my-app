package ir.org.acm.session06.bingo;

public class BingoString4 {

    public static void main(String[] args) {

        printStar("BINGO");

    }

    static void printStar(int index, String str) {

        if ( index == str.length()  ) return; // Be careful about StackOverflowError

        StringBuffer s = new StringBuffer(str);
        if ( index != -1)
            s = new StringBuffer(str).replace(index, index+1, "*");

        System.out.println(s);

        printStar( ++index, s.toString() );

    }

    static void printStar(String str) {

        printStar( -1, str );

    }

}
