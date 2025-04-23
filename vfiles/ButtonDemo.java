import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends JFrame {
    private JButton redButton, yellowButton, blueButton;

    // Constructor for ButtonDemo
    public ButtonDemo() {
        // Set up the JFrame properties
        setTitle("Color Changer App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create Buttons
        redButton = new JButton("Red");
        yellowButton = new JButton("Yellow");
        blueButton = new JButton("Blue");

        // Add ActionListeners to the buttons
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.RED);
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.YELLOW);
            }
        });

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.BLUE);
            }
        });

        // Add buttons to the JFrame
        add(redButton);
        add(yellowButton);
        add(blueButton);

        // Center the JFrame on the screen
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and display the JFrame
        SwingUtilities.invokeLater(ButtonDemo::new);
    }
}