package ir.org.acm.session31.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuTest extends JFrame{

    public JMenuTest(){

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Greeting");
        JMenuItem menuItem = new JMenuItem("Say Hello");
        menu.add(menuItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
//               JDialog d = new JDialog(JMenuTest.this, "title", true);
//               d.setSize(100,100);
//               d.setVisible(true);
               JOptionPane.showMessageDialog(null, "Hello Dialog");
            }
        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(200,200);
        setVisible(true);

    }

    public static void main(String [] args){
        new JMenuTest();
    }

}