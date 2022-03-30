package FinalExamPreparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String line = scanner.nextLine();

        while (!line.equals("Decode")) {
            String[] data = line.split("\\|");
            String command = data[0];
            switch (command) {
                case "Move":
                   message = move(message, Integer.parseInt(data[1]));

                    break;
                case "Insert":
                    message = insert(message, Integer.parseInt(data[1]), data[2]);
                    break;
                case "ChangeAll":
                    message = changeSymbol(message, data[1], data[2]);
                    break;
            }


            line = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", message);

    }

    private static String changeSymbol(String message, String oldSymbol, String newSymbol) {
        return message.replace(oldSymbol, newSymbol);
    }


    private static String insert(String message, int index, String value) {
        String firstPart = message.substring(0, index);
        String secondPart = message.substring(index);


        return firstPart + value + secondPart;

    }

    private static String move(String message, int num) {
        String firstPart = message.substring(0, num);
        String secondPart = message.substring(num);
        return secondPart + firstPart;
    }
}
