package ObjectsAndClassesLab;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public Students(String firstName, String lastName, int age, String homeTown) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] splitLine = command.split("\\s+");
            String firstName = splitLine[0];
            String lastName = splitLine[1];
            int age = Integer.parseInt(splitLine[2]);
            String homeTown = splitLine[3];

            Student student = new Student(firstName, lastName, age, homeTown);
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHomeTown(homeTown);

            students.add(student);

            command = scanner.nextLine();
        }

        String cityLine = scanner.nextLine();

        for (Student student : students) {
            if(cityLine.equals(student.getHomeTown())){
                student.getInfo();

            }

        }


    }
    public static class Student{
        String firstName;
        String lastName;
        int age;
        String homeTown;

        Student (String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getHomeTown() {
            return homeTown;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public void  setAge(int age) {
            this.age = age;
        }
        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public void getInfo() {
            System.out.printf("%s %s is %d years old%n", this.firstName, this.lastName, this.age);
        }

    }


}
