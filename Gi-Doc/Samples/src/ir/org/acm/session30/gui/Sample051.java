package ir.org.acm.session30.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class Sample051 {
    
    private JLabel label = new JLabel("Number:");
    private JTextField field = new JTextField(10);
    private JButton bt = new JButton("Find");
    
    public static void main(String[] args) {
        
        new Sample051().initialize();
        
    }
    
    public void initialize() {
        
        JFrame frame = new JFrame();
        frame.setLayout( new FlowLayout() );
        Container con = frame.getContentPane();
        con.add(label);
        con.add(field);
        con.add(bt);
        frame.setSize(200, 200);
        frame.setTitle("Sample 51");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }
    
}
