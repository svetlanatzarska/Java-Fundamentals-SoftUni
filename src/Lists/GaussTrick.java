package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lineOfNum = new ArrayList<>();
        String[] line = scanner.nextLine().split(" ");

        for (int i = 0; i < line.length; i++) {
           lineOfNum.add(Integer.parseInt(line[i]));
        }

        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < lineOfNum.size() / 2; i++) {
            temp.add(lineOfNum.get(i) + lineOfNum.get(lineOfNum.size() - 1 - i));
        }
        if (lineOfNum.size() % 2 != 0) {
            temp.add(lineOfNum.get(lineOfNum.size() / 2));
        }

        for (Integer integer : temp) {
            System.out.print(integer + " ");

        }

    }
}
