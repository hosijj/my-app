package ir.org.acm.session26.socket;

import java.io.*;
import java.net.*;

public class SimpleClient {

    public static void main(String[] args) {

       Socket s;
       String ip = "127.0.0.1"; //"192.168.2.100"
       int port = 1234;

       try {
          s = new Socket(ip, port);
          InputStream is = s.getInputStream();
          System.out.println("Connected to server...");

          int num;
          while( (num = is.read()) != -1)
              System.out.printf("%c",num);
          is.close();
          s.close();

       } catch (IOException e) {
          e.printStackTrace();
       }

    }

 }
