package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JPanel is the "base class" and GUIPanel is the "derived class"

public class GUIPanel extends JPanel {
    private JTextField zipcode;
    private JButton submit;
    private JButton northernmost;
    private JTextArea output;
    private Database db;

    public GUIPanel() {
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);

        this.submit = new JButton("Submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());

        this.northernmost = new JButton("Northernmost");
        this.add(this.northernmost);
        this.northernmost.addActionListener(new NorthernmostButtonListener());

        this.output = new JTextArea(5,20);
        this.add(this.output);

        this.db = new Database();   // load the zipcodes

    }

    // add an event handler to the submit button
    // event is a mouse click, mouse movement, button press, key press, etc.
    // an event is an object that represents one of these
    class SubmitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // function will be called when the user presses submit

            // get the zipcode out of the text field
            String code = zipcode.getText();

            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();

            output.setText(wob.toString());
        }
    }

    class NorthernmostButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // function will be called when the user presses MaxLatitudeButton

            Zipcode zc = db.getNorthern();
            WeatherObservation wob = zc.getWeatherData();

            output.setText(wob.toString());
        }
    }

}
