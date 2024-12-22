import java.util.Date;

public class Activity6 {
    public static void main(String[] args) {
       
        Plane plane = new Plane(10); 

       
        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");

       
        Date takeOffTime = plane.takeOff();
        System.out.println("Plane took off at: " + takeOffTime);

        
        System.out.println("Passengers onboard: " + plane.getPassengers());

        
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

       
        plane.land();
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());

       
        System.out.println("Passengers onboard after landing: " + plane.getPassengers());
    }
}