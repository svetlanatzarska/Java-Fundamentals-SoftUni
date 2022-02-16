package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        double maxValue = 0;
        int maxSnow = 0;
        int maxTime = 0;
        int maxQuality = 0;
        for (int i = 0; i < n; i++) {
            int snowballSnow = scanner.nextInt();
            int snowballTime = scanner.nextInt();
            int snowballQuality = scanner.nextInt();
            double snowValue = Math.pow((snowballSnow / snowballTime),snowballQuality);

            if(maxValue < snowValue){
                maxValue = snowValue;
                maxSnow = snowballSnow;
                maxTime = snowballTime;
                maxQuality = snowballQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnow, maxTime, maxValue, maxQuality);
    }
}
