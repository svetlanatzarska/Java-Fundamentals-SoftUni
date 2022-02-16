package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prints part of the ASCII table
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start; i <= end ; i++) {
            //char c = (char)i;
            System.out.printf("%c ", i);

        }


    }
}
