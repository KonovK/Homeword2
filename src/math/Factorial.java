package math;

public class Factorial {

    public static int factorialNumber(int number) {
        int a = number;
        for (int i = 1; i < a; i++){
            number = number * i;
        }
        return number;
    }
}
