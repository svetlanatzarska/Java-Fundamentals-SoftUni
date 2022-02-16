package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peopleNum = scanner.nextDouble();
        int elevatorCapacity = scanner.nextInt();

         double courses = Math.ceil(peopleNum / elevatorCapacity);
        System.out.printf("%.0f", courses);
       /* int sum = peopleNum / elevatorCapacity;

        if (peopleNum % elevatorCapacity != 0){
            sum += 1;
        }
        System.out.println(sum);*/

    }

}
