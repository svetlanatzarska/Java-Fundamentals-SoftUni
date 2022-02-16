package ArraysExercise;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lineOfNumber = scanner.nextLine().split(" ");
        int[] inputArr = new int[lineOfNumber.length];

        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = Integer.parseInt(lineOfNumber[i]);
        }
        int count = 1;
        int max = 0;
        int element = inputArr[0];

        for (int i = 1; i < inputArr.length; i++) {

            if (inputArr[i] == inputArr[i - 1]) {
                count++;

                if (count > max) {

                    max = count;
                    element = inputArr[i];

                }
            } else
                count = 1;

        }

        for (int i = 0; i < max; i++) {

            System.out.print(element + " ");
        }

        }


    }
