package Arrays;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        int[] firstArr = new int[input1.length];
        int[] secondArr = new int[input2.length];

        for (int i = 0; i < input1.length; i++) {
            firstArr[i] = Integer.parseInt(input1[i]);
            secondArr[i] = Integer.parseInt(input2[i]);

        }

        int sum = 0;
        int index = 0;
        boolean arrAreEqual = true;
        for (int i = 0; i < firstArr.length; i++) {
            arrAreEqual = true;
            sum += firstArr[i];
             if (firstArr[i] != secondArr[i]){
                 arrAreEqual = false;
                 index = i;
                 break;
             }
        }
            if(arrAreEqual){
                System.out.printf("Arrays are identical. Sum: %d", sum);
            }else  {
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);


        }






    }
}
