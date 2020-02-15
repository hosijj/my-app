package ir.org.acm.session22.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO3ReadString {

    public static String basicRead() {

        int i;
        StringBuffer str = new StringBuffer();
        boolean done = false;
        while (!done) {
            try {
                i = System.in.read();
                if (i == -1 || (char)i == '\n') { //LF10
                    done = true;
                } else if ( (char)i != '\r' ) { //CR13
                    str.append( (char) i );
                }
            } catch (java.io.IOException e) {
                done = true;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) throws Exception  {

        BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
        System.out.print("What is your name?");
        String name = in.readLine();
        System.out.println("Hello " + name);

//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        System.out.print("What is your name?");
//        String name = sc.next();

    }

    
}

