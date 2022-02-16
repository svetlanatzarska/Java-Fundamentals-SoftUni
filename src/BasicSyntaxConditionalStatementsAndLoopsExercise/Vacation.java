package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleGroup = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double singlePrice = 0.0;
        double totalPrice = 0.0;

        if (typeGroup.equals("Students")){
            if (day.equals("Friday"))
                singlePrice = 8.45;
            if (day.equals("Saturday"))
                singlePrice = 9.80;
            if( day.equals("Sunday"))
                singlePrice = 10.46;
        }
        else if (typeGroup.equals("Business")){
            if (day.equals("Friday"))
                singlePrice = 10.90;
            if (day.equals("Saturday"))
                singlePrice = 15.60;
            if( day.equals("Sunday"))
                singlePrice = 16;
        }
        else if (typeGroup.equals("Regular")){
            if (day.equals("Friday"))
                singlePrice = 15;
            if (day.equals("Saturday"))
                singlePrice = 20;
            if( day.equals("Sunday"))
                singlePrice = 22.50;
        }

    if (typeGroup.equals("Business") && peopleGroup >= 100) {
        peopleGroup -= 10;
    }

        totalPrice = peopleGroup * singlePrice;

        if (typeGroup.equals("Students") && peopleGroup >= 30){
            totalPrice *= 0.85;
        }
        if (typeGroup.equals("Regular") && peopleGroup >= 10 && peopleGroup <= 20){
            totalPrice *= 0.95;
        }

        System.out.printf("Total price: %.2f", totalPrice);
        }
    }

