
package ir.org.acm.session13.proxy;

public class TransferServiceImpl implements ITransfer {

    public void transfer(int acc1, int acc2, long amount) {
        
        System.out.println("Transfering from " + acc1 + " to " + acc2);
        
    }
    
}
