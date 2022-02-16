package DataTypesVariables;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", thirdChar, secondChar, firstChar);

        // char a = scanner.nextLine().charAt(0);
        //        char b = scanner.nextLine().charAt(0);
        //        char c = scanner.nextLine().charAt(0);
        //
        //        int num = 0;
        //
        //
        //        num += a - '0';
        //        num *= 10;
        //        num += b - '0';
        //        num *= 10;
        //        num += c - '0';
        //
        //        System.out.printf("%d", num);


    }
}
