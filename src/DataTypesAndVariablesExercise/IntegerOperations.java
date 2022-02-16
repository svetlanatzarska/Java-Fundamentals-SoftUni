package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int addFirst = scanner.nextInt();
        int addSecondNum = scanner.nextInt();
        int divideThird = scanner.nextInt();
        int multiplyFourth = scanner.nextInt();

        int result = ((addFirst + addSecondNum) / divideThird) * multiplyFourth;
        System.out.println(result);



    }
}
