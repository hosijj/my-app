package ir.org.acm.session31.gui;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileChooser extends JFrame {

    private JButton button = new JButton("Add Photo");
    private JTextField text = new JTextField(30);
    private int counter = 0;
    private String fileName;

    FileChooser() {
        button.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(null);
                if(returnVal == JFileChooser.APPROVE_OPTION) {
                    fileName = chooser.getCurrentDirectory() + "/" +
                            chooser.getSelectedFile().getName();
                    text.setText(fileName);
                }
            }
        });

         
         JPanel panel = new JPanel();
         panel.add(button);
         panel.add(text);
         getContentPane().add(panel);
         setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
         setSize(200,200);
         setVisible(true);

    }

    public static void main(String[] args) {
        new FileChooser();
    }

}