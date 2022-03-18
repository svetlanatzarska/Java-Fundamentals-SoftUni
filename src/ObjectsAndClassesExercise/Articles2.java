package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            Article article = new Article(data[0], data[1], data[2]);
            products.add(article);
        }
        for (Article product : products) {
            System.out.println(product.toString());
        }

    }

    static class Article {
        String title;
        String content;
        String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
}
