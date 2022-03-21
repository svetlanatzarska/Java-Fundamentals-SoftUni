package BasicSyntaxConditionalStatementsAndLoopssLab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            int odd = 1 + i * 2;
            System.out.println(odd);
            sum += odd;

        }



        /*int n = scanner.nextInt();
        int number = 1;
        int oddNumber = 0;
        int sum = 0;
        while (oddNumber < n){
            if(number % 2  != 0){
                System.out.println(number);
                sum += number;
                oddNumber++;
            }
            number++;

        }
        System.out.println("Sum: " + sum);

    }*/

    }
}
