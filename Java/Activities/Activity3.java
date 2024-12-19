
public class Activity3 {

    public static void main(String[] args) {
        
        long personseconds = 1000000000;

        
        double earthSeconds = 31557600;

        double mercuryPeriod = 0.2408467;
        double venusPeriod = 0.61519726;
        double marsPeriod = 1.8808158;
        double jupiterPeriod = 11.862615;
        double saturnPeriod = 29.447498;
        double uranusPeriod = 84.016846;
        double neptunePeriod = 164.79132;

        double ageOnEarth = personseconds / earthSeconds;
        double ageOnMercury = ageOnEarth / mercuryPeriod;
        double ageOnVenus = ageOnEarth / venusPeriod;
        double ageOnMars = ageOnEarth / marsPeriod;
        double ageOnJupiter = ageOnEarth / jupiterPeriod;
        double ageOnSaturn = ageOnEarth / saturnPeriod;
        double ageOnUranus = ageOnEarth / uranusPeriod;
        double ageOnNeptune = ageOnEarth / neptunePeriod;

        System.out.printf("Age on Earth: %.2f years%n", ageOnEarth);
        System.out.printf("Age on Mercury: %.2f years%n", ageOnMercury);
        System.out.printf("Age on Venus: %.2f years%n", ageOnVenus);
        System.out.printf("Age on Mars: %.2f years%n", ageOnMars);
        System.out.printf("Age on Jupiter: %.2f years%n", ageOnJupiter);
        System.out.printf("Age on Saturn: %.2f years%n", ageOnSaturn);
        System.out.printf("Age on Uranus: %.2f years%n", ageOnUranus);
        System.out.printf("Age on Neptune: %.2f years%n", ageOnNeptune);
    }
}




