package ArraysExercise;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        for (int i = 0; i < line.length; i++) {
            boolean isBigger = true;

            for (int j = i + 1; j < line.length; j++) {
                if(Integer.parseInt(line[i]) <= Integer.parseInt(line[j])){
                    isBigger = false;
                }
            }

            if(isBigger){
                System.out.print(line[i] + " ");

            }
        }

    }
}
