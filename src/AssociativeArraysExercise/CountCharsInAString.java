package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s+");
        //char[] input = scan.nextLine().toCharArray();
        Map<Character, Integer> symbolOccurrence = new LinkedHashMap<>();

        for (String txt : text) {
            for (int i = 0; i < txt.length(); i++) {
                char symbol = txt.charAt(i);
                Integer occurrence = symbolOccurrence.get(symbol);
                if (occurrence != null) {
                    occurrence = 0;
                }
                symbolOccurrence.put(symbol, occurrence + 1);
            }
        }
       symbolOccurrence.forEach((key, value) -> System.out.printf("%c -> %d%n", key, value));

    }
}
