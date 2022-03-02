package Methods;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvensOdds(num));


    }
    public static int getMultipleOfEvensOdds(int num){
        int evenSum = getEvenSum(num);
        int oddSum = getOddSum(num);

        return evenSum * oddSum;
    }
    public static int getEvenSum( int num){
        int evenSum = 0;
        while (num != 0 ){
            int currentNum = num % 10;
            if (currentNum % 2 == 0){
                evenSum += currentNum;
            }
            num /= 10;
        }
        return evenSum;
    }
    public static int getOddSum(int num){
        int oddSUm = 0;
        while (num != 0){
            int currentSum = num % 10;
            if(currentSum % 2 != 0){
                oddSUm += currentSum;
            }
            num /= 10;
        }
        return oddSUm;
    }
}
