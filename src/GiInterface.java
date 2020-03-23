import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.rtf.RTFEditorKit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class GiInterface extends JFrame {

    private JButton button1;
    private JPanel panel1;
    private JTextField patientName;

    private JComboBox comboBox1;
    private JButton openFile1;
    private JFileChooser fileChooser;
    File selectedFile;


    GiInterface() {
        add(panel1);
        setTitle("Gi Cognition application");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        button1.addActionListener(e -> generateResult(patientName.getText(), comboBox1.getSelectedItem().toString(), selectedFile));


//   File chooser

fileChooser = new JFileChooser();
fileChooser.setFileFilter(new FileNameExtensionFilter("Text files","txt"));
fileChooser.setCurrentDirectory(new File("."));

openFile1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Docx files","docx"));
                fileChooser.setCurrentDirectory(new File("."));
               if(fileChooser.showOpenDialog(openFile1) == JFileChooser.APPROVE_OPTION){
                   selectedFile = fileChooser.getSelectedFile();
                   System.out.println(selectedFile.getName());
               }
            }
        });
    }


        private static void generateResult (String patientName2, String item, File file1){
            System.out.println("Crawling started ... ");
            System.out.println("patientName = " + patientName2);
            System.out.println("item = " + item);
            String patientName;
            String gender;
            String proximalLes;
            String lesLength;
            String esophagealLength;
            String intraabdominalLesLength;
            String hiatalHernia;
            String basalRespiratoryMin;
            String basalRespiratoryMean;
            String residualMean;
            String meanBasalPressure;
            String meanResidualPressure;

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
            String contractileFrontVelocity;
            String intrabolusPressureLesr;
            String intrabolusPressureAvgMax;
            String distalLatency;
            String smallBreaks;

            String percentTimeclearanceUpright;
            String percentTimeclearanceUprightNormal;
            String percentTimeclearanceRecumbant;
            String percentTimeclearanceRecumbantNormal;
            String percentTimeclearanceTotal;
            String percentTimeclearanceTotalNormal;
            String deMeesterCompositeScore;
            String deMeesterCompositeScoreNormal;
            String refluxEpisodeActivity;
            String refluxEpisodeActivityNormal;
            String sysptomCorrelationOccurance;
            String refluxSymptomIndexAllReflux;
            String refluxSymptomAssociationAllReflux;

            try {
                XWPFDocument hrmDoc = new XWPFDocument(OPCPackage.openOrCreate(file1));
                XWPFDocument templateDoc = new XWPFDocument(OPCPackage.open("Template.docm"));
                File file = new File("Impdance.rtf");


                /////////////////////////// for tables Start

                patientName = hrmDoc.getTables().get(0).getRow(0).getCell(0).getParagraphs().get(1).getText();
                gender = hrmDoc.getTables().get(0).getRow(0).getCell(2).getText();

                proximalLes = hrmDoc.getTables().get(2).getRow(2).getCell(1).getText();
                lesLength = hrmDoc.getTables().get(2).getRow(4).getCell(1).getText();
                esophagealLength = hrmDoc.getTables().get(2).getRow(5).getCell(1).getText();
                intraabdominalLesLength = hrmDoc.getTables().get(2).getRow(7).getCell(1).getText();
                hiatalHernia = hrmDoc.getTables().get(2).getRow(8).getCell(1).getText();
                basalRespiratoryMin = hrmDoc.getTables().get(2).getRow(11).getCell(1).getText();
                basalRespiratoryMean = hrmDoc.getTables().get(2).getRow(12).getCell(1).getText();
                residualMean = hrmDoc.getTables().get(2).getRow(13).getCell(1).getText();
                meanBasalPressure = hrmDoc.getTables().get(2).getRow(29).getCell(1).getText();
                meanResidualPressure = hrmDoc.getTables().get(2).getRow(30).getCell(1).getText();

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
//              *********************************************   impdance document
                String result = null;
//                try {
                DefaultStyledDocument styledDoc = new DefaultStyledDocument();
                InputStream is = new FileInputStream(file);
                new RTFEditorKit().read(is, styledDoc, 0);
                result = new String(styledDoc.getText(0, styledDoc.getLength()));
                List<String> impdance = Arrays.asList(result.split("\\t|\\n"));

                percentTimeclearanceUpright = impdance.get(88);
                percentTimeclearanceUprightNormal = impdance.get(89);
                percentTimeclearanceRecumbant = impdance.get(90);
                percentTimeclearanceRecumbantNormal = impdance.get(91);
                percentTimeclearanceTotal = impdance.get(92);
                percentTimeclearanceTotalNormal = impdance.get(93);
                deMeesterCompositeScore = impdance.get(109);
                deMeesterCompositeScoreNormal = impdance.get(109);
                refluxEpisodeActivity = impdance.get(287);
                refluxEpisodeActivityNormal = impdance.get(288);
                sysptomCorrelationOccurance = impdance.get(306);
                refluxSymptomIndexAllReflux = impdance.get(330);
                refluxSymptomAssociationAllReflux = impdance.get(348);


//            System.out.println(impdance.get(348));

                for (int i = 0; i < impdance.size(); i++) {
                    if (impdance.get(i) != null && impdance.get(i).contains("Reflux Episode Activity (Impedance)")) {
//                            System.out.println(" 1 ====== >    " + impdance.get(i+1));
//                            System.out.println("i == " + i);

                    }
                }


                //  **********************************************              Fill the tempalte
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
                                    if (text != null && text.contains("residualMean")) {
                                        text = text.replace("residualMean", residualMean);
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

                            if (text != null && text.contains("value3")) {
                                if (distalContracliteIntegralMean == null | Float.parseFloat(distalContracliteIntegralMean) == 0 | Float.parseFloat(failed) == 100) {
                                    text = text.replaceAll("value3", "no peristaltic contraction");
                                }
                                if (Float.parseFloat(failed) < 100 && iom >= 5) {
                                    text = text.replaceAll("value3", "weak peristalsis with>=50% swallows with DCI <450U");
                                }
                                if (Float.parseFloat(failed) < 100 && fragmanted >= 6 && largeBreaksSec > 5) {
                                    text = text.replaceAll("value3", "weak peristalsis with>=50% swallows with gap>5cm");
                                }
                                if (Float.parseFloat(failed) < 100 && jackHammer >= 2) {
                                    text = text.replaceAll("value3", "hypercontractile contraction on 20% swallows");
                                }
                                if (Float.parseFloat(failed) < 100 && distalLatencySecCount >= 2) {
                                    text = text.replaceAll("value3", "spastic/simultaneous contractions");
                                }
                                if (Float.parseFloat(failed) == 100 && Float.parseFloat(distalContracliteIntegralMean) >= 450 && Float.parseFloat(distalContracliteIntegralMean) <= 1000) {
                                    text = text.replaceAll("value3", "panoesophageal pressurisations on>=20% of swallows");
                                } else {
                                    text = text.replaceAll("value3", "normal peristalsis");
                                }
                                r.setText(text, 0);
                            }

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
                                    text = text.replaceAll("value5", "incomplete relaxation");
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
                                } else if ((Float.parseFloat(residualMean) < 15 && Float.parseFloat(failed) == 100) | distalContracliteIntegralMean != null) {
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


                            if (text != null && text.contains("param1")) {
//                            text = text.replaceAll("param1", deMeesterCompositeScoreNormal);
//                            r.setText(text, 0);
// todo 24 hour pH-Impedance Reflux Monitoring
                            }
                            if (text != null && text.contains("param2")) {
                                text = text.replaceAll("param2", percentTimeclearanceTotal);
                                r.setText(text, 0);
                            }
                            if (text != null && text.contains("param3")) {
                                text = text.replaceAll("param3", percentTimeclearanceTotalNormal);
                                r.setText(text, 0);
                            }
                            if (text != null && text.contains("param4")) {
                                text = text.replaceAll("param4", percentTimeclearanceUpright);
                                r.setText(text, 0);
                            }
                            if (text != null && text.contains("param5")) {
                                text = text.replaceAll("param5", percentTimeclearanceUprightNormal);
                                r.setText(text, 0);
                            }
                            if (text != null && text.contains("param6")) {
                                text = text.replaceAll("param6", percentTimeclearanceRecumbant);
                                r.setText(text, 0);
                            }
                            if (text != null && text.contains("param7")) {
                                text = text.replaceAll("param7", percentTimeclearanceRecumbantNormal);
                                r.setText(text, 0);
                            }
                            if (text != null && text.contains("param8")) {
                                text = text.replaceAll("param8", deMeesterCompositeScore);
                                r.setText(text, 0);

                            }
                            if (text != null && text.contains("param9")) {
                                text = text.replaceAll("param9", deMeesterCompositeScoreNormal);
                                r.setText(text, 0);

                            }
                            if (text != null && text.contains("param10")) {
//                            text = text.replaceAll("param10", deMeesterCompositeScoreNormal);
//                            r.setText(text, 0);
// todo number of reflux event
                            }
                            if (text != null && text.contains("param11")) {
                                text = text.replaceAll("param11", refluxEpisodeActivity);
                                r.setText(text, 0);

                            }
                            if (text != null && text.contains("param12")) {
                                text = text.replaceAll("param12", refluxEpisodeActivityNormal);
                                r.setText(text, 0);

                            }
                            if (text != null && text.contains("param13")) {
//                            text = text.replaceAll("param13", deMeesterCompositeScoreNormal);
//                            r.setText(text, 0);
// todo symptom 1
                            }
                            if (text != null && text.contains("param14")) {
                                text = text.replaceAll("param14", sysptomCorrelationOccurance);
                                r.setText(text, 0);

                            }
                            if (text != null && text.contains("param15")) {
                                text = text.replaceAll("param15", refluxSymptomIndexAllReflux);
                                r.setText(text, 0);

                            }
                            if (text != null && text.contains("param16")) {
                                text = text.replaceAll("param16", refluxSymptomAssociationAllReflux);
                                r.setText(text, 0);

                            }

                            if (text != null && text.contains("param17")) {
                                if ((Float.parseFloat(percentTimeclearanceTotal.substring(0, 3)) > Float.parseFloat(percentTimeclearanceTotalNormal.substring(2, 6)))
                                        | (Float.parseFloat(percentTimeclearanceUpright.substring(0, 3)) > Float.parseFloat(percentTimeclearanceUprightNormal.substring(2, 6)))
                                        | (Float.parseFloat(percentTimeclearanceRecumbant.substring(0, 3)) > Float.parseFloat(percentTimeclearanceRecumbantNormal.substring(2, 6)))
                                        | (Float.parseFloat(refluxEpisodeActivity) > Float.parseFloat(refluxEpisodeActivityNormal.substring(2, 5)))
                                ) {
                                    text = text.replaceAll("param17", "Pathological acid/non-acid reflux" + "-" + "???");
                                } else if ((Float.parseFloat(percentTimeclearanceTotal.substring(0, 3)) < Float.parseFloat(percentTimeclearanceTotalNormal.substring(2, 6)))
                                        && (Float.parseFloat(percentTimeclearanceUpright.substring(0, 3)) < Float.parseFloat(percentTimeclearanceUprightNormal.substring(2, 6)))
                                        && (Float.parseFloat(percentTimeclearanceRecumbant.substring(0, 3)) < Float.parseFloat(percentTimeclearanceRecumbantNormal.substring(2, 6)))
                                        && (Float.parseFloat(refluxEpisodeActivity) < Float.parseFloat(refluxEpisodeActivityNormal.substring(2, 5)))
                                ) {
                                    text = text.replaceAll("param17", "No Pathological acid/non-acid reflux" + "-" + "???");
                                } else {
                                    text = text.replaceAll("param17", "refer to support");
                                }
                                r.setText(text, 0);
                            }

                            if (text != null && text.contains("param18")) {
//                            text = text.replaceAll("param13", deMeesterCompositeScoreNormal);
//                            r.setText(text, 0);
// todo , nocturnal
                            }

                            if (text != null && text.contains("param19")) {
                                int x = refluxSymptomIndexAllReflux.length() - 1;
                                int z = refluxSymptomAssociationAllReflux.length() - 1;
                                if (Long.valueOf(refluxSymptomIndexAllReflux.substring(0, x)) > 50 && Long.valueOf(refluxSymptomAssociationAllReflux.substring(0, z)) > 95) {
                                    text = text.replaceAll("param19", "No positive reflux-symptom association");
                                } else if (Long.valueOf(refluxSymptomIndexAllReflux.substring(0, x)) < 50 && Long.valueOf(refluxSymptomAssociationAllReflux.substring(0, z)) < 95) {
                                    text = text.replaceAll("param19", "Positive reflux-symptom association ");
                                } else if (Long.valueOf(refluxSymptomIndexAllReflux.substring(0, x)) < 50 | Long.valueOf(refluxSymptomAssociationAllReflux.substring(0, z)) < 95) {
                                    text = text.replaceAll("param19", "Weakly positive reflux-symptom association");
                                } else {
                                    text = text.replaceAll("param19", "Call support");
                                }
                                // todo Not enough symptomatic during study for
                                r.setText(text, 0);

                            }


                            if (text != null && text.contains("param20")) {
//                            text = text.replaceAll("param13", deMeesterCompositeScoreNormal);
//                            r.setText(text, 0);
// todo sym 1 or sym 2
                            }

                        }
                    }
                }

                templateDoc.write(new FileOutputStream("Template2.docm"));
                System.out.println("Done ....... !  ");

                /////////////////////////// for tables Start End

                /////////////////////  for images Start

          /*  System.out.println("getting pictures .................... ");
            List<XWPFPictureData> piclist = hrmDoc.getAllPictures();
            Iterator<XWPFPictureData> iterator = piclist.iterator();

            int i = 0;

            while (iterator.hasNext()) {
                XWPFPictureData pic = iterator.next();
                byte[] bytepic = pic.getData();
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(bytepic));

                System.out.println(imag.getWidth());

                if(imag.getWidth() == 1087)
                ImageIO.write(imag, "jpg", new File("imagesFromDocx/" + i + ".jpg"));
                i++;
            }
            System.out.println("=== " + i);*/
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            /////////////////////  for images End
        }


    }
