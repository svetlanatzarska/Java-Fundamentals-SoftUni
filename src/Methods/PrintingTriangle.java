package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        numberTriangleIncreasing(number);
        numberTriangleDecreasing(number);

    }
    static void numberTriangleIncreasing(int length){
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
                if(j != length){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static void numberTriangleDecreasing(int length){
        for (int i = length; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
                if(j < i)
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
