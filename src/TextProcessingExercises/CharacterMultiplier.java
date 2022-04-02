package TextProcessingExercises;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //George Peter
        String[] line = scanner.nextLine().split("\\s+");
        String first = line[0];
        String second = line[1];

        int max = Math.max(first.length(), second.length());
        int min = Math.min(first.length(), second.length());

        int sum = 0;
        for (int i = 0; i < max; i++) {
           if(i < min) {
               sum += first.charAt(i) * second.charAt(i);
           } else if(first.length() == min) {
               sum += second.charAt(i);
           } else {
               sum += first.charAt(i);
           }
        }
        System.out.println(sum);


    }
}
