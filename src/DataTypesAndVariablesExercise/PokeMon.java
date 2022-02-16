package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int target = 0;
        double halfValueN = n * 0.50;
        while (n >= m){
            n -= m;
            target ++;
            if(n == halfValueN && y != 0){
                n /= y;

            }


        }
        System.out.printf("%d%n%d", n, target);

    }
}
