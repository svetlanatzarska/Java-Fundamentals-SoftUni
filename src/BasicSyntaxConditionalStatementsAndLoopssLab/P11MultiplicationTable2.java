package BasicSyntaxConditionalStatementsAndLoopssLab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theInteger = scanner.nextInt();
        int times = scanner.nextInt();

        for (int i = times; i <= 10 ; i++) {
            System.out.printf("%d X %d = %d%n", theInteger, times, theInteger * times);

        }
        if(times > 10){
            System.out.printf("%d X %d = %d%n", theInteger, times, theInteger * times);

        }
    }
}

