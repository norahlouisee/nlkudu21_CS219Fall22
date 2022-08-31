package HW1;

public class Time {

    public static void main(String[] args){
        int hour = 11;
        int minute = 15;
        int second = 41;

        // calculate and display the number of seconds since midnight
        // midnight is time 0
        int secondsSince = (hour * 60 * 60) + (minute * 60) + second;
        System.out.println("The number of seconds since midnight is " + secondsSince + " seconds");

        // calculate the number of seconds remaining in a day
        int day = 24 * 60 * 60;
        int secondsRemaining = day - secondsSince;
        System.out.println("The number of seconds remaining in the day are " + secondsRemaining + " seconds");

        // calculate the percentage of day passed
        double percentage = ((double) secondsSince / (double) day) * 100;
        System.out.println("The percentage of the day that has passed is " + percentage + "%");

        /* change values to represent hour, minute, and second
        compute time since i started working on the exercise
         */
        hour = 11;
        minute = 48;
        second = 24;

        int newTime = (hour * 60 * 60) + (minute * 60) + second;
        int timeElapsed = newTime - secondsSince;
        System.out.println("The number of seconds since I started the exercise is " + timeElapsed + " seconds");

    }
}
