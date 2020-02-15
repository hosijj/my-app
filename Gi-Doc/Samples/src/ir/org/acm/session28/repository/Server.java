package ir.org.acm.session28.repository;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class Server {

    /*
    You need to have:
    1-/repository/*
    2-config.properties
    3-mop.xml
    */
    
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        System.out.println("Repository SimpleServer Started...");

        try(
            ServerSocket serverSocket = new ServerSocket(1234);
            Socket clientSocket = serverSocket.accept();
            InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        ){

            NonClosableInputStream nonCloseableStream = new NonClosableInputStream(inputStream);
            String[] groupIds = XmlHandler.parseXml(nonCloseableStream);
            
            ArrayList<String> directories = PropHandler.repoBrowser(groupIds);
            ArrayList<String> filePaths = getFilePaths(directories);
            
            dataOutputStream.writeInt( filePaths.size() );
            
            for (String path: filePaths){

                File file = new File(path);
                
                long length = file.length();
                dataOutputStream.writeLong(length);
                
                String p = file.getPath();
                
                dataOutputStream.writeUTF(p);

                try (
                    FileInputStream fis = new FileInputStream(file);
                    InputStream bis = fis;
                ) {
                    
                    int theByte;
                    while( (theByte = bis.read()) != -1 ){
                        outputStream.write(theByte);
                    }
                    
                }

            }
            
        }
        
    }
    
    private static ArrayList getFilePaths(ArrayList<String> directories){
    
        ArrayList<String> filePaths = new ArrayList();
        
        int j = 0;
        
        for (String directory: directories){
            
            File folder = new File(directory);
            File[] listOfFiles = folder.listFiles();
            
            for (File listOfFile : listOfFiles) {
                if (listOfFile.isFile()) {
                    
                    filePaths.add(directory + "/" + listOfFile.getName());
                }
            }

        }
        
        return filePaths;
    }

}