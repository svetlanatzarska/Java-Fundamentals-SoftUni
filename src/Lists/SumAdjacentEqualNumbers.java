package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 3 3 6 1
        List<Double> number = new ArrayList<>();
        String[] line = scanner.nextLine().split(" ");

        for (int i = 0; i < line.length; i++) {
            number.add(Double.parseDouble(line[i]));
        }

        List<Double> nextDouble = adjacentNumbers(number);
        while (nextDouble.size() != number.size()){
            number = nextDouble;
            nextDouble = adjacentNumbers(number);
        }
        String output = " ";
        for (Double aDouble : number) {
            output += (new DecimalFormat("0. #").format(aDouble));
        }

        System.out.println(output);



    }

    private static List<Double> adjacentNumbers(List<Double> number) {
        List<Double> nextDouble = new ArrayList<>();
        int i = 0;
        while (i< number.size()){
            if (i < number.size() - 1 && number.get(i).equals(number.get(i + 1))) {
              nextDouble.add(number.get(i) + number.get(i + 1));
              i+=2;

            } else {
                nextDouble.add(number.get(i));
                i++;

            }
        }
        return nextDouble;
    }


}



