package ir.org.acm.session26.socket;

import java.io.*;
import java.net.*;

public class FileClient {

    public static void main(String[] args) {

       byte[] block = new byte[32];
       int len;
       Socket s;
       String ip = "127.0.0.1"; //"192.168.2.103";
       int port = 1234;

       try {
          s = new Socket(ip, port);
          System.out.println("Downloading... please wait...");
          OutputStream os = new FileOutputStream("acm_download.pdf");
          InputStream is = s.getInputStream();
          while( (len = is.read(block)) != -1)
              os.write(block,0,len);
          is.close();
          s.close();
          os.close();
       } catch (IOException e) {
          e.printStackTrace();
       }

       System.out.println("Download is complete.");

    }

 }
