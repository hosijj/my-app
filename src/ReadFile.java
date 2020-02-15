import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Iterator;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws InvalidFormatException, IOException {
        System.out.println("Crawling started ... ");
        try {
            XWPFDocument doc = new XWPFDocument(OPCPackage.open("HRM.docx"));
            XWPFDocument doc2 = new XWPFDocument(OPCPackage.open("Template.docm"));

          /*  for (XWPFParagraph p : doc.getParagraphs()) {
//                System.out.println(p.getText());
                List<XWPFRun> runs = p.getRuns();
                if (runs != null) {
                    for (XWPFRun r : runs) {
                        String text = r.getText(0);
                        if (text != null && text.contains("Patient:")) {
//                            text = text.replace("jafari", "haystack");
                            System.out.println("yy");
//                            r.setText(text, 0);
                        }
                    }
                }
            }*/

            /////////////////////////// for tables Start


//            XWPFParagraph p = doc2.getTables().get(1).getRow(0).getCell(0).getParagraphs().get(1);
//            List<XWPFRun> r = p.getRuns();
//            System.out.println("patient name   = " + doc.getTables().get(0).getRow(0).getCell(0).getParagraphs().get(1).getText());
//            System.out.println("patient gender   = " + doc.getTables().get(0).getRow(0).getCell(2).getText());
//            System.out.println("patient 22222    = " + doc2.getTables().get(1).getRow(0).getCell(0).getParagraphs().get(1).getText());


//            String text = doc2.getTables().get(1).getRow(0).getCell(0).getParagraphs().get(1).getText();
//            System.out.println(text);
           /* if (text != null && text.contains("PName")) {
                System.out.println("HEre");
                text = text.replace("PName", "haystack");
                r.get(0).setText(text, 0);
                System.out.println("Done!");
            }*/


//            doc2.write(new FileOutputStream("Template2.docm"));


            /////////////////////////// for tables Start End

            /////////////////////  for images Start

            System.out.println("getting pictures .................... ");
            List<XWPFPictureData> piclist = doc.getAllPictures();
            Iterator<XWPFPictureData> iterator = piclist.iterator();

            int i = 0;

            while (iterator.hasNext()) {
                XWPFPictureData pic = iterator.next();
                byte[] bytepic = pic.getData();
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(bytepic));

                System.out.println(imag.getWidth());
                System.out.println(imag.getPropertyNames());

                if(imag.getWidth() == 1087)
                ImageIO.write(imag, "jpg", new File("imagesFromDocx/" + i + ".jpg"));
                i++;
            }
            System.out.println("=== " + i);
            /////////////////////  for images End

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
