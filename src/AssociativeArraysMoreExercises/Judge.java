package AssociativeArraysMoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Map<String, Map<String, Integer>> contests = new LinkedHashMap<>();
        while (!"no more time".equals(line)) {
            String[] tokens = line.split("->");
            String name = tokens[0].trim();
            String contest = tokens[1].trim();
            int points = Integer.parseInt(tokens[2].trim());
            contests.putIfAbsent(contest, new LinkedHashMap<>());
            contests.get(contest).putIfAbsent(name, points);
            if (contests.get(contest).get(name) < points) {
                contests.get(contest).put(name, points);
            }

            line = scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Integer>> entry : contests.entrySet()) {
            AtomicInteger num = new AtomicInteger();
            System.out.printf("%s: %d participants%n", entry.getKey(), entry.getValue().size());
            entry.getValue().entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue()))
                    .forEach(e ->
                            System.out.printf("%d. %s <::> %d%n", num.incrementAndGet(), e.getKey(), e.getValue())
                    );


        }
        Map<String, Integer> students = new LinkedHashMap<>();
        for (Map<String, Integer> value : contests.values()) {
            for (Map.Entry<String, Integer> entry : value.entrySet()) {
                if (!students.containsKey(entry.getKey())) {
                    students.put(entry.getKey(), 0);
                }
                students.put(entry.getKey(), entry.getValue() + students.get(entry.getKey()));
            }

        }
        AtomicInteger num = new AtomicInteger();
        System.out.println("Individual standings:");
        students.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(v -> System.out.printf("%d. %s -> %d%n",
                        num.incrementAndGet(), v.getKey(), v.getValue()));
    }
}