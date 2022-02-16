package Arrays;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineOfNumber = scanner.nextLine().split("\\s+");
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < lineOfNumber.length; i++) {
            int currentNumber = Integer.parseInt(lineOfNumber[i]);

            if(currentNumber % 2 == 0){
                sumEven += currentNumber;
            }else {
                sumOdd += currentNumber;
            }
        }
        System.out.printf("%d", (sumEven - sumOdd));
    }
}
