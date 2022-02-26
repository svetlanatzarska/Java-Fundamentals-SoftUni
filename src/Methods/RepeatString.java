package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int repeatS = Integer.parseInt(scanner.nextLine());

        String repeated = repeatString(s, repeatS);

        System.out.println(repeated);


    }
    private static String repeatString(String s, int repeatS){
        String[] repeatedStrings = new String[repeatS];

        for (int i = 0; i < repeatedStrings.length; i++) {
            repeatedStrings[i] = s;
        }
        String repeated = String.join("", repeatedStrings);

        return repeated;
    }
}
