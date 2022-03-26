package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> registerUsers = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
           String[] data = scanner.nextLine().split("\\s+");
            String command = data[0];
            String userName = data[1];

            switch (command) {
                case "register":
                    String licensePlateNumber = data[2];
                    if(registerUsers.containsKey(userName)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                    } else {
                        registerUsers.put(userName, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n", userName, licensePlateNumber);
                    }
                    break;
                case "unregister":
                    if(registerUsers.containsKey(userName)) {
                        registerUsers.remove(userName);
                        System.out.printf("%s unregistered successfully%n", userName);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", userName);
                    }
                    break;
            }
        }
        registerUsers.forEach((k, v) -> System.out.println(k + " => " + v));

        /*registerUsers.forEach((k,v) -> {
            System.out.println(String.format("%s => %s", k, v));
        });

         */
    }



}
