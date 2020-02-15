
package ir.org.acm.session31.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class CounterView5MouseListener extends JFrame {
    
    private JTextField field = new JTextField(10);
    private JButton bt = new JButton("+");
    private int counter;

    public static void main(String[] args) {
        new CounterView5MouseListener().initialize();
    }
    
    public void initialize() {
        
        bt.addMouseListener( new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                counter++;
                field.setText(Integer.toString(counter));
            }

            public void mousePressed(MouseEvent e) {}

            public void mouseReleased(MouseEvent e) {}

            public void mouseEntered(MouseEvent e) {}

            public void mouseExited(MouseEvent e) {}
            
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


