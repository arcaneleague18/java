import java.awt.*;
import java.awt.event.*;

public class ColorScrollBars extends Frame implements AdjustmentListener {

    private Scrollbar redScrollbar, greenScrollbar, blueScrollbar;
    private Label redLabel, greenLabel, blueLabel;
    private int redValue = 0, greenValue = 0, blueValue = 0;

    // Constructor
    public ColorScrollBars() {
        setTitle("Color Scroll Bars");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Create and add scroll bars for red, green, and blue
        redScrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);  // Range from 0 to 255
        greenScrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);  // Range from 0 to 255
        blueScrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);  // Range from 0 to 255

        redLabel = new Label("Red: 0");
        greenLabel = new Label("Green: 0");
        blueLabel = new Label("Blue: 0");

        // Add scroll bars and labels to the frame
        add(redLabel);
        add(redScrollbar);
        add(greenLabel);
        add(greenScrollbar);
        add(blueLabel);
        add(blueScrollbar);

        // Add adjustment listeners to all scroll bars
        redScrollbar.addAdjustmentListener(this);
        greenScrollbar.addAdjustmentListener(this);
        blueScrollbar.addAdjustmentListener(this);

        // Window listener to close the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Make the frame visible
        setVisible(true);
    }

    // Adjust the background color of the frame based on scroll bar values
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        // Update the color values based on scroll bar positions
        redValue = redScrollbar.getValue();
        greenValue = greenScrollbar.getValue();
        blueValue = blueScrollbar.getValue();

        // Update the labels to reflect the current values
        redLabel.setText("Red: " + redValue);
        greenLabel.setText("Green: " + greenValue);
        blueLabel.setText("Blue: " + blueValue);

        // Change the background color of the frame according to the selected RGB values
        setBackground(new Color(redValue, greenValue, blueValue));
    }

    // Main method to launch the application
    public static void main(String[] args) {
        new ColorScrollBars();
    }
}
