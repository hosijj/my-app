package ir.org.acm.session31.event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MultipleButtons1ByCaption extends JFrame {
    
    private JButton button1 = new JButton("Say1");
    private JButton button2 = new JButton("Say2");
    private JButton button3 = new JButton("Say3");
    
    public static void main(String[] args) {
        new MultipleButtons1ByCaption().init();
    }
    
    public void init() {

        setLayout( new FlowLayout() );

        ActionListener listener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String key = e.getActionCommand(); // return text on the component
                switch(key) {
                    case "Say1": System.out.println("Say 1");
                        break;
                    case "Say2": System.out.println("Say 2");
                        break;
                    case "Say3": System.out.println("Say 3");
                        break;
                }
            }
        };
        
        button1.addActionListener(listener);
        //button1.setActionCommand("");
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        
        getContentPane().add( button1 );
        getContentPane().add( button2 );
        getContentPane().add( button3 );
        setSize(300, 300);
        setTitle("Say Hello");
        setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE  );
        setVisible(true);
    }
    
}
