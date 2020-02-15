package ir.org.acm.session31.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CounterView3Anonymous extends JFrame {
    
    private JTextField field = new JTextField(10);
    private JButton bt = new JButton("+");
    private int counter;

    public static void main(String[] args) {
        new CounterView3Anonymous().initialize();
    }
    
    public void initialize() {
        
        bt.addActionListener( new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                counter++;
                field.setText(Integer.toString(counter));
            }

        } );
        
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

