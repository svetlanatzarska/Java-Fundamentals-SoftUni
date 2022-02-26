package MoreExerciseArrays;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        double priceWithoutTaxes = 0;
        while (!command.equals("special") && !command.equals("regular")){
            double receipt = Double.parseDouble(command);
            if (receipt <= 0){
                System.out.println("Invalid price!");
            }else {
                priceWithoutTaxes += receipt;
            }

            command = scanner.nextLine();
        }
        double totalPrice = priceWithoutTaxes * 1.2;
        if (command.equals("special")){
           totalPrice -=totalPrice * 0.1 ;
        }

        if(totalPrice > 0){
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", priceWithoutTaxes * 0.2);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);

        }else {
            System.out.println("Invalid order!");
        }

    }
}
