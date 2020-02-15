package ir.org.acm.session19.dependencyinjection;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class MyContext {
    
    private final String configFile = "src/ir/org/acm/session19/dependencyinjection/my-context.txt";

    public Object getBean(String id) { // factory method

        Object obj = null;
        Properties p = new Properties();
        try {
            p.load( new FileInputStream(configFile) );
            Class type = Class.forName( p.getProperty(id) );
            obj = type.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return obj;

    }
    
    public void injectIn(Object client) {

        try {

            Class c = client.getClass();
            for (Field f : c.getDeclaredFields()) {
                f.setAccessible(true);
                Autowired a = f.getAnnotation(Autowired.class);
                if (a != null) f.set( client, getBean( a.id() ) ); // Injection
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
