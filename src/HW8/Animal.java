package HW8;

import javax.management.monitor.StringMonitor;

public class Animal extends Object {


    protected String color;
    protected String field;


    public Animal() {
        System.out.println("hello");
    }


    public Animal(String color)
    {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public Animal(String color, String field)
    {
        this.color = color;
        this.field=field;
    }

    public void say() {
        System.out.println("Hhhhhhh");
    }

    public void play() {
        System.out.println("Animal so tired");
    }

}
