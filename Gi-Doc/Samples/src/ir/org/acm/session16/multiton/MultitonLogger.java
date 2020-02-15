package ir.org.acm.session16.multiton;

import java.util.HashMap;

public class MultitonLogger {

    private static HashMap map = new HashMap();

    private MultitonLogger() { }

    public static MultitonLogger getLogger(Object key) {

        if ( !map.containsKey(key) )
            map.put(key, new MultitonLogger());

        return (MultitonLogger) map.get(key);

    }

    // other logger fields and methods

}
