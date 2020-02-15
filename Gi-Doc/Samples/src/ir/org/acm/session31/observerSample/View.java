package ir.org.acm.session31.observerSample;

import java.util.Observable;
import java.util.Observer;

public class View implements Observer {

    private String name;

    public View(String name) {
        this.name = name;
    }
    
    public void update(Observable o, Object arg) {
        
        System.out.println(this.name + " I see the change: " + ((Model)o).getName() );
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
