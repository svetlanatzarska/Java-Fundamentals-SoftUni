package AssociativeArraysLab;

import java.util.*;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineOfWords = scanner.nextLine().split("\\s+");

       lineOfWords = Arrays.stream(lineOfWords)
               .filter(w -> w.length() % 2 == 0)
               .toArray(String[]::new);


        Arrays.stream(lineOfWords)
                .forEach(System.out::println);

    }
}