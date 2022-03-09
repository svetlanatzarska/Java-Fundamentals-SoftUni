package BasicSyntaxConditionalStatementsAndLoopssLab;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfDay = scanner.nextLine();
        int age = scanner.nextInt();

        if (typeOfDay.equals("Weekday")) {
            if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                System.out.println("12$");
            } else if (18 < age && age <= 64) {
                System.out.println("18$");
            } else{
                System.out.println("Error!");
            }
        } else if(typeOfDay.equals("Weekend")){
            if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                System.out.println("15$");
            } else if (18 < age && age <= 64) {
                System.out.println("20$");
            }else {
                System.out.println("Error!");
            }
        }else if(typeOfDay.equals("Holiday")){
            if (0 <= age && age <= 18) {
                System.out.println("5$");
            } else if (18 < age && age <= 64) {
                System.out.println("12$");
            } else if (64 < age && age <= 122) {
                System.out.println("10$");
            } else {
                System.out.println("Error!");
            }


        }







    }
}
