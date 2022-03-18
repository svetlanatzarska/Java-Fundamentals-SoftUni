package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            persons.add(person);

        }

        persons.stream()
                .sorted((p1, p2) ->p1.getName().compareTo(p2.getName()))
                .filter(person -> person.getAge() > 30)
                .forEach(p-> System.out.println(p.toString()));
    }
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", this.name, this.age);
        }
    }
}
