package DataTypesVariables;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c",a, b, c);








        // 27-,8'1
        /*
        String input = scanner.nextLine();
        int number = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if ('0' <= c || c >= '9') {
                int digits = c - '0';
                number *= 10;
                number += c - '0';

            }
        }
        System.out.println(number);

         */


    }
}
