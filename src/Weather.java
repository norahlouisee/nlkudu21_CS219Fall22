/*
Write a function windchill that takes two parameters, a temperature and a wind velocity
and returns the windchill value using the formula.
Write a main function that tests your function with the values of 32 degrees and 10 mph.  Should get 23.7…
 */

public class Weather {

    // function
    public static double windchill(double t,    // temperature
                                   double v) {  // velocity (mph)
        // use equation from national weather foundation
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }

    // main function
    public static void main(String [] args){
        System.out.println(windchill(32.0, 10.0));
    }
}
