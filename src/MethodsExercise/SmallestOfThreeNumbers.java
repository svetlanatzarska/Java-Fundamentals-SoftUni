package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println(getSmallestNum(num1, num2, num3));
    }

    private static int getSmallestNum( int num1, int num2, int num3){
        int[] numbers = new int[]{num1, num2, num3};
        Arrays.sort(numbers);

        return numbers[0];
    }
}
