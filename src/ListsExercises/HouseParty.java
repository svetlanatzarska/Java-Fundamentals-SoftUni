package ListsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commands = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < commands; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String name = command[0];
            String checkWord = command[2];
            if(checkWord.equals("going!")) {
                if (!guests.contains(name)){
                   guests.add(name);
                } else {
                    System.out.printf("%s is already in the list!%n", name);
                }

            } else {
                if (guests.contains(name)){
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }

        guests.forEach(System.out::println);
        }
    }

