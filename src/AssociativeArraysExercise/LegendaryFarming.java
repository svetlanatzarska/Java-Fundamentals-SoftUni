package AssociativeArraysExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Shards, Fragments, Motes are the key materials (case-insensitive)

        boolean isObtained = false;
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);
        Map<String,String> legendaryItems = new HashMap<>();
        legendaryItems.put("shards","Shadowmourne");
        legendaryItems.put("fragments","Valanyr");
        legendaryItems.put("motes","Dragonwrath");
        String winner = "";
        while (!isObtained) {
            String[] data = scanner.nextLine().split("\\s+");
            for (int i = 0; i < data.length; i+=2) {
                Integer quantity = Integer.parseInt(data[i]);
                String material = data[i + 1].toLowerCase();
                items.putIfAbsent(material, 0);
                items.put(material, items.get(material) + quantity);

                if(material.equals("shards") || material.equals("fragments")|| material.equals("motes")) {
                    if(items.get(material) >= 250) {
                        items.put(material, items.get(material) - 250);
                        isObtained = true;
                        winner = material;
                        break;
                    }
                }
            }
        }
        System.out.printf("%s obtained!%n",legendaryItems.get(winner));
        items.forEach((k,v) -> System.out.printf("%s: %d%n", k,v));


    }
}
