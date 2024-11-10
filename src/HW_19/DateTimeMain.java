package HW_19;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class DateTimeMain {
    public static void main(String[] args) {
        //https://labex.io/tutorials/java-how-to-format-dates-with-printf-in-java-414032
        String date = new SimpleDateFormat("dd MMMM yyyy").format(Calendar.getInstance().getTime());
        System.out.println(date);
        String datetime = new SimpleDateFormat("dd MMMM yyyy, H:mm:ss a").format(Calendar.getInstance().getTime());
        System.out.println(datetime);

        String datetimeString = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : H:mm:ss a", Locale.ENGLISH);
        LocalDate dateFromString = LocalDate.parse(datetimeString, formatter);
        System.out.println(dateFromString);

        String longDateTime = new SimpleDateFormat("EEEEE dd MMMM yyyy время: H.mm.ss a").format(Calendar.getInstance().getTime());
        System.out.println(longDateTime);
    }
}
