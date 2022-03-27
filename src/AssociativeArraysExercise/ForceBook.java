package AssociativeArraysExercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, List<String>> forceBook = new LinkedHashMap<>();

        while (!line.equals("Lumpawaroo")) {
            String[] data;
            String side, user;
            if(line.contains("|")) {
                data = line.split("\\|");
                side = data[0].trim();
                user = data[1].trim();
                forceBook.putIfAbsent(side, new ArrayList<>());
                boolean noneMatch = forceBook.entrySet()
                        .stream()
                        .noneMatch(entry -> entry.getValue().contains(user));
                if(noneMatch) {
                    forceBook.get(side).add(user);
                }

            } else if(line.contains("->")) {
               data = line.split("->");
               side = data[1].trim();
               user = data[0].trim();
               forceBook.forEach((k,v) -> v.remove(user));
               forceBook.putIfAbsent(side, new ArrayList<>());
               forceBook.get(side).add(user);
                System.out.printf("%s joins the %s side!%n", user, side);
            }
            line = scanner.nextLine();
        }

        forceBook.forEach((k,v) ->{
            if(v.size() != 0) {
                System.out.printf("Side: %s, Members: %d%n",k, v.size());
                v.forEach(user -> System.out.printf("! %s%n", user));
            }
        });
    }
}
