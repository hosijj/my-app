package ir.org.acm.session31.gui;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class JTableDemo2 {

    public JTableDemo2() {

        TableModel dataModel = new AbstractTableModel() {
            public int getColumnCount() { return 10; }
            public int getRowCount() { return 10;}
            public Object getValueAt(int row, int col) { return new Integer(row*col); }
        };

        JTable table = new JTable(dataModel);
        JFrame frame = new JFrame("JTable Demo");
        frame.add(new JScrollPane(table));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,200);
        frame.setVisible(true);

    }


    public static void main(String[] args) {
        JTableDemo2 demo = new JTableDemo2();
    }



}
