package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();

        String name = scan.next();
        while(!name.equals("End")){

            String id = scan.next();
            int age = scan.nextInt();

            Person currentPerson = new Person(name,id,age);
            persons.add(currentPerson);

            name=scan.next();
        }
        persons.sort((a,b) -> a.getAge()- b.getAge());

        for (Person person : persons) {
            System.out.println(person.toString());
        }
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
