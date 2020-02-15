package ir.org.acm.session32.mvc;

import java.awt.event.*;

public class CounterController implements ActionListener {

    private CounterModel model;
    private CounterView view;

    public CounterController(CounterModel model, CounterView view) {
        this.model = model;
        this.view = view;
        view.setController(this);
        model.addObserver(view);
    }
    
    public void actionPerformed(ActionEvent e) {

        char key = e.getActionCommand().trim().charAt(0);
        
        switch (key) {
            case '+': model.increase();
                break;
            case '-': model.decrease();
                break;
        }

    }

}
