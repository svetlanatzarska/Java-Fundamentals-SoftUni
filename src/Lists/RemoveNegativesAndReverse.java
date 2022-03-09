package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = getLineAsNumber(scanner);
        List<Integer> arrayOfPositiveNumbers = filterNegativeNumbers(numbers);


        if(arrayOfPositiveNumbers.isEmpty()){
            System.out.println("empty");}
        else {
            Collections.reverse(arrayOfPositiveNumbers);
            for (Integer number : arrayOfPositiveNumbers) {
            System.out.print(number + " ");
            }
        }
    }
    private static List<Integer> getLineAsNumber(Scanner scanner){
        String[] lineOfNumber = scanner.nextLine().split("\\s+");
        List<Integer> arrayAsList = new ArrayList<>();
        for (String s : lineOfNumber) {
            int num = Integer.parseInt(s);
            arrayAsList.add(num);
        }
        return arrayAsList;
    }
    private static List<Integer> filterNegativeNumbers(List<Integer> numbers){
        List<Integer> arrayOfPositiveNumbers = new ArrayList<>();

        int positiveNum = 1;
        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            if(currentNum >= positiveNum){
                arrayOfPositiveNumbers.add(currentNum);
            }
        }
        return arrayOfPositiveNumbers;
    }
}
