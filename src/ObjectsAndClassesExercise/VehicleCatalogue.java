package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] splitLine = input.split("\\s+");
            String type = splitLine[0];
            String model = splitLine[1];
            String color = splitLine[2];
            int horsePower = Integer.parseInt(splitLine[3]);
            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehicleList.add(vehicle);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")) {
            String model = input;

            vehicleList.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            input = scanner.nextLine();
        }
        List<Vehicle> cars = vehicleList.stream()
                .filter(vehicle -> vehicle.getType().equals("car"))
                .collect(Collectors.toList());

        List<Vehicle> trucks = vehicleList.stream()
                .filter(vehicle -> vehicle.getType().equals("truck"))
                .collect(Collectors.toList());

        double carsAvgHp = avgHp(cars);
        double trucksAvgHp = avgHp(trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n",carsAvgHp);
        System.out.printf("Trucks have average horsepower of: %.2f.",trucksAvgHp);

    }
    static double avgHp(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0;
        }
        return vehicles.stream().mapToDouble(Vehicle::getHorsePower).sum() / vehicles.size();
    }
    public static class Vehicle {
        String type;
        String model;
        String color;
        int horsePower;

        Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getModel() {
            return model;
        }
        public int getHorsePower() {
            return horsePower;
        }
        public String getType() {
            return type;
        }



        @Override
        public String toString() {
            return String.format("Type: %s%n"
                                + "Model: %s%n"
                                + "Color: %s%n"
                                + "Horsepower: %d", getType().toUpperCase().charAt(0)
                                    + getType().substring(1), this.model,this.color,this.horsePower);
        }
    }

}

