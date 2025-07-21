package API;

import java.time.*;

public class date1 {
    public static void main(String[] args) {
        
        // java.util.Date dt = new java.util.Date();
        // System.out.println(dt);

        // long time = dt.getTime();

        // java.sql.Date dt1 = new java.sql.Date(time);

        // System.out.println(dt1);

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());



        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
    }
}
