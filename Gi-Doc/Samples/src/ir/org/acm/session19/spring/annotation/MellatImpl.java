package ir.org.acm.session19.spring.annotation;

import org.springframework.stereotype.Component;

@Component("bank1")
public class MellatImpl implements ITransfer {
    
    public boolean transfer(long cardNumber, double amount){
        
        System.out.println("Connecting to Melat Bank...");
        System.out.println(amount + " is tarnsfered to " + cardNumber);
        return true;
        
    } 
    
}
