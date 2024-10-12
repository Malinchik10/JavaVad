package HW12;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthday;
    private String from;
    private Double avgScore;

    public Student(String firstName, String lastName, Date birthday, String from, double avgScore) {//поля свои
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.from = from;
        this.avgScore = avgScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Double avgScore) {
        this.avgScore = avgScore;
    }

    public void print() {
        System.out.println(String.format("\t\tИмя: %s, Фамилия: %s", firstName, lastName));//шаблон %Sподставит
    }
}

