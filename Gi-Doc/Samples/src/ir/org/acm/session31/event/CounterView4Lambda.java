package ir.org.acm.session31.event;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class CounterView4Lambda extends JFrame {
    
    private JTextField field = new JTextField(10);
    private JButton bt = new JButton("+");
    private int counter;

    public static void main(String[] args) {
        new CounterView4Lambda().initialize();
    }
    
    public void initialize() {
        
        bt.addActionListener( 
            (ActionEvent e) -> {
                counter++;
                field.setText(Integer.toString(counter));
            }
         );
        
        setLayout( new FlowLayout() );
        Container con = getContentPane();
        con.add(field);
        con.add(bt);
        setSize(200, 200);
        setTitle("Counter");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    
}

