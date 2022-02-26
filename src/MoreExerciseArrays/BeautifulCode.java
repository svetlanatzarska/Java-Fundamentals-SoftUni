package MoreExerciseArrays;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Scanner;

public class BeautifulCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String[] line = scanner.nextLine().split(" ");

        int remainingPeople = people;
        int[] lift = new int[line.length];

        for (int i = 0; i <lift.length ; i++) {
            lift[i] = Integer.parseInt(line[i]);
            int peopleToAdd = 4 - lift[i];

            if (remainingPeople <= 0) {
                continue;
            }

            if (remainingPeople < peopleToAdd) {

                lift[i] = peopleToAdd + (remainingPeople - peopleToAdd);
                remainingPeople = 0;
                continue;
            }

            if (i == lift.length -1 ) {
                if (remainingPeople <= 0) {
                    lift[i] = peopleToAdd + remainingPeople;
                }
                else {
                    lift[i] = peopleToAdd;
                    remainingPeople = remainingPeople + peopleToAdd*-1;
                }
            }
            else {
                if (remainingPeople <= 0) {
                    lift[i] = peopleToAdd + remainingPeople;
                    break;
                }
                else {
                    remainingPeople = remainingPeople + peopleToAdd*-1;
                    lift[i] = lift[i] + peopleToAdd;
                }
            }

            //remainingPeople = people;
            //System.out.println(lift[i]);
        }


        if (remainingPeople < 0)
        {

            System.out.println("The lift has empty spots!");
            for (int i = 0; i <lift.length ; i++) {
                System.out.print(lift[i]+" ");
            }
        }

        if (remainingPeople == 0) {
            System.out.println("The lift has empty spots!");
            for (int i = 0; i < lift.length; i++) {
                System.out.print(lift[i] + " ");
            }
        }
        else
        {
            System.out.printf("There isn't enough space! %d people in a queue!%n", remainingPeople);
            for (int i = 0; i < lift.length; i++) {
                System.out.print(lift[i] + " ");
            }
        }
    }
}
