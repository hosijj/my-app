package ir.org.acm.session23.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapHandler {

//    public static HashMap loadHashMap(File f) throws IOException {
//
//        Scanner input = new Scanner(f).useDelimiter("=");
//        String key, value;
//        HashMap h = new HashMap();
//        while( input.hasNext() ){
//            key = input.next();
//            input.skip("=");
//            value = input.nextLine();
//            h.put(key,value);
//        }
//
//        return h;
//
//    }

    public static HashMap load(File file){

        HashMap<String,String> map = null;
        if (!file.exists()){
            return map;
        }
        map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()));
        ) {
            String line;
            String[] tokens;
            while ((line = reader.readLine()) != null) {
                tokens = line.split("=");
                map.put(tokens[0], tokens[1]);
            }
        } catch (IOException  e) {
            e.printStackTrace();
        }
        return map;
    }


    public static void save(HashMap map, File file) {

        try (FileWriter writer = new FileWriter(file);){

            StringBuffer sb = new StringBuffer(100);

            Set<Map.Entry> m = map.entrySet();
            for (Map.Entry o : m) {
                sb.append(o.getKey())
                  .append("=")
                  .append(o.getValue())
                  .append(System.lineSeparator());
            }

            writer.write( sb.toString() );

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
