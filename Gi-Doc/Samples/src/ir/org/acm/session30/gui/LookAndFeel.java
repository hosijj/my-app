package ir.org.acm.session30.gui;

import javax.swing.*;
import java.awt.*;

public class LookAndFeel extends JFrame {

    JTextField screen;
    JPanel mainPanel;
    JPanel keyPanel;

    LookAndFeel() {

        String metal = "javax.swing.plaf.metal.MetalLookAndFeel";
        String motif = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        String windows = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        String nimbus = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";

        try {
            UIManager.setLookAndFeel( motif );
        } catch (Exception e) {
            System.out.println(e);
        }

        screen = new JTextField();

        String[] keys = {"7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            ".", "0", "=", "/"};

        keyPanel = new JPanel();
        keyPanel.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 16; i++) {
            keyPanel.add(new JButton(keys[i]));
        }

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(screen, BorderLayout.NORTH);
        mainPanel.add(keyPanel, BorderLayout.CENTER);

        getContentPane().add(mainPanel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(200, 200);
        setTitle("Test Look and Feel");
        setVisible(true);

    }

    public static void main(String[] args) {

        LookAndFeel c = new LookAndFeel();

    }
    
}
