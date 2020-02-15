package ir.org.acm.session20.thread;

import java.lang.management.ManagementFactory;
import javax.management.*;

public class T01ThreadCount {

    public static void main(String[] args) {

        printThreadCount();

    }

    public static void printThreadCount() {

            try {

                MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
                ObjectName name = ObjectName.getInstance("java.lang:type=Threading");
                AttributeList list = mbs.getAttributes(name, new String[]{"ThreadCount"}); // ?????

                System.out.println( ((Attribute) list.get(0)).getValue() );

            } catch (Exception e) {
                e.printStackTrace();
            }

    }

}
