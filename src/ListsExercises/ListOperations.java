package ListsExercises;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = getLineAsNumber(scanner);
        String line = scanner.nextLine();

        while (!line.equals("End")){
            String[] command = line.split("\\s+");
            String operations = command[0];
            switch (operations){
                case "Add":
                    numbers.add(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    int num = Integer.parseInt(command[1]);
                    if(index < 0 || index >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(index, num);
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(command[1]);
                    if(index < 0 || index >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(index);
                    }
                    break;
                case "Shift":
                    if(command[1].equals("right")) {
                        rotateToTheRight(command, numbers);

                    } else {
                        rotateToTheLeft(command, numbers);
                    }
                    break;
            }

            line = scanner.nextLine();
        }

       numbers.forEach(number -> System.out.print(number + " "));


    }
    private static void rotateToTheLeft(String[] command, List<Integer> numbers){
        int rotation = Integer.parseInt(command[2]);
        //1 2 3
        for (int i = 0; i < rotation; i++) {
            numbers.add(numbers.get(0));
            numbers.remove(0);
        }
    }
    private static void rotateToTheRight(String[] command, List<Integer> numbers){
        int rotation = Integer.parseInt(command[2]);
        for (int i = 0; i < rotation; i++) {
            numbers.add(0, numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);
        }
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
