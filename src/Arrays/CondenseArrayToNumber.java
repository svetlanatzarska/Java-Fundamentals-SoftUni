package Arrays;

import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 2 10 3
        String[] lineOfIndex = scanner.nextLine().split(" ");
        int[] number = new int[lineOfIndex.length];

        
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(lineOfIndex[i]);
        }
                while (number.length != 1){
                    int[] condensed = new int[number.length - 1];
                    for (int i = 0; i < number.length - 1; i++) {
                        condensed[i] = number[i] + number[i + 1];

                    }
                    number = condensed;

                }


        for (int i : number) {
            System.out.println(i);
        }


    }

    }

