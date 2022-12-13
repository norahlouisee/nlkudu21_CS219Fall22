package ZipCodeDB;

import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        // construct JFrame
        JFrame frame = new JFrame("CS219 Weather App");
        frame.add(new GUIPanel());
        frame.setVisible(true);

        // when user clicks the exit button in title bar, the program will stop running
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();   // makes the JFrame the size of the internal components
    }
}

