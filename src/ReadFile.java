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
        String patientName;
        String gender;

        try {
            XWPFDocument hrmDoc = new XWPFDocument(OPCPackage.open("HRM.docx"));
            XWPFDocument templateDoc = new XWPFDocument(OPCPackage.open("Template.docm"));

            /////////////////////////// for tables Start
//            System.out.println("Procedure date ===== >  " + templateDoc.getParagraphs().get(8).getText());
//            System.out.println(" Procedure ===== >  " + templateDoc.getParagraphs().get(9).getText());
//            System.out.println(" Indications ===== >  " + templateDoc.getParagraphs().get(10).getText());
//            System.out.println(" Dear Dr ===== >  " + templateDoc.getParagraphs().get(12).getText());


            XWPFParagraph p = templateDoc.getTables().get(1).getRow(0).getCell(0).getParagraphs().get(1);
            List<XWPFRun> r = p.getRuns();

            String text = templateDoc.getTables().get(1).getRow(0).getCell(0).getParagraphs().get(1).getText();
//            String genderParagraph =  templateDoc.getParagraphs().get(14).getText();
            String genderParagraph =  templateDoc.getParagraphs().get(14).getRuns().get(1).getText(0);


            patientName = hrmDoc.getTables().get(0).getRow(0).getCell(0).getParagraphs().get(1).getText();
            gender = hrmDoc.getTables().get(0).getRow(0).getCell(2).getText();

//            System.out.println("ppppppp   = " + hrmDoc.getTables().get(0).getRow(0).getCell(2).getText());
//            System.out.println("patient 22222    = " + doc2.getTables().get(1).getRow(0).getCell(0).getParagraphs().get(1).getText());


//             *************************      patient name    **********************************
            if (text != null && text.contains("patientname")) {
                text = text.replaceAll("patientname", patientName);
                r.get(0).setText(text, 0);
                text = text.replaceAll("patientname", patientName);
                r.get(0).setText(text, 0);
            }
//                       *************************      gender    **********************************
            if (genderParagraph.contains("gender")) {
                if (gender.equals("Male")){
                    System.out.println("gentleman");
                    genderParagraph = genderParagraph.replace("gender", "gentleman");
                }
                if (gender.equals("female")){
                    System.out.println("lady");
                    genderParagraph = genderParagraph.replace("gender", "lady");
                }
                templateDoc.getParagraphs().get(14).getRuns().get(1).setText(genderParagraph, 0);
            }


            templateDoc.write(new FileOutputStream("Template2.docm"));


            /////////////////////////// for tables Start End

            /////////////////////  for images Start

           /* System.out.println("getting pictures .................... ");
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
*/
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
