package AssociativeArraysLab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> words = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String currentSynonym = scanner.nextLine();

            List<String> synonyms = words.get(word);
            if(synonyms == null) {
                synonyms = new ArrayList<>();
                words.put(word, synonyms);
            }
            synonyms.add(currentSynonym);
        }
        for (Map.Entry<String, List<String>> word : words.entrySet()) {
            System.out.println(word.getKey() + " - " + String.join(", ", word.getValue()));
        }


    }
}