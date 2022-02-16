package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //245678
        int input = scanner.nextInt();

        int sum = 0;
        while ( input != 0){
            int digits = input % 10;
            sum += digits;
            input = input / 10;
        }


        System.out.println(sum);

    }
}
