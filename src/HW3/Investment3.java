 /*
  * Norah Kuduk
  * 9/15/22
  * HW3
  */

package HW3;

import java.util.Scanner;

public class Investment3 {


        // method to run investment expression
        public static double investment(double c, double r, int t, int n) {
            return c * Math.pow(1 + r/n, t * n);
        }

        // main function
        public static void main(String [] args) {

            // initialize scanner
            Scanner kbd = new Scanner(System.in);

            // prompt user to enter c
            System.out.print("Please enter the initial deposit: ");
            double c;

            // validate input
            if (kbd.hasNextDouble()) {
                c = kbd.nextDouble();
                if (c < 0) {
                    System.out.printf("Error: initial deposit should be greater than zero. You entered \"%.2f\"",
                            c);
                    return; // exit main
                }
            }
            else {
                System.out.printf("Error: Please enter a decimal number. You entered \"%s\"",
                        kbd.next());
                return; // exit main
            }

            // prompt user to enter r
            System.out.print("Please enter the rate of interest: ");
            double r;

            // validate input
            if (kbd.hasNextDouble()) {
                r = kbd.nextDouble();
                if (r < 0 || r > 1) {
                    System.out.println("Error: interest rate should be expressed as a decimal between 0 and 1");
                    System.out.printf("For example 8 percent should be entered as .08. You entered \".1%f\"",
                            r);
                    return; // exit main
                }
            }
            else {
                System.out.printf("Error: Please enter a decimal number. You entered \"%s\"",
                        kbd.next());
                return; // exit main
            }

            // prompt user to enter value for t
            System.out.print("Please enter number of years: ");
            int t;

            // validate input
            if (kbd.hasNextInt()) {
                t = kbd.nextInt();
                if (t < 0) {
                    System.out.printf("Error: number of years should be greater than zero. You entered %d",
                            t);
                    return; // exit main
                }
            }
            else {
                System.out.printf("Error: Please enter an integer. You entered \"%s\"",
                        kbd.next());
                return; // exit main
            }

            // prompt user to enter a value for n
            System.out.print("Please enter number of times interest is compounded per year: ");
            int n;

            if (kbd.hasNextInt()) {
                n = kbd.nextInt();
                if (n < 0) {
                    System.out.printf("Error: times interest is compounded should be greater than zero. You entered \"%d\"",
                            n);
                    return; // exit main
                }
            }
            else {
                System.out.printf("Error: Please enter an integer. You entered \"%s\"",
                        kbd.next());
                return; // exit main
            }

            // call method to calculate investment
            System.out.printf("💰Your investment is worth $%.2f 💰",
                    Investment3.investment(c, r, t, n));

        }
}
