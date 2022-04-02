package TextProcessingExercises;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userNames = scanner.nextLine().split(", ");

        for (int i = 0; i < userNames.length; i++) {
            String userName = userNames[i];

            if (isValid(userName)) {
                System.out.println( userName);
            }
        }


    }
    private static Boolean isValid(String currentName) {
        if(currentName.length() < 3 || currentName.length() > 16 ) {
            return false;
        }
        for (int i = 0; i < currentName.length(); i++) {
            char symbol = currentName.charAt(i);
            if(!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }

        }
        return true;
    }
}
