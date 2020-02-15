package ir.org.acm.session32.regex;

import java.util.regex.*;

public class SimpleSubstitutionTest {

    public static void main(String[] args) {

        String text = "Hello world. <br>";

        Pattern p = Pattern.compile("<br>", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        String result = m.replaceAll("<br />");

        System.out.println(result);

    }

}