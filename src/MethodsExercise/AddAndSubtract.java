package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println(subtract(sumFirstTwoNumbers(num1, num2),num3));

    }
    private static int sumFirstTwoNumbers(int num1, int num2){
        return num1 + num2;
    }
    private static int subtract(int sum, int num3){
        return  sum - num3;
    }

}
