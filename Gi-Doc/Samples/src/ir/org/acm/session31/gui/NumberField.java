package ir.org.acm.session31.gui;

import javax.swing.*;
import javax.swing.text.*;

public class NumberField extends JTextField {

     public static void main(String[] args) {

        JFrame frame;
        frame = new JFrame();
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        NumberField text = new NumberField(10);
        JPanel panel = new JPanel();
        panel.add( text );
        frame.getContentPane().add(panel);
        frame.setVisible(true);

     }

     public NumberField(int cols) {
         super(cols);
     }

     protected Document createDefaultModel() {
         return new UpperCaseDocument();
     }

     static class UpperCaseDocument extends PlainDocument {

         public void insertString(int offs, String str, AttributeSet a)
             throws BadLocationException {

             if (str == null) {
                 return;
             }
             String num = "";
             char[] chars = str.toCharArray();
             for (int i = 0; i < chars.length; i++)
                 num += Character.isLetter(chars[i]) ? "" : chars[i];

             super.insertString(offs, num, a);
         }
     }
 }
