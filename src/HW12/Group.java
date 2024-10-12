package HW12;

import java.util.Comparator;
import java.util.List;

public class Group {
    public List<Student> getStudents() {
        return students;
    }

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

    public double groupAvg()
    {
        if(students.size() == 0)
        {
            return 0;
        }

        double acc = 0;
        for (Student student : students) {
            acc += student.getAvgScore();
        }

        return acc / students.size();
    }

    public void print()
    {
        System.out.println("\tГруппа: " + number);
        System.out.println("\tСтуденты: ");

        for (Student st : students.stream().sorted(Comparator.comparingDouble(p -> p.getAvgScore())).toList())
        {
            st.print();
        }
    }
}
