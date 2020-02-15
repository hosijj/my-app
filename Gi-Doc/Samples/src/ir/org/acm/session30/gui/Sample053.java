package ir.org.acm.session30.gui;

import java.awt.FlowLayout;
import javax.swing.*;

public class Sample053 extends JFrame {
    
    private JLabel label = new JLabel("Number:");
    private JTextField field = new JTextField(10);
    private JButton bt = new JButton("Find");
    
    public static void main(String[] args) {
        
        new Sample053().initialize();
        
    }
    
    public void initialize() {
        
        JPanel panel = new JPanel();
        panel.setLayout( new FlowLayout() );
        panel.add(label);
        panel.add(field);
        panel.add(bt);
        
        getContentPane().add( panel );

        setSize(200, 200);
        setTitle("Sample 53");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }
    
}
