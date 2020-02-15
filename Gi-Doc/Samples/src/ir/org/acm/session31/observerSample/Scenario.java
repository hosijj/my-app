package ir.org.acm.session31.observerSample;

public class Scenario {
    
    public static void main(String[] args) {
        
        Model model = new Model("Model1");

        View view1 = new View("View1");
        View view2 = new View("View2");
        
        model.addObserver(view1);
        model.addObserver(view2);
        
        model.setField(9);
        
        // -------------------------
        
//        Model m2 = new Model("Model2");
//        m2.addObserver(v1);
//        m2.setField(321);
        
    }
    
}
