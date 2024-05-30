package math;

public class SumOfNumbers {

    public static long sumNumber(long number) {
        long summa = 0;
        for (long i = 1; i <= number; i++) {
            summa = summa + i;
        }
        return summa;
    }
}
