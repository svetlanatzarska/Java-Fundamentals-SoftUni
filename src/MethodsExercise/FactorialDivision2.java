package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double division = factorial(num1) / factorial(num2);

        System.out.printf("%.2f", division);

    }

    private static Double factorial(int num) {
        double factorial = 1;
        for (int i = 0; i < num; i++) {
            factorial *= num - i;
            }
        return factorial;
    }

}
