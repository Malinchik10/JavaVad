package HW11;

public class GenericMain {
    public static void main(String[] args) {
        System.out.println("Start");
        Generic<String> test1 = new Generic<String>("Маршмеллоу");
        Generic<Integer> test2 = new Generic<Integer>(15);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println("Finish");
    }
}