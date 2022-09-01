package Utility;

/*
Write a function windchill that takes two parameters, a temperature and a wind velocity
and returns the windchill value using the formula.
Write a main function that tests your function with the values of 32 degrees and 10 mph.  Should get 23.7…
 */

import java.util.Scanner;

public class Weather {

    // function
    public static double windchill(double t,    // temperature
                                   double v) {  // velocity (mph)
        // use equation from national weather foundation
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }

    // main function
    public static void main(String [] args){

        // used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        // prompt user to input a temperature
        System.out.print("Enter temperature in degrees F: ");
        double temperature = kbd.nextDouble();

        // prompt user to input a wind velocity
        System.out.print("Enter wind velocity in MPH: ");
        double velocity = kbd.nextDouble();

        // print out the result in addition to the inputs
        System.out.printf("The windchill for %.1f degrees at %.1f mph is %.2f\n",
                            temperature, velocity, windchill(temperature, velocity));

        System.out.println("They said \"Don't\ndo\nit\"");
    }
}
