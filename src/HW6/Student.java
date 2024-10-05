package HW6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String faculty;
    private int course;
    private String group;

    public Student() {
    }

    public Student (int id, String firstName, String lastName, Date birthday, String faculty, int course, String group){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public Date getBirthday()
    {
        return this.birthday;
    }
    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public String getFaculty(){
        return this.faculty;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public int getCourse(){
        return this.course;
    }
    public void setCourse(int course){
        this.course = course;
    }
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public void information()
    {
        String result = String.format(
                "\tId: %s,\n\tИмя: %s,\n\tФамилия: %s,\n\tДата рождения: %s,\n\tФакультет: %s,\n\tКурс: %d,\n\tГруппа: %s\n",
                id,
                firstName,
                lastName,
                new SimpleDateFormat("dd/MM/yyyy").format(birthday),
                faculty,
                course,
                group);
        System.out.println(result);
//        System.out.println("id: " + this.id);
//        System.out.println("Фамилия : " + this.firstName);
//        System.out.println("Имя: " + this.lastName);
//        System.out.println("Дата рождения: " + this.birthday);
//        System.out.println("Факультет:" + this.faculty);
//        System.out.println("Группа: " + this.course);
//        System.out.println("Группа: " + this.group);
    }

}
