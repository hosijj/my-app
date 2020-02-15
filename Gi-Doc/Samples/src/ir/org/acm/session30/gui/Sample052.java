package ir.org.acm.session30.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class Sample052 extends JFrame {
    
    private JLabel label = new JLabel("Number:");
    private JTextField field = new JTextField(10);
    private JButton bt = new JButton("Find");
    
    public static void main(String[] args) {
        
        new Sample052().initialize();
        
    }
    
    public void initialize() {
        
        setLayout( new FlowLayout() );
        Container con = getContentPane();
        con.add(label);
        con.add(field);
        con.add(bt);
        setSize(200, 200);
        setTitle("Sample 52");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }
    
}
