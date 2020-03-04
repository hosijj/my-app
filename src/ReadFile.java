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

//            XWPFParagraph p = templateDoc.getTables().get(1).getRow(0).getCell(0).getParagraphs().get(1);
//            List<XWPFRun> r = p.getRuns();

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
            smallBreaks = hrmDoc.getTables().get(2).getRow(25).getCell(4).getText();

//         ****************************************************   last Table
            int distalLatencySecCount = 0;
            int iom = 0;
            int jackHammer = 0;
            int fragmanted = 0;
            int largeBreaksSec = 0;

            for (int i = 2; i < 13; i++) {
                if (!hrmDoc.getTables().get(5).getRow(19).getCell(i).getText().equals("") && Float.parseFloat(hrmDoc.getTables().get(5).getRow(19).getCell(i).getText()) < 4.5) {
                    distalLatencySecCount++;
                }
            }
            for (int j = 2; j < 13; j++) {
                if (!hrmDoc.getTables().get(5).getRow(13).getCell(j).getText().equals("")) {
                    if (Float.parseFloat(hrmDoc.getTables().get(5).getRow(13).getCell(j).getText()) < 450) {
                        iom++;
                    }
                    if (Float.parseFloat(hrmDoc.getTables().get(5).getRow(13).getCell(j).getText()) > 8000) {
                        jackHammer++;
                    }
                    if (Float.parseFloat(hrmDoc.getTables().get(5).getRow(13).getCell(j).getText()) > 450) {
                        fragmanted++;
                    }
                }
            }
            for (int k = 2; k < 13; k++) {
                if (!hrmDoc.getTables().get(5).getRow(13).getCell(k).getText().equals("")) {
                    if (Float.parseFloat(hrmDoc.getTables().get(5).getRow(13).getCell(k).getText()) > 0) {
                        largeBreaksSec++;
                    }
                }
            }

//            System.out.println("===  >    = " + largeBreaksSec);
//            XWPFRun t = templateDoc.getTables().get(2).getRow(2).getCell(1).getParagraphs().get(0).createRun().;
//            System.out.println("patient 22222    = " + doc2.getTables().get(1).getRow(0).getCell(0).getParagraphs().get(1).getText());


            for (XWPFTable tbl : templateDoc.getTables()) {
                for (XWPFTableRow row : tbl.getRows()) {
                    for (XWPFTableCell cell : row.getTableCells()) {
                        for (XWPFParagraph p : cell.getParagraphs()) {
                            for (XWPFRun r : p.getRuns()) {

                                String text = r.getText(0);

                                if (text != null && text.contains("patientname")) {
                                    text = text.replace("patientname", patientName);
                                    r.setText(text, 0);
                                }
                                //  ****************************************** first column
                                if (text != null && text.contains("proximalLes")) {
                                    text = text.replace("proximalLes", proximalLes);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("lesLength")) {
                                    text = text.replace("lesLength", lesLength);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("esophagealLength")) {
                                    text = text.replace("esophagealLength", esophagealLength);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("intraabdominalLesLength")) {
                                    text = text.replace("intraabdominalLesLength", intraabdominalLesLength);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("hiatalHernia")) {
                                    text = text.replace("hiatalHernia", hiatalHernia);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("basalRespiratoryMin")) {
                                    text = text.replace("basalRespiratoryMin", basalRespiratoryMin);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("basalRespiratoryMean")) {
                                    text = text.replace("basalRespiratoryMean", basalRespiratoryMean);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("meanBasalPressure")) {
                                    text = text.replace("meanBasalPressure", meanBasalPressure);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("meanResidualPressure")) {
                                    text = text.replace("meanResidualPressure", meanResidualPressure);
                                    r.setText(text, 0);
                                }

                                //  ****************************************** second column


                                if (text != null && text.contains("numberOfSwallows")) {
                                    text = text.replace("numberOfSwallows", numberOfSwallows);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("peristaltic")) {
                                    text = text.replace("peristaltic", peristaltic);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("simultaneous")) {
                                    text = text.replace("simultaneous", simultaneous);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("failed")) {
                                    text = text.replace("failed", failed);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("meanWaveAmplitude")) {
                                    text = text.replace("meanWaveAmplitude", meanWaveAmplitude);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("meanWaveDuration")) {
                                    text = text.replace("meanWaveDuration", meanWaveDuration);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("doublePeakedWaves")) {
                                    text = text.replace("doublePeakedWaves", doublePeakedWaves);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("triplePeakedWaves")) {
                                    text = text.replace("triplePeakedWaves", triplePeakedWaves);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("velocity")) {
                                    text = text.replace("velocity", velocity);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("distalContracliteIntegralMean")) {
                                    text = text.replace("distalContracliteIntegralMean", distalContracliteIntegralMean);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("contractileFrontVelocity")) {
                                    text = text.replace("contractileFrontVelocity", contractileFrontVelocity);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("intrabolusPressureLesr")) {
                                    text = text.replace("intrabolusPressureLesr", intrabolusPressureLesr);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("intrabolusPressureAvgMax")) {
                                    text = text.replace("intrabolusPressureAvgMax", intrabolusPressureAvgMax);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("distalLatency")) {
                                    text = text.replace("distalLatency", distalLatency);
                                    r.setText(text, 0);
                                }
                                if (text != null && text.contains("smallBreaks")) {
                                    text = text.replace("smallBreaks", smallBreaks);
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

                        if (text != null && text.contains("gender")) {
                            if (gender.equals("Male")) {
                                text = text.replace("gender", "gentleman");
                            }
                            if (gender.equals("female")) {
                                text = text.replace("gender", "lady");
                            }
                            r.setText(text, 0);
                        }

                        if (text != null && text.contains("value1")) {
                            if (Float.parseFloat(meanBasalPressure) > 104) {
                                text = text.replaceAll("value1", "hypertensive");
                            } else if (Float.parseFloat(meanBasalPressure) < 34) {
                                text = text.replaceAll("value1", "hypotensive");
                            } else {
                                text = text.replaceAll("value1", "normotensive");
                            }
                            r.setText(text, 0);
                        }

                        if (text != null && text.contains("value2")) {
                            if (Float.parseFloat(meanResidualPressure) < 12) {
                                text = text.replaceAll("value2", "complete relaxation");
                            } else {
                                text = text.replaceAll("value2", "incomplete relaxation");
                            }
                            r.setText(text, 0);
                        }

                        // todo value3

                        if (text != null && text.contains("value4")) {
                            if (Float.parseFloat(basalRespiratoryMin) < 4.8) {
                                text = text.replaceAll("value4", "hypotensive");
                            } else if (Float.parseFloat(basalRespiratoryMin) > 32) {
                                text = text.replaceAll("value4", "hypertensive");
                            } else {
                                text = text.replaceAll("value4", "normotensive");
                            }
                            r.setText(text, 0);
                        }

                        if (text != null && text.contains("value5")) {
                            if (Float.parseFloat(residualMean) < 15) {
                                text = text.replaceAll("value5", "complete relaxation");
                            } else {
                                text = text.replaceAll("value5", "reffer to jafar");
                                // todo for other conditions
                            }
                            r.setText(text, 0);
                        }

                        if (text != null && text.contains("value6")) {
                            if (hiatalHernia.equals("No")) {
                                text = text.replaceAll("value6", "No");
                            } else {
                                text = text.replaceAll("value6", hiatalHernia);
                            }
                            r.setText(text, 0);
                        }

                        if (text != null && text.contains("value7")) {
                            if (Float.parseFloat(residualMean) > 15 && Float.parseFloat(failed) == 100 && Float.parseFloat(distalContracliteIntegralMean) < 450) {
                                text = text.replaceAll("value7", "Type I achalasia(classic achalasia)");
                            } else if (Float.parseFloat(residualMean) > 15 && Float.parseFloat(failed) == 100 && (Float.parseFloat(distalContracliteIntegralMean) > 450 && Float.parseFloat(distalContracliteIntegralMean) < 1000)) {
                                text = text.replaceAll("value7", "Type II achalasia(with esophageal compression)");
                            } else if (Float.parseFloat(residualMean) > 15 && Float.parseFloat(failed) == 100 && Float.parseFloat(distalContracliteIntegralMean) > 1000) {
                                text = text.replaceAll("value7", "Type III achalasia(spastic achalasia)");
                            } else if (Float.parseFloat(residualMean) > 15 && Float.parseFloat(failed) < 100) {
                                text = text.replaceAll("value7", "OGJ outflow obstruction");
                            } else if (Float.parseFloat(residualMean) < 15 && Float.parseFloat(failed) == 100) {
                                text = text.replaceAll("value7", "Absent contractility");
                            } else if (Float.parseFloat(residualMean) < 15 && Float.parseFloat(failed) < 100) {
                                if (distalLatencySecCount > 2) {
                                    text = text.replaceAll("value7", "Distal oesophageal spasm");
                                } else if (iom > 5) {
                                    text = text.replaceAll("value7", "Ineffective oesophageal motility (IOM)");
                                } else if (jackHammer > 2) {
                                    text = text.replaceAll("value7", "Hypercontractile esophagus (jackhammer)");
                                } else if (fragmanted > 6 && largeBreaksSec > 5) {
                                    text = text.replaceAll("value7", "Fragmented peristalsis");
                                }
                            } else {
                                text = text.replaceAll("value7", "Normal oesophageal motility");
                            }
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
