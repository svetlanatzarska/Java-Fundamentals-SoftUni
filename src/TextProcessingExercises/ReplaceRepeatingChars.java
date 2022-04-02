package TextProcessingExercises;

import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length() - 1; i++) {
            char first = line.charAt(i);
            char second = line.charAt(i + 1);
            if (first != second) {
                sb.append(first);
            }
        }
        sb.append(line.charAt(line.length()-1));
        System.out.println(sb);
    }
}
