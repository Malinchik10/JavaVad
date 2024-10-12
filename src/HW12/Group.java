package HW12;

import java.util.List;

public class Group {
    private List<Student> students;
    private int number;

    public Group(List<Student> students, int groupNumber)
    {
        this.students = students;
        this.number = groupNumber;
    }

    public void revokeStudents(Double minAvg)
    {
        if(this.students != null)
        {
            this.students = students.stream().filter(p -> p.getAvgScore() >= minAvg).toList();//p - элемент коллекции
        }
    }

    public int groupSize()
    {
        return students.size();
    }

    public void print()
    {
        System.out.println("\tГруппа: " + number);
        System.out.println("\tСтуденты: ");

        for (Student st : students)
        {
            st.print();
        }
    }
}
