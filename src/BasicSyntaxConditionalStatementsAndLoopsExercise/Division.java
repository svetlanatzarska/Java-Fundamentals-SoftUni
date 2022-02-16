package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int num = 0;
        boolean isDivisable = true;
        if(number % 10 == 0){
           num = 10;
        }else if(number % 7 == 0){
            num = 7;
        }else if(number % 6 == 0){
            num = 6;
        }else if(number % 3 == 0){
            num = 3;
        }else if(number % 2 == 0){
            num = 2;
        }else{
            isDivisable = false;
        }
        if(isDivisable){
            System.out.println("The number is divisible by " + num);
        }else{
            System.out.println("Not Divisible");
        }
    }
}
