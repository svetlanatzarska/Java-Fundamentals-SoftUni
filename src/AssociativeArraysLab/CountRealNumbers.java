package AssociativeArraysLab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double, Integer> numberCounts = new TreeMap<>();
        for (double number : numbers) {
            if(numberCounts.containsKey(number)) {
                int currentCount = numberCounts.get(number);
                numberCounts.put(number, currentCount + 1);
            } else {
                numberCounts.put(number, 1);
            }

        }
        for (Map.Entry<Double, Integer> entry : numberCounts.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(), entry.getValue());
        }


    }
}
