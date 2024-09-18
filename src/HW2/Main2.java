package HW2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.print("Введите аргументы ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a);
        System.out.println(b);

        int x = 5;
        int y = 2;
        int z = 6;

        int c = --x + (++y * z--);

        x = x - 1;//4
        y = y + 1;//3
        // z = 6
        c = x + y * x; //4+3*6
        z = z - 1; // 5

        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}