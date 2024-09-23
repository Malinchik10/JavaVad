package HW3;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 5;
        if (a % 2 == 0 & a % 5 == 0) {
            System.out.println("Вывести четные числа: " + a);
        }
        if (b % 2 == 0 & b % 5 == 0) {
            System.out.println("Вывести четные числа: " + b);
        }
        if (c % 2 == 0 & c % 5 == 0) {
            System.out.println("Вывести четные числа: " + c);
        }
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(x);
        double result = 15.00 / x;
        int ostatok = 15 % x;

        switch (ostatok) {
            case 0:
                System.out.println("Результат деления равен:" + (int) result);
                break;
            default:
                System.out.println("Результат деления равен дробному числу:" + result);
        }
    }
}