package ir.org.acm.session28.repository;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;

public class Client {
    
    public static void main(String[] args) throws IOException {

        System.out.println("SimpleClient Code Started...");

        String ip = "127.0.0.1";
        int port = 1234;
        String downloadDir = "download";
        
        try (
            Socket socket = new Socket(ip, port);
            OutputStream socketOutputStream = socket.getOutputStream();
            InputStream socketInputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(socketInputStream);
        ){

            System.out.println("Sending mop.xml file to server");

            Files.copy( new File("mop.xml").toPath(), socketOutputStream);

            socketOutputStream.flush();
            socket.shutdownOutput();
            
            int filesCount = dataInputStream.readInt();
            File[] files = new File[filesCount];
            
            System.out.println("Getting the files:");
            
            for (File file: files) {

                long fileLength = dataInputStream.readLong();
                String fileName = dataInputStream.readUTF();

                file = new File(downloadDir + "/" + fileName);
                file.getParentFile().mkdirs();
                
                System.out.println("File name: " + fileName);
                
                try (
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    OutputStream ouputStream = fileOutputStream;
                ){
                    for(int j = 0; j < fileLength; j++){
                        ouputStream.write( socketInputStream.read() );
                    }
                }

            }
            
            System.out.println("Saved " + filesCount + " in " + downloadDir + " directory.");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
