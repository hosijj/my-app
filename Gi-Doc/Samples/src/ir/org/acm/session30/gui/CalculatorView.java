package ir.org.acm.session30.gui;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {

    private JTextField screen;
    private JPanel mainPanel;
    private JPanel keyPanel;

    public void init() {

        JButton[] myButtons = new JButton[16];
        String[] keys = {"7", "8", "9", "+",
                         "4", "5", "6", "-",
                         "1", "2", "3", "*",
                         ".", "0", "=", "/"};
        
        keyPanel = new JPanel();
        keyPanel.setLayout( new GridLayout(4, 4) );
        for (int i = 0; i < 16; i++) {
            myButtons[i] = new JButton( keys[i] );
            keyPanel.add( myButtons[i] );
        }

        screen = new JTextField();

        mainPanel = new JPanel();
        mainPanel.setLayout( new BorderLayout() );
        mainPanel.add(screen, BorderLayout.NORTH);
        mainPanel.add(keyPanel, BorderLayout.CENTER);

        setTitle("Calculator");
        getContentPane().add( mainPanel );
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorView().init();
    }
    
}
