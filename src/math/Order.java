package math;

public class Order {

    public static long[] order(long[] array) {
        long[] array2 = new long[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = array2[i];
        }
        return array2;
    }
}
