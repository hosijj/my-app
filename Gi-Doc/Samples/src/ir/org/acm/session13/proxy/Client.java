package ir.org.acm.session13.proxy;

public class Client {
    
    public static void main(String[] args) {
        
        ITransfer s = ServiceFactory.getService();
        
        s.transfer(1234, 1235, 500);
        
    }

}
