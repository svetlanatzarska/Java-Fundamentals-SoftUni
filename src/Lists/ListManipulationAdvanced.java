package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = getLineAsNumber(scanner);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] splitInput = input.split(" ");
            String command = splitInput[0];

            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(splitInput[1]);
                    if (numbers.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    List<Integer> newList = checkEvenOrOdd(splitInput, numbers);
                    for (Integer integer : newList) {
                        System.out.print(integer + " ");
                    }
                    System.out.println(" ");
                    break;
                case "Get":
                    System.out.println(getSumOfAllNumbers(numbers));
                    break;
                case "Filter":
                    List<Integer> filteredList = filterNumbers(splitInput, numbers);
                    for (Integer integer : filteredList) {
                        System.out.print(integer + " ");
                    }
                    System.out.println(" ");

                    break;


            }

            input = scanner.nextLine();
        }

    }

    private static List<Integer> getLineAsNumber(Scanner scanner) {
        String line = scanner.nextLine();
        String[] splitLine = line.split("\\s+");
        List<Integer> newArrayList = new ArrayList<>();

        for (String s : splitLine) {
            int num = Integer.parseInt(s);
            newArrayList.add(num);
        }
        return newArrayList;
    }

    private static List<Integer> checkEvenOrOdd(String[] splitInput, List<Integer> numbers) {
        List<Integer> evenArrayList = new ArrayList<>();
        List<Integer> oddArrayList = new ArrayList<>();
        if (splitInput[1].equals("even")) {
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    evenArrayList.add(number);
                }
            }
            return evenArrayList;
        } else {
            for (Integer number : numbers) {
                if (number % 2 != 0) {
                    oddArrayList.add(number);
                }
            }
        }
        return oddArrayList;
    }
    private static int getSumOfAllNumbers(List<Integer> numbers){
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
    private static List<Integer> filterNumbers(String[] input, List<Integer> numbers){
        List<Integer> filteredArrayList = new ArrayList<>();
        int number = Integer.parseInt(input[2]);
        String symbol = input[1];

        for (Integer num : numbers) {
            switch (symbol){
                case "<":
                    if (num < number){
                        filteredArrayList.add(num);
                    }
                    break;
                case ">":
                    if (num > number){
                        filteredArrayList.add(num);
                    }
                    break;
                case "<=":
                    if (num <= number){
                        filteredArrayList.add(num);
                    }
                    break;
                case ">=":
                    if (num >= number){
                        filteredArrayList.add(num);
                    }
                    break;
            }
        }
    return filteredArrayList;
    }
}
