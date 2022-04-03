package PracticalExam;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile
                ("(\\|)(?<name>[A-Z]{4,})\\1:?(\\#)(?<title>[A-Za-z]+ [A-Za-z]+)\\3");

        for (int i = 0; i < numberOfInputs; i++) {
            String boss = scanner.nextLine();
            Matcher matcher = pattern.matcher(boss);

            if (matcher.find()) {
                String name = matcher.group("name");
                String title = matcher.group("title");

                System.out.printf("%s, The %s%n" + ">> Strength: %d%n" +
                        ">> Armor: %d%n", name, title, name.length(), title.length());
            } else {
                System.out.println("Access denied!");
            }
        }

    }
}
