package ir.org.acm.session19.spring.annotation;

import org.springframework.stereotype.Component;

@Component("bank2")
public class MeliImpl implements ITransfer {
    
    public boolean transfer(long cardNumber, double amount){
        
        System.out.println("Connecting to Meli Bank...");
        System.out.println(amount + " is tarnsfered to " + cardNumber);
        return true;
        
    } 
    
}
