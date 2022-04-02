package TextProcessingExercises;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            char moved = (char) (letter + 3);
            sb.append(moved);
        }
        System.out.println(sb);

    }
}
