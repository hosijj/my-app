package ir.org.acm.session30.gui;

import javax.swing.*;

public class ShowImage extends JFrame {

    ShowImage() {
         
         JLabel label = new JLabel( new ImageIcon("images/course.jpg") );
         JPanel panel = new JPanel();
         panel.add(label);
         getContentPane().add(panel);
         setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
         setSize(200,200);
         setVisible(true);

    }
    
    public static void main(String[] args) {
        new ShowImage();
    }

}