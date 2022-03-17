package ObjectsAndClassesExercise;

import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(",\\s+");
        String title = line[0];
        String content = line[1];
        String author = line[2];
        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split(": ");
            switch (commands[0]){
                case "Edit":
                    article.setContent(commands[1]);
                    break;
                case"ChangeAuthor":
                    article.setAuthor(commands[1]);
                    break;
                case "Rename":
                    article.setTitle(commands[1]);
                    break;
            }
        }

        System.out.println(article.toString());


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

        public void setTitle(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }
        public void setContent(String content){
            this.content = content;
        }
        public String getContent() {
            return content;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",this.title, this.content, this.author);
        }
    }
}
