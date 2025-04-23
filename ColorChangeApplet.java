import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeApplet extends Applet {
    Button redButton, yellowButton, blueButton;

    public void init() {
        // Initialize the buttons
        redButton = new Button("Red");
        yellowButton = new Button("Yellow");
        blueButton = new Button("Blue");

        // Add action listeners to the buttons
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.RED); // Change background to red
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.YELLOW); // Change background to yellow
            }
        });

        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.BLUE); // Change background to blue
            }
        });

        // Add buttons to the applet
        add(redButton);
        add(yellowButton);
        add(blueButton);
    }
}
