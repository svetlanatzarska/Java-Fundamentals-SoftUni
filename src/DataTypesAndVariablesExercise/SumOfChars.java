package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //[1…20]
        short n = Short.parseShort(scanner.nextLine());

        int sum = 0;
        for (short i = 0; i < n; i++) {
            char c = scanner.nextLine().charAt(0);
           sum += c;
        }
        System.out.println("The sum equals: " + sum);
    }
}
