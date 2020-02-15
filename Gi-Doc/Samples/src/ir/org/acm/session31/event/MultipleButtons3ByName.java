package ir.org.acm.session31.event;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MultipleButtons3ByName extends JFrame {
    
    private JButton button1 = new JButton("Say1");
    private JButton button2 = new JButton("Say2");
    private JButton button3 = new JButton("Say3");
    
    public static void main(String[] args) {
        new MultipleButtons3ByName().init();
    }
    
    public void init() {

        setLayout( new FlowLayout() );
        
        MouseListener listener = new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                String key = e.getComponent().getName();

                switch(key) {
                    case "say1": System.out.println("Say 1");
                          break;
                    case "say2": System.out.println("Say 2");
                          break;
                    case "say3": System.out.println("Say 3");   
                          break;
                }
            }

        };
        
        button1.setName("say1");
        button2.setName("say2");
        button3.setName("say3");
        button1.addMouseListener(listener);
        button2.addMouseListener(listener);
        button3.addMouseListener(listener);
        
        getContentPane().add( button1 );
        getContentPane().add( button2 );
        getContentPane().add( button3 );
        setSize(300, 300);
        setTitle("Say Hello");
        setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE  );
        setVisible(true);
    }
    
}
