
package ir.org.acm.session13.proxy;

public class TransferProxy implements ITransfer {

    private ITransfer service = new TransferServiceImpl();
    
    public void transfer(int acc1, int acc2, long amount) {
        
        System.out.println("Start of Transaction...");
        
        service.transfer(acc1, acc2, amount); // call the target object method!
        
        System.out.println("Commit the Transaction...");
        
    }

}
