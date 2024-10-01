package HW5;

public class ArraySample_03 {
    public static void main(String[] args)
    {
        int size = 100;
        var array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        print(array);
    }

    private static void print(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
