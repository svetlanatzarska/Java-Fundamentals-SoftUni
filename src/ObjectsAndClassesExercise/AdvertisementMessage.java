package ObjectsAndClassesExercise;

import java.util.*;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfMessages = Integer.parseInt(scanner.nextLine());
        Product product = new Product();
        product.printMessages(numOfMessages);




    }
    static class Product{
        String[] phrases = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.", "Exceptional product.",
                "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles.", "I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd = new Random();

        void printMessages(int messages) {
            for (int i = 0; i < messages; i++) {
                System.out.printf("%s %s %s - %s%n",this.phrases[rnd.nextInt(phrases.length)],
                        this.events[rnd.nextInt(events.length)], this.authors[rnd.nextInt(authors.length)],
                        this.cities[rnd.nextInt(cities.length)]);

            }
        }

    }
}
