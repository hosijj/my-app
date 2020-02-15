
package ir.org.acm.session28.webserver;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Respond {

    public void createHttpResponse(String request , OutputStream out ) throws FileNotFoundException, IOException{
        
        File file ;
        byte[] block = new byte[256*1024];
        String[] requestArray = request.split(" ");
        System.out.println( "request-header : " + request);
        if( requestArray[1].equals("/") ){
            file = new File( "www/index.html" );
        } else {
            file = new File( "www" + requestArray[1] );
        }
        
        if( file.exists() ) {
            if( file.canRead() ){
                InputStream in = new BufferedInputStream( new FileInputStream(file) );
                out.write( "HTTP/1.1 200 OK \n".getBytes() );
                out.write( "SimpleServer: ACMServer \n".getBytes() );
                out.write( ("Content-Type: " + getContentType( requestArray[1] ) + " \n\n").getBytes() );
                int len = 0;
                while ((len = in.read(block)) != -1) 
                    out.write(block,0,len);
            } else {
                out.write( "HTTP/1.1 403 Forbidden \n".getBytes() );
                out.write( "SimpleServer: ACMServer \n".getBytes() );
            }
        } else {
            out.write( "HTTP/1.1 404 Not Found \n".getBytes() );
            out.write( "SimpleServer: ACMServer \n".getBytes() );
        }
        
    }
    
    public String getContentType( String source ){

        if( source.equals("/") || source.substring( source.length() - 1 ).equals("/") ){
            return "text/html";
        } else {
            String[] sourceArray = source.split("\\.");
            switch( sourceArray[sourceArray.length-1] ){
                case "jpg":
                    return "image/jpg";
                case "png":
                    return "image/png";
                case "gif":
                    return "image/gif";
                case "html":
                    return "txt/html";
                default:
                    return "text/html";
                
            }
            
        }
    }
    
}
