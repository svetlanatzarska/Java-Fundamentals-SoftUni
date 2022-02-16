package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrOfIndex = scanner.nextLine().split(" ");
        for (int i = 0; i < arrOfIndex.length / 2; i++) {
            String lastIndex = arrOfIndex[i];
            arrOfIndex[i] = arrOfIndex[arrOfIndex.length - 1 - i];
            arrOfIndex[arrOfIndex.length - 1 - i] = lastIndex;


        }
        System.out.println(String.join(" ", arrOfIndex));
    }
}
