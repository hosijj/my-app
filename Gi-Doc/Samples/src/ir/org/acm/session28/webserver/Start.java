package ir.org.acm.session28.webserver;

public class Start {

    // You need to have www dir with files

    public static void main(String[] args) {
        
        WebServer wws = new WebServer(80);
        wws.start();
        
    }
    
}
