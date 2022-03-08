package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = getLineAsNumber(scanner);

        String line = scanner.nextLine();
        while (!line.equals("end")){
            String[] input = line.split(" ");
            String command = input[0];
            int num = 0;
            switch (command){
                case "Add":
                    num = getNum(input);
                    numbers.add(num);
                    break;
                case "Remove":
                    num = getNum(input);
                    numbers.remove(Integer.valueOf(num));
                    break;
                case "RemoveAt":
                    num = getNum(input);
                    numbers.remove(num);
                    break;
                case "Insert":
                    num = getNum(input);
                    int index = Integer.parseInt(input[2]);
                    numbers.add(index, num);
                    break;
            }
            line = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");

        }

    }
    private static int getNum(String[] input){
        return Integer.parseInt(input[1]);
    }
    private static List<Integer> getLineAsNumber(Scanner scanner){
        String input = scanner.nextLine();
        String[] split = input.split("\\s+");
        List<Integer> newArrayList = new ArrayList<>();
        for (String s : split) {
            int num = Integer.parseInt(s);
            newArrayList.add(num);
        }
        return newArrayList;
    }
}
