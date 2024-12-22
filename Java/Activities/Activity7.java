// Driver class
public class Activity7 {
    public static void main(String[] args) {
        // Create an object of MountainBike
        MountainBike mountainBike = new MountainBike(5, 20, 30);

        // Access methods and properties
        System.out.println("Before applying brakes or speeding up:");
        mountainBike.bicycleDesc();

        // Apply brakes
        mountainBike.applyBrake(5);
        System.out.println("\nAfter applying brakes:");
        mountainBike.bicycleDesc();

        // Speed up
        mountainBike.speedUp(10);
        System.out.println("\nAfter speeding up:");
        mountainBike.bicycleDesc();

        // Change seat height
        mountainBike.setHeight(35);
        System.out.println("\nAfter adjusting seat height:");
        mountainBike.bicycleDesc();
    }
}
