package se.distansakademin.vehicles;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors){
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayCarInfo(){
        System.out.println("Car features - Number of doors: " + numberOfDoors);
    }

    @Override
    public void displayFeatures(){
        super.displayFeatures();
        displayCarInfo();
    }


}
