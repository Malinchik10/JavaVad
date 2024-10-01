package HW5;

public class ArraySamples {
    public static void main(String[] args) {

/*
        int s= 3;
        int t []=new int  [s];
        int sycle;
        for (sycle=0; sycle <s; sycle++){
            int r = (int) (Math.random()*76);
            t[sycle]=r;
        }
        System.out.println(Arrays.toString(t));
*/
        int[] numbers = {3, 5, 7, 2, 8, 1, 4, 10, 12};

        int max = 0;
        int min = 0;

        for (int i = 1; i < numbers.length; i++) { //метод, который возвращает кол-во эл-в в массиве
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Максимальное число: " + max);
        System.out.println("Максимальное число: " + min);

    }
}
