package ir.org.acm.session30.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class Sample05FlowLayout {
    
    public static void main(String[] args) {
        
        JLabel label = new JLabel("Number:");
        JTextField field = new JTextField(10);
        JButton bt = new JButton("Find");
       
        JFrame frame = new JFrame();
        frame.setLayout( new FlowLayout() );
        Container con = frame.getContentPane();
        con.add(label);
        con.add(field);
        con.add(bt);
        
        frame.setSize(200, 200);
        frame.setTitle("Sample 3");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }
    
}
