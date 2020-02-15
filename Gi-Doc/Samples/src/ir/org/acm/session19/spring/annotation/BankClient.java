package ir.org.acm.session19.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bankClient")
public class BankClient {
    
    @Autowired
    @Qualifier("bank1")
    private ITransfer service;

    public ITransfer getService() {
        return service;
    }

    public void setService(ITransfer service) {
        this.service = service;
    }
    
    public void transfer(long cardNumber, double amount){
        service.transfer(cardNumber, amount);
    }
    
}
