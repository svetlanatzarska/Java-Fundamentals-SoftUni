package MoreExerciseArrays;


import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String[] line = scanner.nextLine().split(" ");

        int[] lift = new int[line.length];
        for (int i = 0; i < lift.length; i++) {
            lift[i] = Integer.parseInt(line[i]);
        }
        int remainingPeople = people;
        boolean isEmpty = false;
        for (int i = 0; i < lift.length; i++) {
            if (people == 0) {
                isEmpty = true;
                break;
            }
            if (lift[i] == 0 && remainingPeople >= 4) {
                remainingPeople -= 4;
                lift[i] += 4;
            } else if (lift[i] == 1 && remainingPeople >= 3) {
                remainingPeople -= 3;
                lift[i] += 3;
            } else if (lift[i] == 2 && remainingPeople >= 2) {
                remainingPeople -= 2;
                lift[i] += 2;
            } else if (lift[i] == 3 && remainingPeople >= 1) {
                remainingPeople -= 1;
                lift[i] += 1;
            } else if (lift[i] == 4) {
                lift[i] += 0;
            } else {
                lift[i] += remainingPeople;
                isEmpty = true;
            }
        }
        if (isEmpty) {
            System.out.println("The lift has empty spots!");
            for (int i = 0; i < lift.length; i++) {
                System.out.print(lift[i] + " ");
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", remainingPeople);
            for (int i = 0; i < lift.length; i++) {
                System.out.print(lift[i] + " ");

            }
        }

    }
}

