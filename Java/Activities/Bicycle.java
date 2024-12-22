// Define the BicycleParts interface
interface BicycleParts {
    int gears = 0; // Number of gears on the bicycle
    int speed = 0; // Max speed of the bicycle
}

// Define the BicycleOperations interface
interface BicycleOperations {
    void applyBrake(int decrement); // Method to apply brakes
    void speedUp(int increment); // Method to increase speed
}

// Base class Bicycle that implements BicycleParts and BicycleOperations
class Bicycle implements BicycleParts, BicycleOperations {
    // Instance variables
    protected int gears;
    protected int currentSpeed;

    // Constructor to initialize gears and currentSpeed
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    // Method to apply brakes
    @Override
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
    }

    // Method to speed up
    @Override
    public void speedUp(int increment) {
        currentSpeed += increment;
    }

    // Method to print bicycle description
    public void bicycleDesc() {
        System.out.println("Number of gears: " + gears);
        System.out.println("Current speed: " + currentSpeed + " km/h");
    }
}

