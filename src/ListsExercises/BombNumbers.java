package ListsExercises;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = getLineAsNumber(scanner);

        String[] splitLine = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(splitLine[0]);
        int power = Integer.parseInt(splitLine[1]);

        // 1 2 2 4 2 2 2 9
        while (numbers.contains(bomb)){
            int bombIndex = numbers.indexOf(bomb);
            int startIndex = Math.max(bombIndex - power, 0);
            int endIndex = Math.min(bombIndex + power, numbers.size() - 1);
            /*
            int startIndex = bombIndex - power;
            int endIndex = bombIndex + power;

            if(startIndex < 0){
                startIndex = 0;
            }
            if(endIndex >= numbers.size()){
                endIndex = numbers.size() - 1;
            }
             */

            for (int i = startIndex; i <= endIndex ; i++) {
                numbers.remove(startIndex);
            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);


    }

    private static List<Integer> getLineAsNumber(Scanner scanner){
        String [] line = scanner.nextLine().split("\\s+");
        List<Integer> newArrayList = new ArrayList<>();
        for (String s : line) {
            int num = Integer.parseInt(s);
            newArrayList.add(num);
        }
        return newArrayList;
    }
}
