package MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        isTopInteger(n);
    }

    private static void isTopInteger(int n){
        for (int i = 17; i <= n; i++) {
            boolean odd = false;
            int num = i;
            int sum = 0;

            while (num > 0){
                int lastDigits = num % 10;
                if(lastDigits % 2 != 0){
                    odd = true;
                    }
                sum += lastDigits;
                num /= 10;
            }
            if(sum % 8 == 0 && odd) {
                System.out.println(i);
            }


            }


    }
}
