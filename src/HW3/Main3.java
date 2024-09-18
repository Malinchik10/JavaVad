package HW3;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        System.out.print("Введите аргументы ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a);
        System.out.println(b);

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
