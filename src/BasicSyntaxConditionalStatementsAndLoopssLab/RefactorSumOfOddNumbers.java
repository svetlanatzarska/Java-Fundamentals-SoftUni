package BasicSyntaxConditionalStatementsAndLoopssLab;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(i * 2 + 1);
            sum += i * 2 + 1;

        }
        System.out.println("Sum: " + sum);
        }

        }

