package BasicSyntaxConditionalStatementsAndLoopssLab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 30;
        if (minutes > 59) {
            hour += 1;
            minutes -= 60;
        }
        if (hour > 23){
            hour -= 24;

        }

        System.out.printf("%d:%02d", hour, minutes);



    }
}
