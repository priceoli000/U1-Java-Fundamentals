public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */
    public static void main(String[] args) {
        double speedTraveled = 120;
        double timeTraveled = 30;

        double percentageOftime = timeTraveled/60;

        double distanceTraveled = percentageOftime * speedTraveled;
        System.out.println("This vehicle has traveled " + distanceTraveled + " miles");
    }
}
