package se.distansakademin;

import se.distansakademin.vehicles.Car;
import se.distansakademin.vehicles.Motorcycle;
import se.distansakademin.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle lambo = new Vehicle("Lamborghini", 350);
        lambo.displayFeatures();

        printDivider();

        Car volvo = new Car("Volvo", 40, 5);
        volvo.displayCarInfo();
        volvo.displayFeatures();

        printDivider();

        Vehicle.DisplayClassName();
        Car.DisplayClassName();

        printDivider();

        Motorcycle harleyDavidson = new Motorcycle("Harley Davidson", 90, true);
        harleyDavidson.displayMotorcycleInfo();
        harleyDavidson.displayFeatures();
        harleyDavidson.getGoing();

        printDivider();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = lambo;
        vehicles[1] = volvo;
        vehicles[2] = harleyDavidson;

        for (Vehicle v : vehicles){
            v.displayFeatures();
        }

    }

    private static void printDivider() {
        System.out.println("🐒");
    }
}