package HW6;

import java.util.Calendar;
import java.util.Date;

public class StudentSample {
    public static void main(String[] args) {
        Student student = new Student(1, "Михаил", "Овечкин", new Date(1988, Calendar.DECEMBER,01), "Инновационное развитие", 2, "ИТ");
        student.information();
        System.out.println("--------------------------------------------------");
        var lastName = student.getLastName();
        System.out.println(lastName);
    }
}