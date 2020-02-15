package ir.org.acm.session07;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ComputerTime {

    public static void main(String[] args) {

        long now = System.currentTimeMillis();

        System.out.println( now ); // 1,481,130,416,029

        Date d1 = new Date(now);

        Date d2 = new Date();

        Calendar c = new GregorianCalendar(1970, 0, 1);
        Date d3 = c.getTime();

        String format = "%s %tB %<te, %<tY"; // Due date: January 1, 1970
        System.out.printf(format, "Due date:", d3);

        LocalDate d = LocalDate.of(1970, 1, 1); // 1.8

    }

}
