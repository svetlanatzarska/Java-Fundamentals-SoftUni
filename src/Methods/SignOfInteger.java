package Methods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printSign(number);
    }

    static void printSign(int number){
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number == 0) {
            System.out.printf("The number %d is zero.", number);
        } else {
            System.out.printf("The number %d is negative.", number);
        }

    }
}
