
package ir.org.acm.session28.webserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;


public class RequestHandler implements Runnable {
    
    Socket socket;
    
    public RequestHandler( Socket socket ){
        this.socket = socket ;
    }

    @Override
    public void run() {
        
        try {
            
            BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
            OutputStream out = socket.getOutputStream();
            
            System.out.println("request-from : " + socket.getInetAddress());
            
            Respond respond = new Respond();
            respond.createHttpResponse( in.readLine() , out );
            
            in.close();
            out.close();
            socket.close();
            
            System.out.println("closed");
            System.out.println("===============================");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
