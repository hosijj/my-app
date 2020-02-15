package ir.org.acm.session22.io;

import java.io.*;

public class IO5WriteUtf8 {

    public static void main(String[] args) throws IOException {

        try {

            FileOutputStream f = new FileOutputStream("Farsi.txt");
            String encoding = "UTF8";
            BufferedWriter out = new BufferedWriter( new OutputStreamWriter(f , encoding) );
            out.write("سلام حال شما خوب است؟");
            out.close();
            System.out.println("Written Process Completed.");

        } catch (UnsupportedEncodingException ue) {
            System.out.println("Not supported : ");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}



