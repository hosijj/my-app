package ir.org.acm.session23.io;

import java.io.*;
import java.net.*;

public class YahooSearchAgent {
    
      public static void search(String word) {
           
        try {
            String query = "http://search.yahoo.com/search?p=" + URLEncoder.encode(word, "UTF-8");
            InputStream in = new URL(query).openStream();
            OutputStream out = new FileOutputStream(word + ".html");
            int ch;
            while ( (ch = in.read() ) != -1  )
                out.write( ch );
            in.close();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }


    public static void main(String[] args) {

        YahooSearchAgent.search("Java");

    }
    
}

/*
 When encoding a String, the following rules apply:

    The alphanumeric characters "a" through "z", "A" through "Z" and "0" through "9" remain the same.
    The special characters ".", "-", "*", and "_" remain the same.

    The space character " " is converted into a plus sign "+".

    All other characters are unsafe and are first converted into one or more bytes
    using some encoding scheme.
    Then each byte is represented by the 3-character string "%xy", where xy is the
    two-digit hexadecimal representation of the byte.
*/
