import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorButtonApp extends JFrame implements ActionListener {

    JButton redButton, yellowButton, blueButton;

    public ColorButtonApp() {
        // Set up frame
        setTitle("Color Changer");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create buttons
        redButton = new JButton("Red");
        yellowButton = new JButton("Yellow");
        blueButton = new JButton("Blue");

        // Add action listeners
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        blueButton.addActionListener(this);

        // Add buttons to frame
        add(redButton);
        add(yellowButton);
        add(blueButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Change background color based on button clicked
        if (e.getSource() == redButton) {
            getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            getContentPane().setBackground(Color.YELLOW);
        } else if (e.getSource() == blueButton) {
            getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new ColorButtonApp();
    }
}
