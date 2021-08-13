public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */

    public static void main(String[] args) {
        int secondsPassed = 89777;
        int numHours = secondsPassed/3600;
        secondsPassed = secondsPassed % 3600;

        int numMinutes = secondsPassed/60;

        int numSeconds = secondsPassed % 60;




        System.out.println(numHours);
        System.out.println(numMinutes);
        System.out.println(numSeconds);



    }
}
