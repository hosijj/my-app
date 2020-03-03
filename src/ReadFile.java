import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.*;
import org.apache.xmlbeans.impl.piccolo.io.FileFormatException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class ReadFile {
    public static void main(String[] args) throws InvalidFormatException, IOException {
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

       /* XWPFDocument doc = new XWPFDocument(OPCPackage.open("Template.docm"));

        for (XWPFTable tbl : doc.getTables()) {
            for (XWPFTableRow row : tbl.getRows()) {
                for (XWPFTableCell cell : row.getTableCells()) {
                    for (XWPFParagraph p : cell.getParagraphs()) {
                        for (XWPFRun r : p.getRuns()) {
                            String text = r.getText(0);
//                            System.out.println(text);
                            if (text != null
                                    && text.contains("patientname")) {
                                System.out.println("Hello");
                                text = text.replace("patientname","hhhhhh");
                                r.setText(text, 0);
                            }
                            if (text != null
                                    && text.contains("value1")) {
                                System.out.println("Hello2");
                                text = text.replace("value1","hhhhhh");
                                r.setText(text, 0);
                            }


                        }
                    }
                }
            }
        }
        for (XWPFParagraph p : doc.getParagraphs()) {
            List<XWPFRun> runs = p.getRuns();
            if (runs != null) {
                for (XWPFRun r : runs) {
                    String text = r.getText(0);
                    if (text != null && text.contains("value1")) {
                        System.out.println("ooooy");
                        text = text.replace("value1", "haystack");
                        r.setText(text, 0);
                    }
                }
            }
        }
        doc.write(new FileOutputStream("temp2.docm"));*/


       /* int count = 0;
        XWPFDocument document = new XWPFDocument();
        XWPFDocument docx = new XWPFDocument(new FileInputStream("template.docm"));
        XWPFWordExtractor we = new XWPFWordExtractor(docx);
        String text2 = we.getText() ;
//        if(text2.contains("value1")){
            text2 = text2.replace("value1", "sms");
            System.out.println(text2);
//        }
        char[] c = text2.toCharArray();
        for(int i= 0; i < c.length;i++){

            if(c[i] == '\n'){
                count ++;
            }
        }
        System.out.println(c[0]);
        StringTokenizer st = new StringTokenizer(text2,"\n");

        XWPFParagraph para = document.createParagraph();
        para.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun run = para.createRun();
        run.setBold(true);
        run.setFontSize(36);
        run.setText("Apache POI works well!");

        List<XWPFParagraph>paragraphs = new ArrayList<>();
        List<XWPFRun>runs = new ArrayList<>();
        int k = 0;
        for(k=0;k<count+1;k++){
            paragraphs.add(document.createParagraph());
        }
        k=0;
        while(st.hasMoreElements()){
            paragraphs.get(k).setAlignment(ParagraphAlignment.LEFT);
            paragraphs.get(k).setSpacingAfter(0);
            paragraphs.get(k).setSpacingBefore(0);
            run = paragraphs.get(k).createRun();
            run.setText(st.nextElement().toString());
            k++;
        }

        document.write(new FileOutputStream("test2.docx"));*/

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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

        String numberOfSwallows;
        String peristaltic;
        String simultaneous;
        String failed;
        String meanWaveAmplitude;
        String meanWaveDuration;
        String doublePeakedWaves;
        String triplePeakedWaves;
        String velocity;
        String distalContracliteIntegralMean;
        String distalContracliteIntegralHighest;
        String contractileFrontVelocity;
        String intrabolusPressureLesr;
        String intrabolusPressureAvgMax;
        String distalLatency;
        String smallBreaks;

        try {
            XWPFDocument hrmDoc = new XWPFDocument(OPCPackage.open("HRM.docx"));
            XWPFDocument templateDoc = new XWPFDocument(OPCPackage.open("Template.docm"));

            /////////////////////////// for tables Start
//            System.out.println("Procedure date ===== >  " + templateDoc.getParagraphs().get(8).getText());
//            System.out.println(" Procedure ===== >  " + templateDoc.getParagraphs().get(9).getText());
//            System.out.println(" Indications ===== >  " + templateDoc.getParagraphs().get(10).getText());
//            System.out.println(" Dear Dr ===== >  " + templateDoc.getParagraphs().get(12).getText());


//            XWPFParagraph p = templateDoc.getTables().get(1).getRow(0).getCell(0).getParagraphs().get(1);
//            List<XWPFRun> r = p.getRuns();

//            String text = templateDoc.getTables().get(1).getRow(0).getCell(0).getParagraphs().get(1).getText();
            String genderParagraph = templateDoc.getParagraphs().get(14).getRuns().get(1).getText(0);
            String upperOseVl1 = templateDoc.getParagraphs().get(17).getRuns().get(2).getText(0);
            String upperOseVl2 = templateDoc.getParagraphs().get(17).getRuns().get(6).getText(0);
            System.out.println(" =====  >       " + templateDoc.getParagraphs().size());

            patientName = hrmDoc.getTables().get(0).getRow(0).getCell(0).getParagraphs().get(1).getText();
            gender = hrmDoc.getTables().get(0).getRow(0).getCell(2).getText();

         /*   proximalLes = hrmDoc.getTables().get(2).getRow(2).getCell(1).getText();
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

             //  ********************************  secondColumn
             numberOfSwallows = hrmDoc.getTables().get(2).getRow(1).getCell(4).getText();
             peristaltic = hrmDoc.getTables().get(2).getRow(3).getCell(4).getText();
             simultaneous = hrmDoc.getTables().get(2).getRow(4).getCell(4).getText();
             failed = hrmDoc.getTables().get(2).getRow(5).getCell(4).getText();
             meanWaveAmplitude = hrmDoc.getTables().get(2).getRow(7).getCell(4).getText();
             meanWaveDuration = hrmDoc.getTables().get(2).getRow(8).getCell(4).getText();
             doublePeakedWaves = hrmDoc.getTables().get(2).getRow(9).getCell(4).getText();
             triplePeakedWaves = hrmDoc.getTables().get(2).getRow(10).getCell(4).getText();
             velocity = hrmDoc.getTables().get(2).getRow(11).getCell(4).getText();
             distalContracliteIntegralMean = hrmDoc.getTables().get(2).getRow(13).getCell(4).getText();
             distalContracliteIntegralHighest = hrmDoc.getTables().get(2).getRow(14).getCell(4).getText();
             contractileFrontVelocity = hrmDoc.getTables().get(2).getRow(15).getCell(4).getText();
             intrabolusPressureLesr = hrmDoc.getTables().get(2).getRow(16).getCell(4).getText();
             intrabolusPressureAvgMax = hrmDoc.getTables().get(2).getRow(17).getCell(4).getText();
             distalLatency = hrmDoc.getTables().get(2).getRow(19).getCell(4).getText();
             smallBreaks = hrmDoc.getTables().get(2).getRow(25).getCell(4).getText();*/


//            System.out.println("===  >    = " + templateDoc.getParagraphs().get(17).getRuns().get(2).getText(0));
//            XWPFRun t = templateDoc.getTables().get(2).getRow(2).getCell(1).getParagraphs().get(0).createRun().;
//            System.out.println("patient 22222    = " + doc2.getTables().get(1).getRow(0).getCell(0).getParagraphs().get(1).getText());


//             *************************      patient name    **********************************
          /*  if (text != null && text.contains("patientname")) {
                text = text.replaceAll("patientname", patientName);
                r.get(0).setText(text, 0);
                text = text.replaceAll("patientname", patientName);
                r.get(0).setText(text, 0);
            }*/
//                       *************************      gender    **********************************
          /*  if (genderParagraph.contains("gender")) {
                if (gender.equals("Male")){
                    genderParagraph = genderParagraph.replace("gender", "gentleman");
                }
                if (gender.equals("female")){
                    genderParagraph = genderParagraph.replace("gender", "lady");
                }
                templateDoc.getParagraphs().get(14).getRuns().get(1).setText(genderParagraph, 0);
            }*/
//                  *****************************   hrm table **************************************

        /*     templateDoc.getTables().get(2).getRow(2).getCell(1).removeParagraph(0);
//            templateDoc.getTables().get(2).getRow(2).getCell(1).addParagraph().createRun().setFontSize(3);
             templateDoc.getTables().get(2).getRow(2).getCell(1).setText(proximalLes);

            templateDoc.getTables().get(2).getRow(3).getCell(1).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(3).getCell(1).setText(lesLength);

            templateDoc.getTables().get(2).getRow(4).getCell(1).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(4).getCell(1).setText(esophagealLength);

            templateDoc.getTables().get(2).getRow(5).getCell(1).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(5).getCell(1).setText(intraabdominalLesLength);

            templateDoc.getTables().get(2).getRow(6).getCell(1).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(6).getCell(1).setText(hiatalHernia);


            templateDoc.getTables().get(2).getRow(9).getCell(1).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(9).getCell(1).setText(basalRespiratoryMin);


            templateDoc.getTables().get(2).getRow(10).getCell(1).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(10).getCell(1).setText(basalRespiratoryMean);


            templateDoc.getTables().get(2).getRow(11).getCell(1).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(11).getCell(1).setText(residualMean);


            templateDoc.getTables().get(2).getRow(14).getCell(1).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(14).getCell(1).setText(meanBasalPressure);


            templateDoc.getTables().get(2).getRow(15).getCell(1).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(15).getCell(1).setText(meanResidualPressure);

            //  ****************************************** second column
            templateDoc.getTables().get(2).getRow(1).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(1).getCell(4).setText(numberOfSwallows);

            templateDoc.getTables().get(2).getRow(3).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(3).getCell(4).setText(peristaltic);

            templateDoc.getTables().get(2).getRow(4).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(4).getCell(4).setText(simultaneous);

            templateDoc.getTables().get(2).getRow(5).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(5).getCell(4).setText(failed);

            templateDoc.getTables().get(2).getRow(7).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(7).getCell(4).setText(meanWaveAmplitude);

            templateDoc.getTables().get(2).getRow(8).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(8).getCell(4).setText(meanWaveDuration);

            templateDoc.getTables().get(2).getRow(9).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(9).getCell(4).setText(doublePeakedWaves);

            templateDoc.getTables().get(2).getRow(10).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(10).getCell(4).setText(triplePeakedWaves);

            templateDoc.getTables().get(2).getRow(11).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(11).getCell(4).setText(velocity);

            templateDoc.getTables().get(2).getRow(13).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(13).getCell(4).setText(distalContracliteIntegralMean);

            templateDoc.getTables().get(2).getRow(14).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(14).getCell(4).setText(contractileFrontVelocity);

            templateDoc.getTables().get(2).getRow(15).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(15).getCell(4).setText(intrabolusPressureLesr);

            templateDoc.getTables().get(2).getRow(16).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(16).getCell(4).setText(intrabolusPressureAvgMax);

            templateDoc.getTables().get(2).getRow(18).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(18).getCell(4).setText(distalLatency);

            templateDoc.getTables().get(2).getRow(19).getCell(4).removeParagraph(0);
            templateDoc.getTables().get(2).getRow(19).getCell(4).setText(smallBreaks);*/

///             /////////////////    UOS
            /*if (upperOseVl1 != null && upperOseVl1.contains("value1")) {
                if (Float.parseFloat(meanBasalPressure) > 104) {
                    upperOseVl1 = upperOseVl1.replaceAll("value1", "hypertensive");
                } else if (Float.parseFloat(meanBasalPressure) < 34) {
                    upperOseVl1 = upperOseVl1.replaceAll("value1", "hypotensive");
                } else {
                    upperOseVl1 = upperOseVl1.replaceAll("value1", "normotensive");
                }
                templateDoc.getParagraphs().get(17).getRuns().get(2).setText(upperOseVl1, 0);
            }
            if (upperOseVl2 != null && upperOseVl2.contains("value2")) {
                if (Float.parseFloat(meanResidualPressure) < 12) {
                    upperOseVl2 = upperOseVl2.replaceAll("value2", "complete relaxation");
                } else {
                    upperOseVl2 = upperOseVl2.replaceAll("value2", "incomplete relaxation");
                }
                templateDoc.getParagraphs().get(17).getRuns().get(6).setText(upperOseVl2, 0);
            }*/


            for (XWPFTable tbl : templateDoc.getTables()) {
                for (XWPFTableRow row : tbl.getRows()) {
                    for (XWPFTableCell cell : row.getTableCells()) {
                        for (XWPFParagraph p : cell.getParagraphs()) {
                            for (XWPFRun r : p.getRuns()) {
                                String text = r.getText(0);
                                if (text != null
                                        && text.contains("patientname")) {
                                    System.out.println("Hello");
                                    text = text.replace("patientname", patientName);
                                    r.setText(text, 0);
                                }



                            }
                        }
                    }
                }
            }
            for (XWPFParagraph p : templateDoc.getParagraphs()) {
                List<XWPFRun> runs = p.getRuns();
                if (runs != null) {
                    for (XWPFRun r : runs) {
                        String text = r.getText(0);
                        if (text != null && text.contains("value1")) {
                            System.out.println("ooooy");
                            text = text.replace("value1", "haystack");
                            r.setText(text, 0);
                        }
                    }
                }
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
