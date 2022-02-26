package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double areal = calculateAreal(width, height);
        System.out.printf("%.0f", areal);

    }

    private static double calculateAreal(double width, double height){

        return width * height;
    }
}