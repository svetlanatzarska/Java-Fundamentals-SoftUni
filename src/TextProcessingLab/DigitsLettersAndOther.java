package TextProcessingLab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if(Character.isDigit(symbol)) {
                System.out.print(symbol);
            }
        }
        System.out.println();
        for (int i = 0; i < text.length() ; i++) {
            char symbol = text.charAt(i);
            if(Character.isLetter(symbol)) {
                System.out.print(symbol);
            }
        }
        System.out.println();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if(!Character.isDigit(symbol) && !Character.isLetter(symbol)) {
                System.out.print(symbol);

            }

        }




    }
}
