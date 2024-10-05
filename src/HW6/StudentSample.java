package HW6;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class StudentSample {
    public static void main(String[] args) {
        var birthday = new GregorianCalendar(1988, Calendar.APRIL, 2);
        Student student = new Student(1, "Михаил", "Овечкин", birthday.getTime(), "Инновационное развитие", 2, "ИТ");
        student.information();
        System.out.println("--------------------------------------------------");
        var lastName = student.getLastName();
        System.out.println(lastName);

        student.setGroup("IT04");
        var group = student.getGroup();
        System.out.println(group);
    }
}