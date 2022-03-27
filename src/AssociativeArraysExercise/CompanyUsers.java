package AssociativeArraysExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, ArrayList<String>> companies = new LinkedHashMap<>();

        while (!line.equals("End")) {
            String[] data = line.split("->");
            String companyName = data[0].trim();
            String ID = data[1].trim();
            companies.putIfAbsent(companyName, new ArrayList<>());
            if(!companies.get(companyName).contains(ID)) {
                companies.get(companyName).add(ID);
            }

            line = scanner.nextLine();
        }
        companies.entrySet()
                .forEach(k -> {
                    System.out.println(k.getKey());
                    k.getValue()
                            .forEach(v -> System.out.printf("-- %s%n", v));
                });
    }



}
