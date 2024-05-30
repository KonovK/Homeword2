package math;

public class Factorial {

    public static long factorialNumber(long number) {
        long condition = number;
        for (long i = 1; i < condition; i++){
            number = number * i;
        }
        return number;
    }
}
