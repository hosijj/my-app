package ir.org.acm.session19.dependencyinjection;

public class BankClient {

    // private ITransferService service = new MellatImpl();

    // private ITransferService service = Factory.getBank();

    @Autowired(id="bank")
    private ITransferService service;
    
    public ITransferService getService() {
        return service;
    }

    public void setService(ITransferService service) {
        this.service = service;
    }
    
    public void transfer(long cardNumber, double amount){
        System.out.println("Before transfer...");
        service.transfer(cardNumber, amount);
        System.out.println("After transfer...");
    }
    
}
