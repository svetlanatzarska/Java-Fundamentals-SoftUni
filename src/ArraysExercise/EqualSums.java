package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
       int[] arrayWithZero = new int[input.length + 2];


        for (int i = 1, j = 0; i <= input.length; i++, j++) {
            arrayWithZero[i] = input[j];
        }
        arrayWithZero[arrayWithZero.length - 1] = 0;
        arrayWithZero[0] = 0;

        int sumLeft = 0;
        int sumRight = 0;
        int index = -1;

        for (int i = 0; i < arrayWithZero.length - 2; i++) {
            sumLeft += arrayWithZero[i];
            sumRight = 0;
            for (int j = arrayWithZero.length - 1; (j > 0 && (i + 1) < j); j--) {

                sumRight += arrayWithZero[j];

                if (sumLeft == sumRight && j - i == 2) {
                    index = i;
                }
            }
        }
        if (index > -1) {
            System.out.println(index);
        } else if (index == -1) {
            System.out.println("no");
        }



    }
}
