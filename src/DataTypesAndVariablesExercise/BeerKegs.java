package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = 0;
        String beer = " ";
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double currentVolume = Math.PI * (Math.pow(radius, 2) * height);
            if (currentVolume > maxVolume){
                maxVolume = currentVolume;
                beer = model;
            }

        }
        System.out.println(beer);
    }
}
