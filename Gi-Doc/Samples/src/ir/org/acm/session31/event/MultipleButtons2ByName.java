package ir.org.acm.session31.event;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MultipleButtons2ByName extends JFrame implements ActionListener {

    private JButton button1 = new JButton("Say1");
    private JButton button2 = new JButton("Say2");
    private JButton button3 = new JButton("Say3");

    public static void main(String[] args) {
        new MultipleButtons2ByName().init();
    }

    public void init() {

        setLayout(new FlowLayout());
        button1.setName("s1");
        button2.setName("s2");
        button3.setName("s3");
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(button3);
        setSize(300, 300);
        setTitle("Say Hello");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String key = ((Component) e.getSource()).getName();

        switch (key) {
            case "s1":
                System.out.println("Say 1");
                break;
            case "s2":
                System.out.println("Say 2");
                break;
            case "s3":
                System.out.println("Say 3");
                break;
        }
    }
    
}
