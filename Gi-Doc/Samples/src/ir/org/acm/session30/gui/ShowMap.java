package ir.org.acm.session30.gui;

import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ShowMap {
    
    public static void main(String[] args) throws Exception {
       
        double x = 26.1;
        double y = 53.1;
        
        String url = "http://maps.googleapis.com/maps/api/staticmap?center=PersianGolf&zoom=6&size=600x300";
        url += "&markers=color:red%7Clabel:S%7C" + x + "," + y;
        System.out.println(url);

        BufferedImage image = ImageIO.read( new URL(url) );
        JLabel label = new JLabel( new ImageIcon( image ) );
        JFrame f = new JFrame();
        f.getContentPane().add(label);
        f.pack();
        f.setLocation(200,200);
        f.setVisible(true);
        
    }
    
}   
    