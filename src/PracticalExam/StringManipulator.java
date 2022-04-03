package PracticalExam;
import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(text);

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            String[] splitLine = input.split("\\s+");
            String command = splitLine[0];

            switch (command) {
                case "Translate": {
                    String transformToString = sb.toString();
                    transformToString = transformToString.replace(splitLine[1].charAt(0), splitLine[2].charAt(0));
                    sb.setLength(0);
                    sb.append(transformToString);
                    System.out.println(sb);
                }
                break;
                case "Includes": {
                    String containsString = splitLine[1];
                    String transformToString = sb.toString();
                    if (transformToString.contains(containsString)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                }
                break;
                case "Start": {
                    String containsString = splitLine[1];
                    String transformToString = sb.toString();
                    int indexBegin = sb.indexOf(containsString);
                    int length = containsString.length();
                    if (indexBegin + length == length) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                }
                break;
                case "Lowercase": {
                    String temporary = sb.toString().toLowerCase();
                    sb.setLength(0);
                    sb.append(temporary);
                    System.out.println(sb);
                }
                break;
                case "FindIndex": {
                    int lastIndex = sb.lastIndexOf(String.valueOf(splitLine[1].charAt(0)));
                    System.out.println(lastIndex);
                    String temporary = sb.toString();
                    int index = temporary.lastIndexOf(splitLine[1].charAt(0));
                }
                break;
                case "Remove": {
                    int start = Integer.parseInt(splitLine[1]);
                    int count = Integer.parseInt(splitLine[2]);
                    int end = start + count;
                    sb.delete(start,end);
                    System.out.println(sb);
                }
                break;
            }
            input = scanner.nextLine();
        }
    }
}
