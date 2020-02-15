package ir.org.acm.session32.mvc;

public class CounterStart {
    
    public static void main(String[] args) {
        
        CounterModel model = new CounterModel();
        
        CounterView view = new CounterView();
        
        new CounterController(model, view);
        
    }
    
}
