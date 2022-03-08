package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GuassTrick2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> lineOfNumber = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> number = oppositeNumbers(lineOfNumber);

        for (Integer n : number) {
            System.out.print(n + " ");

        }

    }

    private static List<Integer> oppositeNumbers(List<Integer> lineOfNumber) {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < lineOfNumber.size() / 2; i++) {
            number.add(lineOfNumber.get(i) + lineOfNumber.get(lineOfNumber.size()- 1 - i));
        }
        if(lineOfNumber.size() % 2 != 0) {
            number.add(lineOfNumber.get(lineOfNumber.size() / 2));
        }
        return number;
    }
}
