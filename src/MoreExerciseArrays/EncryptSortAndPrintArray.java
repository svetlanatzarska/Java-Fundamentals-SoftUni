package MoreExerciseArrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfName = Integer.parseInt(scanner.nextLine());

        int sum = 0;
            for (int j = 0; j < numberOfName; j++) {
                String name = scanner.nextLine();
                int nameLength = name.length();
                for (int i = 0; i < name.length(); i++) {
                    char letter = name.charAt(i);

                    if(letter == 'a' || letter == 'e' || letter =='i' || letter == 'o' || letter == 'u'
                            || letter == 'A' || letter == 'E' || letter =='I' || letter == 'O' || letter == 'U'){
                        sum += letter * nameLength;
                    }else {
                        sum += letter / nameLength;

                    }

                }

            }

        }
    }

