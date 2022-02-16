package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //145
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int num = number;
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int digits = num % 10;
            num /= 10;

            int fac = 1;
            for (int j = 1; j <= digits; j++) {
                fac *= j;
            }
            sum += fac;

        }
        if (sum == number){
            System.out.println("yes");

        }else {
            System.out.println("no");

        }
    }
}
