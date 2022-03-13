package ListsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = getLineAsNumber(scanner);
        List<Integer> secondPlayer = getLineAsNumber(scanner);

        int countFP = 0;
        int countSP = 0;
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            if(firstPlayer.get(0) > secondPlayer.get(0)){
                firstPlayer = win(firstPlayer, secondPlayer);
                secondPlayer = lost(secondPlayer);
                countFP++;

            } else if(firstPlayer.get(0) < secondPlayer.get(0)){
                secondPlayer = win(firstPlayer, secondPlayer);
                firstPlayer = lost(firstPlayer);
                countSP++;
            } else {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }

        }

        if(countFP > countSP){
            System.out.println("First player wins! Sum: " + printSum(firstPlayer));

        } else {
            System.out.println("Second player wins! Sum: " + printSum(secondPlayer));
        }
    }
    private static int printSum(List<Integer> array){
        int sum = 0;
        for (Integer num : array) {
            sum += num;
        }
        return sum;
    }
    private static List<Integer> win(List<Integer> first, List<Integer> second){
        List<Integer> newArrayList;
        if (first.get(0) > second.get(0)){
            first.add(first.get(0));
            first.add(second.get(0));
            first.remove(0);
            return first;
        } else {
            second.add(second.get(0));
            second.add(first.get(0));
            second.remove(0);
        }
        newArrayList = second;
        return newArrayList;
    }
    private static List<Integer> lost(List<Integer> player){
        List<Integer> newArrayList;
            player.remove(0);
            newArrayList = player;
        return newArrayList;
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
