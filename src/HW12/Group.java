package HW12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Group {
    public List<Student> getStudents() {
        return students;
    }

    private ArrayList<Student> students;

    public int getNumber() {
        return number;
    }

    private int number;

    public Group(List<Student> students, int groupNumber)
    {
        this.students = new ArrayList(students);
        this.number = groupNumber;
    }

    public void revokeStudents(Double minAvg)//ниже цифры балла искл. из группы - за студентов
    {
        if(this.students != null)
        {
            List<Student> goodStudents = students.stream().filter(p -> p.getAvgScore() >= minAvg).toList();//ср.балл ст.
            this.students = new ArrayList<>(goodStudents); //p - элемент коллекции
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

        double acc = 0; //ср.балл по группе
        for (Student student : students) {//for each
            acc += student.getAvgScore(); //
        }

        return acc / students.size(); //суммируем средний бал всех студентов и делим на количество - считаем средний балл
    }

    public void print()
    {
        System.out.println("\tГруппа: " + number);
        System.out.println("\tСтуденты: ");

        for (Student st : students.stream().sorted(Comparator.comparingDouble(p -> p.getAvgScore())).toList())//сортируем студентов по баллу
        {
            st.print();
        }
    }

    public void moveStudents(Group destantionGroup)//назначения=id группы
    {
        destantionGroup.addStudents(this.students);

        students = new ArrayList<>();
    }

    public void addStudents(List<Student> students)//добавить студента в группу
    {
        this.students.addAll(students);
    }
}
