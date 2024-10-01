package HW8;

public class Animal {
    public String getColor() {
        return color;
    }

    protected String color;

    public Animal(String color)
    {
        this.color = color;
    }

    public void say()
    {
        System.out.println("Hhhhhhh");
    }

    public void play()
    {
        System.out.println("Animal so tired");
    }

}
