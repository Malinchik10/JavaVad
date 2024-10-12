package HW12;

import java.util.*;

public class MainCollections {
    public static void main(String[] args) {
        Faculty faculty = new Faculty(
                List.of(
                        new Group(
                                List.of(
                                        new Student("Марк", "Овечкин", new GregorianCalendar(1988, Calendar.APRIL, 02).getTime(), "США", 4.6),
                                        new Student("Ольга", "Сидорова", new GregorianCalendar(1980, Calendar.MAY, 30).getTime(), "Канада", 3.8)
                                ),
                                101),
                        new Group(
                                List.of(
                                        new Student("Арсений", "Овечкин", new GregorianCalendar(1988, Calendar.APRIL, 02).getTime(), "США", 3.7),
                                        new Student("Кристина", "Петрова", new GregorianCalendar(2005, Calendar.JUNE, 07).getTime(), "Китай", 4.5),
                                        new Student("Сергей", "Стекляшкин", new GregorianCalendar(2000, Calendar.JUNE, 01).getTime(), "Вьетнам", 4.5)
                                ),
                                102),
                        new Group(
                                List.of(
                                        new Student("Маргарита", "Симонян", new GregorianCalendar(1958, Calendar.APRIL, 02).getTime(), "Армения", 2.7),
                                        new Student("Анна", "Каренина", new GregorianCalendar(1989, Calendar.MAY, 07).getTime(), "Катар", 4.5),
                                        new Student("Никита", "Кожемяка", new GregorianCalendar(2000, Calendar.JUNE, 01).getTime(), "Вьетнам", 4.5)
                                ),
                                103)
                ),
                "Физмат"
        );

        faculty.print();
        faculty.revokeStudents(4.0);
        faculty.deactivate();
        faculty.print();
    }

}
