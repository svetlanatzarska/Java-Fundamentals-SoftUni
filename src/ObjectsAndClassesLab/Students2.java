package ObjectsAndClassesLab;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    static class Student {
        String firstName;
        String lastName;
        int age;
        String homeTown;

        Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public int getAge() {
            return age;
        }
        public String getHomeTown() {
            return homeTown;
        }
        public  void setFirstName(String firstName) {
            this.firstName = this.firstName;
        }
        public  void setLastName(String lastName) {
            this.lastName = this.lastName;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
        public void getInfo() {
            System.out.printf("%s %s is %d years old%n", this.firstName, this.lastName, this.age);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();


        while (!input.equals("end")){
            String[] splitLine = input.split("\\s+");
            String firstName = splitLine[0];
            String lastName = splitLine[1];
            int age = Integer.parseInt(splitLine[2]);
            String homeTown = splitLine[3];

            Student student = new Student (firstName, lastName, age, homeTown);
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setHomeTown(homeTown);
    // overwrite if exists
            Student existing = findStudent(students, firstName, lastName);
            if(existing == null) {
                students.add(student);
            } else {
                existing.setAge(age);
                existing.setHomeTown(homeTown);
            }



            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : students) {
            if(city.equals(student.getHomeTown())){
                student.getInfo();

            }

        }

    }

    private static Student findStudent(List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getFirstName().equals(firstName)
                    && s.getLastName().equals(lastName)) {
                return s;
            }
        }
        return null;
    }
}
