package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        getMiddleCharacter(text);


    }
    private static void getMiddleCharacter(String text){
        int lengthText = text.length();
        int middleCharacter = lengthText / 2;
        if (lengthText % 2 == 0) {
            char char1 = text.charAt(middleCharacter);
            char char2 = text.charAt(middleCharacter - 1);
            System.out.println(char2 + "" + char1);
        } else {
            char char3 = text.charAt(middleCharacter);
            System.out.println(char3);
        }
    }
}
