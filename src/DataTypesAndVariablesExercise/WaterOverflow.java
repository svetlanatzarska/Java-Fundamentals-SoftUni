package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //water tank with a capacity of 255 liters
        int n = Integer.parseInt(scanner.nextLine());

        int tank = 0;
        for (int i = 0; i < n; i++) {
            int quantityWater = Integer.parseInt(scanner.nextLine());

            if (tank + quantityWater > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            tank += quantityWater;
        }
        System.out.println(tank);
    }
}
