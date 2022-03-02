package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input){
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMAx(num1, num2));
                break;
            case "char":
                char char1 = scanner.next().charAt(0);
                char char2 = scanner.next().charAt(0);
                System.out.println(getMat(char1, char2));
                break;
            case "string":
                String s1 = scanner.nextLine();
                String s2 = scanner.nextLine();
                System.out.println(getMax(s1, s2));
                break;
        }



    }
    public static int getMAx(int num1, int num2){
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public static char getMat(char char1, char char2){
       if(char1 > char2){
           return char1;
       }
       return char2;
    }

    public static String getMax(String s1, String s2){
        if (s1.compareTo(s2) >= 0) {
            return s1;
        }
        return s2;
    }

    }
