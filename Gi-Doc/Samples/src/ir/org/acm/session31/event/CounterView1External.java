package ir.org.acm.session31.event;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class CounterView1External extends JFrame {

    private JTextField field = new JTextField(10);
    private JButton bt = new JButton("+");
    private int counter;

    public static void main(String[] args) {
        new CounterView1External().initialize();
    }

    public void initialize() {

        //CounterActionHandler handler = new CounterActionHandler();

        // handler.setForm(this);

        bt.addActionListener( new CounterActionHandler() );

        setLayout(new FlowLayout());
        Container con = getContentPane();
        con.add(field);
        con.add(bt);
        setSize(200, 200);
        setTitle("Counter");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

}

