
package ir.org.acm.session28.webserver;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {
        
    private final int PORT ;
    
    public WebServer(int port ){
        this.PORT = port;
    }
    
    public void start(){
        
        ExecutorService executor = Executors.newCachedThreadPool();
        try {
            ServerSocket listener = new ServerSocket(PORT);
            while (true) {
                Socket incoming = listener.accept();
                executor.submit( new RequestHandler(incoming) );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
