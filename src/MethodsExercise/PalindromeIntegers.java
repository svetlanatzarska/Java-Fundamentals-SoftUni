package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            int number = Integer.parseInt(command);
            isPalindromeOrNot(command);
            command = scanner.nextLine();
        }
    }

    private static void isPalindromeOrNot(String command) {
        String reversed = "";
        for (int i = command.length() - 1; i >= 0; i--) {
            reversed += command.charAt(i);
        }
        if (reversed.equals(command)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
