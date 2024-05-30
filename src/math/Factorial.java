package math;

public class Factorial {

    public static long factorialNumber(long number) {
        long a = number;
        for (long i = 1; i < a; i++){
            number = number * i;
        }
        return number;
    }
}
