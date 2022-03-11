package ListsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = getLineAsNumber(scanner);
        int wagonMaxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String[] splitInput = input.split("\\s+");
            String data = splitInput[0];
            if (data.equals("Add")) {
                wagons.add(Integer.parseInt(splitInput[1]));
            } else {
                int newPassengers = Integer.parseInt(splitInput[0]);
                int index = 0;
                for (Integer wagon : wagons) {
                    int passengers = wagon + newPassengers;
                    int result = wagonMaxCapacity - passengers;
                    if (result >= 0) {
                        wagons.set(index, passengers);
                        break;
                    }
                    index++;
                }
            }

            input = scanner.nextLine();
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }

    private static List<Integer> getLineAsNumber(Scanner scanner) {
        String[] line = scanner.nextLine().split("\\s+");
        List<Integer> newListArray = new ArrayList<>();
        for (String s : line) {
            int num = Integer.parseInt(s);
            newListArray.add(num);
        }
        return newListArray;
    }
}
