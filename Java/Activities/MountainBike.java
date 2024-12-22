// Derived class MountainBike that extends Bicycle
class MountainBike extends Bicycle {
    // Additional property for seat height
    private int seatHeight;

    // Constructor for MountainBike
    public MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed); // Initialize gears and currentSpeed using super
        this.seatHeight = seatHeight;
    }

    // Method to set the seat height
    public void setHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    // Override the bicycleDesc() method to include seat height
    @Override
    public void bicycleDesc() {
        super.bicycleDesc(); // Call the superclass method
        System.out.println("Seat height: " + seatHeight + " cm");
    }
}
