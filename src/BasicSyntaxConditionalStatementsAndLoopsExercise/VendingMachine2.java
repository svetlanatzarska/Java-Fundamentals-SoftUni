package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sum = 0.0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();

        }
        input = scanner.nextLine();

        double price = 0;
        boolean isValid = false;
        while (!input.equals("End")) {

            switch (input){
                case "Nuts":
                    price = 2.0;
                    isValid = true;
                    break;
                case "Water":
                    price = 0.7;
                    isValid = true;
                    break;
                case "Crisps":
                    price = 1.5;
                    isValid = true;
                    break;
                case "Soda":
                    price = 0.8;
                    isValid = true;
                    break;
                case "Coke":
                    price = 1.0;
                    isValid = true;
                    break;
            }

            if (sum < price){
                System.out.println("Sorry, not enough money%n");
            }else if (isValid){
                sum -= price;
                System.out.printf("Purchased %s%n", input);
            }else {
                System.out.println("Invalid product");
            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);

    }


}
