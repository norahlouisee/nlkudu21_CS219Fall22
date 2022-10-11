package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {

    public static void swallow_stats() {

        // connect to the webpage of speeds
        URL url = null;     // null is the nothing value
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path);
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double sum = 0.0;
        int count = 0;
        double min = Double.POSITIVE_INFINITY;
        double max =  Double.NEGATIVE_INFINITY;

        while (true) {

            if (!s.hasNextLine())
                break;

            String line = s.nextLine(); // read a line of the website

            if (line.indexOf('#') == -1 && line != "") {
                double data = Double.parseDouble(line);// modify condition
                sum = sum + data;
                count ++;

                if (data < min)
                    min = data;
                else if (data > max)
                    max = data;
            }
        }
        System.out.printf("The average swallow speed is %.2f meters per second. \n", sum / count);
        System.out.printf("The minimum swallow speed is %.1f meters per second. \n", min);
        System.out.printf("The maximum swallow speed is %.1f meters per second.", max);

    }

    public static void main(String [] args) {
        swallow_stats();
    }

}

