package ir.org.acm.session32.mvc;

import javax.swing.*;
import java.util.*;

public class CounterView extends JFrame implements Observer {

    private JButton plusButton = new JButton("+");
    private JButton minusButton = new JButton("-");
    private JTextField text = new JTextField(10);

    CounterView() {
        text.setText("0");
        text.setEditable(false);
        JPanel panel = new JPanel();
        panel.add(plusButton);
        panel.add(minusButton);
        panel.add(text);
        getContentPane().add(panel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
    }

    public void update(Observable o, Object arg) {
        text.setText(((Integer)arg).toString());
    }

    public void setController(CounterController controller) {
        plusButton.addActionListener(controller);
        minusButton.addActionListener(controller);
    }
    
}
