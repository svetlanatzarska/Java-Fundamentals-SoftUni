package ListsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = getLineAsNumber(scanner);
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String [] data = input.split("\\s+");
            switch (data[0]) {
                case "Delete" -> numbers = deleteAllElementsEqualToGivenNumber(numbers, data);
                case "Insert" -> insertElementAtGivenPosition(numbers, data);
            }
            input = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
    private static void insertElementAtGivenPosition(List<Integer> numbers, String[] data){
        int element = Integer.parseInt(data[1]);
        int index = Integer.parseInt(data[2]);
        if (index >= 0 && index <= numbers.size()) {
            numbers.add(index, element);
        }
    }

    private static List<Integer> deleteAllElementsEqualToGivenNumber(List<Integer> numbers, String[] data){
        int givenNumber = Integer.parseInt(data[1]);
        List<Integer> newArrayList = new ArrayList<>();
        for (Integer number : numbers) {
            if(number != givenNumber){
                newArrayList.add(number);
            }
        }
        return newArrayList;
    }

    private static List<Integer> getLineAsNumber(Scanner scanner){
        String[] line = scanner.nextLine().split("\\s+");
        List<Integer> newArrayList = new ArrayList<>();
        for (String s : line) {
            int num = Integer.parseInt(s);
            newArrayList.add(num);
        }
        return newArrayList;
    }
}
