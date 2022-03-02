package MethodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class MiddleCharacters2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        getMiddleCharacter(text);
    }

    private static void getMiddleCharacter(String text) {
        if (text.length() % 2 == 0) {
            System.out.print(text.charAt(text.length() / 2 - 1));
            System.out.print(text.charAt(text.length() / 2));

        } else {
            System.out.println(text.charAt(text.length() / 2));
        }
    }
}