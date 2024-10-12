package StaticExample;

public class StaticMain {
    public static void main(String[] args)
    {
        Example exm = new Example(10); //оъект
        exm.test = 555555;
        exm.printInstance();

        Example.test2 = 12; //класс
        Example.printStatic();

        test();

        int result = add(10, 25);
        print(result);
    }

    private  static void test()
    {
        Example.test2 = 24;
        Example.printStatic();
        int a = 15;
        int b = 15;
        int result = add(a, b); //1. Вызов функции, передача аргументов; = - передать значение функции в result
        print(result);
        print(add(1,2));
    }

    private static int add(int x, int y) //объявляется функция - есть переменная int
    {
        int summ = x + y;
        return summ; // возвращает после выполнения функции в result -...какая переменная вызвала;
    }

    private static void print(int number) //void некому возвращать
    {
        System.out.println("number: " + number);
    }
}
//функцияЕсли main (функция) статичная - остальные функции все статичные, если нет , то объект класса, внутри него функции

