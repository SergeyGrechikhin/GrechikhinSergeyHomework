package javapro.homework12.task4;

public class Factorial {
    public static void main(String[] args) {
        FactorialInterface factorial = f -> {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.factorial(5));
    }
}
