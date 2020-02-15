package ir.org.acm.session31.gui;

import javax.swing.*;

public class JTableDemo1 {

    public JTableDemo1() {

        String[] columnNames = { "ID", "Title", "Description", "Price", "Inventory" };
        Object[][] cells = {
                                { "A-1234", "IBM ThinkPad", "lenovo T60p", 23456, 10 },
                                { "B-1234", "IBM ThinkPad", "lenovo T60p", 23456, 10 },
                                { "C-1234", "IBM ThinkPad", "lenovo T60p", 23456, 10 },
                                { "D-1234", "IBM ThinkPad", "lenovo T60p", 23456, 10 },
                                { "E-1234", "IBM ThinkPad", "lenovo T60p", 23456, 10 },
                                { "F-1234", "IBM ThinkPad", "lenovo T60p", 23456, 10 },
                            };

        JTable table = new JTable(cells, columnNames);

        JFrame frame = new JFrame("JTable Demo");
        frame.add(new JScrollPane(table));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,200);
        frame.setVisible(true);

    }


    public static void main(String[] args) {
            JTableDemo1 demo = new JTableDemo1();
    }


}
