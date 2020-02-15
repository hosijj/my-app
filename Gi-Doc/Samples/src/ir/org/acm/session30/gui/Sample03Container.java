package ir.org.acm.session30.gui;

import java.awt.Container;
import javax.swing.*;

public class Sample03Container {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        JTextArea text = new JTextArea();

        Container con = frame.getContentPane();
        con.add(text);

        //frame.getContentPane().add(text);

        frame.setSize(200, 200);
        frame.setTitle("Sample 3");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }
    
}
