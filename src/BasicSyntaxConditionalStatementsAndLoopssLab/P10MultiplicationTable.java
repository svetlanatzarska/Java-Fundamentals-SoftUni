package BasicSyntaxConditionalStatementsAndLoopssLab;

import java.util.Scanner;

public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {
            int sum = integer * i;
            System.out.printf("%d X %d = %d%n", integer, i, sum);


        }
    }
}
