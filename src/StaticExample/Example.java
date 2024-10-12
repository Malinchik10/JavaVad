package StaticExample;

public class Example {//класс, как объект - этот класс, через операцию new - этот объект - со статическим.
    public int test;
    public static int test2; //

    public Example(int test) //конструктор
    {
        this.test = test;

    }

    public void printInstance()
    {
        System.out.println(test);
    }

    public static void printStatic()
    {
        System.out.println(test2);
    }
}
