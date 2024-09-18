package HW2;
import java.util.Scanner;
public class Args {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 3 == 0)
                System.out.println("Вывести число:" + i);
        }
    }
}

        /*

        int i = 1;
        for (i = 1; i <= 100; i++)
            System.out.println("Вывести число:" + i);
    }
}


        /*
        int i = 1;
        do {
            System.out.println("Вывести число:" + i);
            i++;
        }
        while (i <= 100);

    }
}
    /*
        int i = 1;
        while (i <= 100) {
            System.out.println("Вывести число:" + i);
            i++;
        } */


/*

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(x);
        double result = 15.00/ x;
        int ostatok = 15% x;

        switch (ostatok) {
                case 0:
                    System.out.println("Результат деления равен:" + (int) result);
                    break;
                default:
                    System.out.println("Результат деления равен дробному числу:" + result);
        }

    }
}

      int a = 10;
       int b = 3;
       int c = 5;
            if (a % 2 == 0 & a%5==0  ) {
                System.out.println("Вывести четные числа: " + a);
            }
            if (b % 2 == 0 & b%5==0) {
                System.out.println("Вывести четные числа: " + b);
            }
            if (c % 2 == 0 & c%5==0) {
                System.out.println("Вывести четные числа: " + c);
            }
*/


        /* System.out.print("Введите аргументы ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a);
        System.out.println(b);



        int x = 5;
        int y = 2;
        int z = 6;

        int c = --x + (++y*z--);

        x=x-1;//4
        y=y+1;//3
        // z = 6
        c = x + y*x; //4+3*6
        z=z-1; // 5

        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        String r = a!=0&&a>1 ? "выводить:" + b/a : "результат от сложения:" + (a+b);
        System.out.println(r);
        String w = a==-1 ? "выводить:" + (a+ b) : "результат от умножения:" + a*b;
        System.out.println(w);


        String v = a==0 ? "выводить:" + b : "результат от деления:" + a/b;
        System.out.println(v);

        int c = a % b; //остаток от деления

       String z = c!=0 ? "остаток от деления:" + c : "результат от деления:" + a/b;
       System.out.println(z);

        if (c != 0) {
            //если не 0, то выводим остаток
            System.out.println("остаток от деления:" + c);
        } else {
            //иначе результат деления - число
            System.out.println("результат деления: "+a / b);
        }


    }

}
 */
