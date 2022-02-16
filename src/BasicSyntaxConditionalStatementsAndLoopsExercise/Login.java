package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine(); // resA

        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);

        }
        String input = scanner.nextLine();
        int count = 0;
        boolean isLoggedIn = true;

        while (!input.equals(password)) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!", username);
                isLoggedIn = false;
                break;
            } else {
                System.out.println("Incorrect password. Try again.");

            }

            input = scanner.nextLine();
        }
        if (isLoggedIn) {
            System.out.printf("User %s logged in.", username);
        }


    }

}

