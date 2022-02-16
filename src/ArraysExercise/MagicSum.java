package ArraysExercise;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] number = scanner.nextLine().split(" ");
        int givenNumber = Integer.parseInt(scanner.nextLine());

        int currentSum = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length ; j++) {
                currentSum = Integer.parseInt(number[i]) + Integer.parseInt(number[j]);
                if(currentSum == givenNumber){
                    System.out.println(number[i] + " " + number[j]);

                }
            }



        }
    }
}
