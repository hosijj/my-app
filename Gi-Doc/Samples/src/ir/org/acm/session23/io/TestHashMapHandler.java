package ir.org.acm.session23.io;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class TestHashMapHandler {

    public static void main(String[] args) throws Exception {

        HashMap my = new HashMap();
        my.put("ali","18");
        my.put("reza","12");
        my.put("hassan","15");

        System.out.println("Testing save hashMap to file...");
        HashMapHandler.save(my, new File("saved_map.txt"));

        System.out.println("Testing load file to hashMap...");
        Map<String,String> map = HashMapHandler.load( new File("saved_map.txt") );
        System.out.println( map.get("ali") );

    }
}
