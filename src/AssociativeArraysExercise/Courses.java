package AssociativeArraysExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] data = line.split(":");
            String courseName = data[0].trim();
            String studentName = data[1].trim();
            courses.putIfAbsent(courseName, new ArrayList<>());
            courses.get(courseName).add(studentName);
            line = scanner.nextLine();
        }

        courses.entrySet()
                .stream()
                .forEach(s -> {
                    System.out.printf("%s: %s%n", s.getKey(), s.getValue().size());
                    s.getValue().stream().forEach(e -> System.out.printf("-- %s%n", e));
                });



    }
}
