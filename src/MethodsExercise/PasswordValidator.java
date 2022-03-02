package MethodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (verifyCountCharacters(password) && verifyTwoDigits(password) &&
                verifyContentOfLettersAndDigits(password)) {
            System.out.println("Password is valid");
        }
        if (!verifyCountCharacters(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!verifyContentOfLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!verifyTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    private static boolean verifyCountCharacters(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean verifyContentOfLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbols = password.toLowerCase(Locale.ROOT).charAt(i);
            if ((symbols < 48 || symbols > 57) && (symbols < 97 || symbols > 122)) {
                return false;
            }
        }
        return true;
    }

    private static boolean verifyTwoDigits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbols = password.toLowerCase(Locale.ROOT).charAt(i);
            if (symbols >= 48 && symbols <= 57) {
                counter++;
            }
        }
        return counter >= 2;
    }

}