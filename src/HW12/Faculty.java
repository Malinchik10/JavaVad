package HW12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Faculty {
    private static final int  minFacultySize = 20;
    private List<Group> groups;
    private String name;
    private FacultyStatus status;

    public Faculty(List<Group> groups, String name)
    {
        this.groups = groups;
        this.name = name;
        if(facultySize() < minFacultySize)
        {
            this.status = FacultyStatus.Deactivated;
        }
        else
        {
            this.status = FacultyStatus.Active;
        }
    }

    public void revokeStudents(Double minAvg)
    {
        for (Group group : groups) {
            group.revokeStudents(minAvg);
        }
    }

    public void activate()
    {
        this.status = FacultyStatus.Active;
    }

    public void deactivate()
    {
        this.status = FacultyStatus.Deactivated;
    }

    public int facultySize()
    {
        int acc = 0;
        for (Group group : groups) {
            acc += group.groupSize();
        }

        return acc;
    }

    public void print()
    {
        System.out.println("Факультет: " + name + ". Статус: " + status + ", кол-во студентов: " + facultySize());
        for (Group gr : groups)
        {
            gr.print();
        }
    }

    public void printStudents()
    {
        List<Student> acc = new ArrayList<>();
        for (Group group : groups) {
            acc.addAll(group.getStudents());
        }

        for (Student student : acc.stream().sorted(Comparator.comparingDouble(p -> p.getAvgScore())).toList()) {
            student.print();
        }
    }
}
