package HW8;

public class Dog extends Animal{
    private String name;

    public String getKind() {
        return kind;
    }

    private String kind;
    private int age;

    public Dog(String color, String name, String kind, int age)
    {
//        super(color);

        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    public void bite()
    {
        System.out.println(name +  " is angry");
    }


    public void run()
    {
        System.out.println(name + " is fast");
    }

    public void jump()
    {
        System.out.println(name + " jumps");
    }

    @Override
    public void play() {
        System.out.println(name + " play");
    }
}
