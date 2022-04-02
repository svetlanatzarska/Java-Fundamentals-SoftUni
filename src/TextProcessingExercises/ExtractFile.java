package TextProcessingExercises;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1, filePath.lastIndexOf("."));
        String fileExtension = filePath.substring(filePath.lastIndexOf(".") + 1);
        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", fileExtension);
    }
}
