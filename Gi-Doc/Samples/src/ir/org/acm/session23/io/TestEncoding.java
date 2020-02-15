package ir.org.acm.session23.io;

import java.net.URLEncoder;

public class TestEncoding {

    public static void main(String[] args) throws Exception {

        System.out.println( URLEncoder.encode("James Gosling", "UTF-8") ); // URL: James+Gosling
        System.out.println( URLEncoder.encode("James+Gosling", "UTF-8") ); // URL: James%2BGosling
        System.out.println( URLEncoder.encode("\"James Gosling\"", "UTF-8") ); // URL: %22James+Gosling%22

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
