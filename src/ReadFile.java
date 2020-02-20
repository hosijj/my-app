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
        String proximalLes;
        String digitalLes;
        String lesLength;
        String esophagealLength;
        String pip;
        String intraabdominalLesLength;
        String hiatalHernia;
        String basalRespiratoryMin;
        String basalRespiratoryMean;
        String residualMean;
        String residualHighest;
        String percentRelaxation;
        String location;
        String meanBasalPressure;
        String meanResidualPressure;
        String relaxationTimeToNadir;
        String relaxationDuration;

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
            String genderParagraph =  templateDoc.getParagraphs().get(14).getRuns().get(1).getText(0);


            patientName = hrmDoc.getTables().get(0).getRow(0).getCell(0).getParagraphs().get(1).getText();
            gender = hrmDoc.getTables().get(0).getRow(0).getCell(2).getText();
            proximalLes = hrmDoc.getTables().get(2).getRow(2).getCell(1).getText();
             digitalLes = hrmDoc.getTables().get(2).getRow(3).getCell(1).getText();
             lesLength = hrmDoc.getTables().get(2).getRow(4).getCell(1).getText();
             esophagealLength = hrmDoc.getTables().get(2).getRow(5).getCell(1).getText();
             pip = hrmDoc.getTables().get(2).getRow(6).getCell(1).getText();
             intraabdominalLesLength = hrmDoc.getTables().get(2).getRow(7).getCell(1).getText();
             hiatalHernia = hrmDoc.getTables().get(2).getRow(8).getCell(1).getText();
             basalRespiratoryMin = hrmDoc.getTables().get(2).getRow(11).getCell(1).getText();
             basalRespiratoryMean = hrmDoc.getTables().get(2).getRow(12).getCell(1).getText();
             residualMean = hrmDoc.getTables().get(2).getRow(13).getCell(1).getText();
             residualHighest = hrmDoc.getTables().get(2).getRow(14).getCell(1).getText();
             percentRelaxation = hrmDoc.getTables().get(2).getRow(15).getCell(1).getText();
             location = hrmDoc.getTables().get(2).getRow(28).getCell(1).getText();
             meanBasalPressure = hrmDoc.getTables().get(2).getRow(29).getCell(1).getText();
             meanResidualPressure = hrmDoc.getTables().get(2).getRow(30).getCell(1).getText();
             relaxationTimeToNadir = hrmDoc.getTables().get(2).getRow(31).getCell(1).getText();
             relaxationDuration = hrmDoc.getTables().get(2).getRow(32).getCell(1).getText();

            System.out.println("eeee   = " + templateDoc.getTables().get(2).getRow(2).getCell(1).getText());
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
                    genderParagraph = genderParagraph.replace("gender", "gentleman");
                }
                if (gender.equals("female")){
                    genderParagraph = genderParagraph.replace("gender", "lady");
                }
                templateDoc.getParagraphs().get(14).getRuns().get(1).setText(genderParagraph, 0);
            }
//                  *****************************   hrm table **************************************

             templateDoc.getTables().get(2).getRow(2).getCell(1).removeParagraph(0);
             templateDoc.getTables().get(2).getRow(2).getCell(1).setText(proximalLes);

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
