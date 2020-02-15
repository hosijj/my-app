package ir.org.acm.session31.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleBrowser extends JFrame {

    private JButton btGo = new JButton("GO");
    private JPanel mainPanel = new JPanel();
    private JTextField jtfAddress = new JTextField();
    private JEditorPane editorPane = new JEditorPane();
    //private JDialog jDialog = new JDialog();
    private JToolBar jToolBar = new JToolBar();

    public static void main(String[] args) {
        new SimpleBrowser().init();
    }

    public void init() {

        mainPanel.setLayout(new BorderLayout());
        jToolBar.add(jtfAddress);
        btGo.setSize(50, 21);
        btGo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            editorPane.setPage(jtfAddress.getText());
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Invalid URL!");
                        }
                    }
                }).start();
            }
        });

        jtfAddress.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent evt) {

                try {
                    if (evt.getKeyCode() == 10) {
                        editorPane.setPage(new URL(jtfAddress.getText()));
                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        /*
         * editorPane.addHyperlinkListener(new HyperlinkListener() { public void
         * hyperlinkUpdate(HyperlinkEvent e) { if (e.getEventType() ==
         * EventType.ACTIVATED) { try { editorPane.setPage(e.getURL());
         * jtfAddress.setText(e.getURL().toString()); } catch (IOException ex) {
         * editorPane.setText("Not Found!\n" + ex.getMessage()); } } } });
         */

        jToolBar.add(btGo);
        mainPanel.add(jToolBar, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(editorPane), BorderLayout.CENTER);
        add(mainPanel);
        //setLocationRelativeTo(null);
        setSize(getMaximumSize());
        setTitle("Sample Browser");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}