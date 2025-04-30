import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RGBapplet extends JFrame {
    // Scrollbars for Red, Green, and Blue color values
    JScrollBar red, green, blue;
    JPanel colorPanel;

    RGBapplet() {
        setTitle("RGB Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize scroll bars with range 0-255
        red = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 255);
        green = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 255);
        blue = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 255);

        // Panel to hold scroll bars and labels
        JPanel scrollPanel = new JPanel(new GridLayout(3, 2));
        scrollPanel.add(new JLabel("Red")); scrollPanel.add(red);
        scrollPanel.add(new JLabel("Green")); scrollPanel.add(green);
        scrollPanel.add(new JLabel("Blue")); scrollPanel.add(blue);
        add(scrollPanel, BorderLayout.SOUTH);

        // Panel to display the selected color
        colorPanel = new JPanel();
        add(colorPanel, BorderLayout.CENTER);

        // Listener to update background color based on scrollbar values
        AdjustmentListener listener = e -> updateColor();
        red.addAdjustmentListener(listener);
        green.addAdjustmentListener(listener);
        blue.addAdjustmentListener(listener);

        setVisible(true);
    }

    // Method to update panel color dynamically based on RGB values
    void updateColor() {
        colorPanel.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
    }

    public static void main(String[] args) {
        new RGBapplet(); // Create the frame and display it
    }
}