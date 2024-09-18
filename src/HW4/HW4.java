package HW4;
import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 3 == 0)
                System.out.println("Вывести число:" + i);

            int i = 1;
            for (i = 1; i <= 100; i++)
                System.out.println("Вывести число:" + i);
        }

        int a = 1;
        do {
            System.out.println("Вывести число:" + a);
            a++;
        }
        while (a <= 100);

        int b = 1;
        while (b <= 100) {
            System.out.println("Вывести число:" + b);
            b++;
        }
    }
}