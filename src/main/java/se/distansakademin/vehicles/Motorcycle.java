package se.distansakademin.vehicles;

public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, boolean hasSidecar){
        super(brand, speed);
        this.hasSidecar = hasSidecar;
    }

    public void displayMotorcycleInfo(){
        String hasSidecarOutput = (hasSidecar ? "Yes": "No");
        System.out.println("Motorcycle features - Has sidecar: " + hasSidecarOutput);
    }

    @Override
    public void displayFeatures() {
        super.displayFeatures();
        displayMotorcycleInfo();
    }
}
