package se.distansakademin.vehicles;

public class Vehicle {

    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayFeatures(){
        System.out.println("Vehicle features - Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    private String displayFeatures(boolean hey){
        return "Hey";
    }

    public String displayFeatures(String hey){
        return "Hey";
    }

    public String displayFeatures(String hey, String hey2){
        return "Hey";
    }



    public void getGoing(){
        System.out.println("We're going");
    }

    public static void DisplayClassName(){
        System.out.println("Vehicle");
    }
}
