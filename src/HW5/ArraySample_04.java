package HW5;

public class ArraySample_04 {
    public static void main(String[] args)
    {
        int size = 10;
        var array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        print(array);

        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0)
            {
                array[i] = 0;
            }
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
