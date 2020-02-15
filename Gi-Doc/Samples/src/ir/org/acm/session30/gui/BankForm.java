package ir.org.acm.session30.gui;

import javax.swing.*;
import java.awt.*;

public class BankForm extends JFrame {

    JLabel numberLabel = new JLabel("Number:");
    JTextField number = new JTextField(10);
    JLabel ownerLabel = new JLabel("Owner:");
    JTextField owner = new JTextField(10);
    JLabel balanceLabel = new JLabel("Balance:");
    JTextField balance = new JTextField(10);
    JButton view = new JButton("View");
    JButton save = new JButton("Save");
    JButton clear = new JButton("Clear");

    public void init() {

        JPanel panel1 = new JPanel( /*new FlowLayout(FlowLayout.LEFT)*/ );
        panel1.add( numberLabel );
        panel1.add( number );

        JPanel panel2 = new JPanel();
        panel2.add( ownerLabel );
        panel2.add( owner );

        JPanel panel3 = new JPanel();
        panel3.add( balanceLabel );
        panel3.add( balance );

        JPanel panel4 = new JPanel();
        panel4.add(view);
        panel4.add(save);
        panel4.add(clear);

        Container c = getContentPane();
        c.add(panel1);
        c.add(panel2);
        c.add(panel3);
        c.add(panel4);

        setTitle("Bank Form");
        setSize(250,200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout( new GridLayout(4,1) );
        setResizable(false);
        setVisible(true); // the last thing to do!

    }

    public static void main(String[] args) {

        new BankForm().init();

    }


}
