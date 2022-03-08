package Lists;

import java.util.*;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        List<Integer> listA = parseIntLineOfNumber(firstLine);
        List<Integer> listB = parseIntLineOfNumber(secondLine);

        //1 2 3 4 5
        //6 7 8
        List<Integer> merged = mergeList(listA, listB);

        for (Integer num : merged) {
            System.out.print(num + " ");

        }
    }



    private static List<Integer> mergeList(List<Integer> listA, List<Integer> listB) {
        List<Integer> newList = new ArrayList<>();
        int index = 0;
        while (index < listA.size() && index < listB.size()) {
            newList.add(listA.get(index));
            newList.add(listB.get(index));
            index++;
        }

        int diff = Math.abs(listA.size() - listB.size());
        while (diff != 0) {
            if (index >= listA.size()) {
                newList.add(listB.get(index));
            } else if (index >= listB.size()) {
                newList.add((listA.get(index)));
            }
            index++;
            diff--;

        }
        return newList;
    }

    private static List<Integer> parseIntLineOfNumber(String firstLine){
        String[] split = firstLine.split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String string : split) {
            int number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }
}
