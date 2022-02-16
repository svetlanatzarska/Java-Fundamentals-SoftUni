package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double finalPrice = 0.0;
        for (int i = 0; i < n; i++) {
            double priceCapsule = scanner.nextDouble();
            int days = scanner.nextInt();
            int capsuleCount = scanner.nextInt();
            double totalPrice = (days * capsuleCount) * priceCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", totalPrice);
            finalPrice += totalPrice;

        }
        System.out.printf("Total: $%.2f", finalPrice);

    }
}
