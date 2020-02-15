
package ir.org.acm.session13.proxy;

public class ServiceFactory {
    
    public static ITransfer getService() {
        
        //return new TransferServiceImpl();
        return new TransferProxy();
        
    }

}
