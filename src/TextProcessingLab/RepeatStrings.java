package TextProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        List<String> repeated = new ArrayList<>();
        for (String word : line) {
            repeated.add(repeat(word, word.length()));

        }
        for (String word : repeated) {
            System.out.print(word);
        }


    }
    private static String repeat(String word, int length) {
        char[] repeated = new char[word.length() * length];

        for (int i = 0; i < repeated.length; i++) {
            repeated[i] = word.charAt(i % word.length());
        }
        return new String (repeated);
    }
}
