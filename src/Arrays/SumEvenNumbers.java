package Arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read an array from the console and sum only the even numbers - 1 2 3 4 5 6
        String lineOfNumbers = scanner.nextLine();
       String [] numberOfString =  lineOfNumbers.split(" ");
        int sum = 0;
        for (int i = 0; i < numberOfString.length; i++) {
            int currentNumber = Integer.parseInt(numberOfString[i]);

            if(currentNumber % 2 == 0){
                sum += currentNumber;
        }

        }
        System.out.println(sum);
    }
}
