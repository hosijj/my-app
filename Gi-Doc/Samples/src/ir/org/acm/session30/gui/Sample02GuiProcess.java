package ir.org.acm.session30.gui;

import javax.swing.*;

public class Sample02GuiProcess {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        frame.setSize(200, 200);
        frame.setTitle("Sample 1");

        frame.setVisible(true); // Ask OS to show

        frame.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE );

        //try { Thread.sleep(3*1000); } catch(Exception e) { e.printStackTrace(); }
        //frame.dispose(); // Ask OS to release resources

        System.out.println("End of Main Thread...");
        
    }
    
    /*
     java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
                JFrame f = new JFrame();
                f.setVisible(true);
            }
        });
    */
    
}
