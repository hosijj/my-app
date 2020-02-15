package ir.org.acm.session06.bingo;

public class BingoString3 {

    public static void main(String[] args) {

        printStar("BINGO", -1);

    }

    static void printStar(String str, int index) {

        if ( index == str.length()  ) return; // Be careful about StackOverflowError

        StringBuffer s = new StringBuffer(str);
        if ( index != -1)
            s = new StringBuffer(str).replace(index, index+1, "*");

        System.out.println(s);

        printStar(  s.toString() , ++index );

    }

}
