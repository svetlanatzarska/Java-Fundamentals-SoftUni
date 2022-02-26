package Arrays;

import java.util.Scanner;

public class BurgerBusMinExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCities = Integer.parseInt(scanner.nextLine());

        double moneyEarned = 0;
        double totalProfit = 0;
        for (int i = 1; i <= numberOfCities; i++) {
            String city = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());
            if(i % 3 == 0 && i != 15){
                expenses = expenses + expenses * 0.5;
                moneyEarned = income - expenses;
            }else if( i % 5 == 0){
                income = income - income * 0.1;
                moneyEarned = income - expenses;
            } else {
                moneyEarned = income - expenses;
            }
            totalProfit += moneyEarned;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", city, moneyEarned);

        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);

    }
    }

