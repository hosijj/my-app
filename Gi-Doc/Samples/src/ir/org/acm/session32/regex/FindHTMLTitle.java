package ir.org.acm.session32.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindHTMLTitle {
    
    public static void main(String[] args) throws Exception {
        

//        String s = "sghdgsd<title>MY</title>jhdjsdhj";
//        Scanner fileSc = new Scanner(s).useDelimiter("</*title>");
//        fileSc.next(); // sghdgsd
//        System.out.println( fileSc.next() ); // MY

        
        /*
          String s = "sghdgsd<title>MY</title>jhdjsdhj";
          Scanner fileSc = new Scanner(s);  
          Pattern p = Pattern.compile("<title>(.*?)</title>");
          System.out.println(fileSc.findWithinHorizon(p,in.available()));
        */
   
        String s = "hghjds<title>MY</title>dfdf";
        Pattern p = Pattern.compile("<title>(.*?)</title>"); // Any character, once or not at all, zero or more times
        Matcher m = p.matcher(s);
        if ( m.find() )
            System.out.println( m.group(1) );
        
    }
    
}
