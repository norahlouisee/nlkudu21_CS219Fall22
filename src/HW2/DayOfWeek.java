package HW2;

import java.util.Scanner;

public class DayOfWeek {

    // function that takes in integer values for month, day, and year, then returns integer that
    // represents the day of the week that the date fell on
    public static int dayofweek(int m, int d, int y) {
        // formula given to calculate the integer value of specific day

        int y0 =  y - (14 - m)/12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        // return final line of formula as int
        return (d + x + 31 * m0 / 12) % 7;

    }

    // main program
    public static void main(String [] args) {

        // initialize scanner to read keyboard inputs
        Scanner kbd = new Scanner(System.in);

        // ask user to enter a month
        System.out.print("Enter a month: ");
        int month = kbd.nextInt();

        // ask user to enter a day
        System.out.print("Enter a day: ");
        int day = kbd.nextInt();

        // ask user to enter a year
        System.out.print("Enter a year: ");
        int year = kbd.nextInt();

        // print the resulting integer from the function dayofweek using user inputs
        System.out.println(dayofweek(month, day, year));
    }
}
