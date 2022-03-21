package AssociativeArraysLab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");

        Map<String, Integer> wordsOccurrenceOddNum = new LinkedHashMap<>();
        for (String word : line) {
            String lowerCaseWord = word.toLowerCase();
            Integer occurrence = wordsOccurrenceOddNum.get(lowerCaseWord);
            if(occurrence == null) {
                occurrence = 0;
            }
            wordsOccurrenceOddNum.put(lowerCaseWord, occurrence + 1);
        }

        List<String> odd = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsOccurrenceOddNum.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odd.add(entry.getKey());
            }
        }

        for (int i = 0; i < odd.size(); i++) {
            System.out.print(odd.get(i));
            if(i < odd.size() - 1) {
                System.out.print(", ");

            }
            
        }


    }
}
