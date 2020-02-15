package ir.org.acm.session31.gui;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PasswordValidator extends JFrame {

    private JLabel label = new JLabel("Enter your password:");
    private JLabel label2 = new JLabel("");
    private JTextField field = new JTextField(20);
    private String regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})";

    public static void main(String[] args) {
        new PasswordValidator().initialize();
    }

    public void initialize() {

        field.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {

                String contents = field.getText();

                if (contents.matches(regexp)) {
                    field.setBackground(Color.GREEN);
                    label2.setText("Your password is strong enough.");
                } else {
                    field.setBackground(Color.RED);
                }

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        }
        );

        setLayout(new FlowLayout());
        Container con = getContentPane();
        con.add(label);
        con.add(field);
        con.add(label2);
        setSize(300, 200);
        setTitle("Password Validator");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }
}
