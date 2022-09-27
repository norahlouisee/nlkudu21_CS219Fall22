package Exam1;

import java.util.Scanner;

public class Exam1 {

    // function to validate user inputted n
    public static int getValidN(Scanner s) {
        boolean valid = false;
        int n = 0;

        while (!valid) {
            System.out.print("Please enter a positive integer: ");

            // validate input
            if (s.hasNextInt()) {
                n = s.nextInt();
                if (n < 0)
                    System.out.printf("Error: initial integer should be greater than zero. You entered \"%d\" \n",
                            n);
                else
                    valid = true;
            }
            else {
                System.out.printf("Error: Please enter a positive integer. You entered \"%s\" \n",
                        s.next());
            }
        } // n is validated
        return n;
    }

    // function to compute number of digits between 2 and 7 (exclusive)
    public static int between2and7(int n) {
        // variable to keep track of total number of digits between 2 and 7
        int count = 0;

        while (n != 0) {
            // check ones place for a number between 7
            if (2 < n % 10 && n % 10 < 7)
                count++;

            // remove the ones place from n
            n = n / 10;
        }
        // return number of digits between 2 and 7
        return count;
    }

    // main program to prompt user for int and compute answer
    public static void main(String [] args) {
        // new scanner
        Scanner kbd = new Scanner(System.in);

        // get validated n
        int n = getValidN(kbd);

        // print computed function
        System.out.printf("The number of digits between 2 and 7 (exclusive) in the integer %d is %d.",
                n, between2and7(n));
    }
}
