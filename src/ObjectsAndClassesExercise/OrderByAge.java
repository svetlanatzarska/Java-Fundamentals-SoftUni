package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            String name = data[0];
            String ID = data[1];
            int age = Integer.parseInt(data[2]);
            Person person = new Person(name, ID, age);
            personList.add(person);

            line = scanner.nextLine();
        }

        personList.stream().sorted((p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(person -> System.out.println(person.toString()));

    }
    static class Person{
        String name;
        String ID;
        int age;

        Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", name, ID, age);
        }
    }
}
