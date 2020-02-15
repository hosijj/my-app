package ir.org.acm.session28.repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

class PropHandler {

    public static ArrayList<String> repoBrowser(String[] groupIds) {

        Properties prop = new Properties();
        InputStream input = null;
        ArrayList<String> directories = new ArrayList<>();

        try {

            input = new FileInputStream("config.properties");

            //  load a properties file
            prop.load(input);

            for (String groupId : groupIds) {
                directories.add(prop.getProperty(groupId));
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return directories;

    }

}
