/*
 * Norah Kuduk
 * 9/22/22
 * HW4
 */

package HW4;

import java.util.Scanner;

public class Investment {

    // method to run investment expression
    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r/n, t * n);
    }

    public static double getC(Scanner s) {
        boolean valid = false;
        double c = 0;

        while (!valid) {
            System.out.print("Please enter the initial deposit: ");

            // validate input
            if (s.hasNextDouble()) {
                c = s.nextDouble();
                if (c < 0) {
                    System.out.printf("Error: initial deposit should be greater than zero. You entered \"%.2f\" \n",
                            c);
                }
                else {
                    valid = true;
                }
            }
            else {
                System.out.printf("Error: Please enter a decimal number. You entered \"%s\" \n",
                        s.next());
            } // c is validated
        }
        return c;
    }

    public static double getR(Scanner s) {
        boolean valid = false;
        double r = 0;

        while (!valid) {
            System.out.print("Please enter the rate of interest: ");

            // validate input
            if (s.hasNextDouble()) {
                r = s.nextDouble();
                if (r < 0 || r > 1) {
                    System.out.println("Error: interest rate should be expressed as a decimal between 0 and 1");
                    System.out.printf("For example 8 percent should be entered as .08. You entered \"%.1f\" \n",
                            r);
                }
                else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: Please enter a decimal number. You entered \"%s\" \n",
                        s.next());
            } // r is validated

        }

        return r;
    }

    public static int getT(Scanner s) {
        boolean valid = false;
        int t = 0;

        while (!valid) {
            System.out.print("Please enter number of years: ");
            if (s.hasNextInt()) {
                t = s.nextInt();
                if (t < 0) {
                    System.out.printf("Error: number of years should be greater than zero. You entered %d \n",
                            t);
                }
                else {
                    valid = true;
                }
            }
            else {
                System.out.printf("Error: Please enter an integer. You entered \"%s\" \n",
                        s.next());
            } // t is validated
        }
        return t;
    }

    public static int getN(Scanner s) {
        boolean valid = false;
        int n = 0;

        while (!valid) {
            System.out.print("Please enter number of times interest is compounded per year: ");

            if (s.hasNextInt()) {
                n = s.nextInt();
                if (n < 0) {
                    System.out.printf("Error: times interest is compounded should be greater than zero. You entered \"%d\" \n",
                            n);
                }
                else {
                    valid = true;
                }
            }
            else {
                System.out.printf("Error: Please enter an integer. You entered \"%s\" \n",
                        s.next());
            } // n is validated
        }
        return n;
    }

    // main function
    public static void main(String [] args) {

        // initialize scanner
        Scanner kbd = new Scanner(System.in);

        double c = getC(kbd);
        double r = getR(kbd);
        int t = getT(kbd);
        int n = getN(kbd);

        // call method to calculate investment
        System.out.printf("💰Your investment is worth $%.2f 💰",
                Investment.investment(c, r, t, n));

    }
}


