package ListsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = getLineAsNumber(scanner);
        List<Integer> secondPlayer = getLineAsNumber(scanner);


        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            if(firstPlayer.get(0) > secondPlayer.get(0)){
                firstPlayer.add(firstPlayer.get(0));
                firstPlayer.add(secondPlayer.get(0));

            } else if (firstPlayer.get(0) < secondPlayer.get(0)) {
                secondPlayer.add(secondPlayer.get(0));
                secondPlayer.add(firstPlayer.get(0));
            }
            firstPlayer.remove(0);
            secondPlayer.remove(0);
        }
        if(!firstPlayer.isEmpty()){
            System.out.println("First player wins! Sum: " + getSum(firstPlayer));
        } else {
            System.out.println("Second player wins! Sum: " + getSum(secondPlayer));
        }

    }
    private static int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
    private static List<Integer> getLineAsNumber(Scanner scanner){
        List<Integer> newArrayList = new ArrayList<>();
        String[] line = scanner.nextLine().split("\\s+");
        for (String s : line) {
            int num = Integer.parseInt(s);
            newArrayList.add(num);
        }
        return newArrayList;
    }
}
