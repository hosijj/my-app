package ir.org.acm.session30.gui;

import javax.swing.*;
import java.awt.*;

public class Sample04NullLayout {

    public static void main(String[] args) {

        JLabel label = new JLabel("Number:");
        label.setBounds(30, 30, 100, 30);

        JTextField field = new JTextField(10);
        field.setBounds(90, 30, 100, 30);

        JButton bt = new JButton("Find");
        bt.setBounds(30, 90, 100, 30);

        JFrame frame = new JFrame();
        frame.setLayout(null);
        Container con = frame.getContentPane();
        con.add(label);
        con.add(field);
        con.add(bt);

        frame.setSize(220, 220);
        frame.setResizable(false);
        frame.setTitle("Sample 4");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }
}
