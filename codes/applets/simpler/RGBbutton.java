import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class RGBbutton extends JFrame {
    JButton redButton, yellowButton, blueButton;

    RGBbutton() {
        setTitle("Button Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        redButton = new JButton("Red");
        yellowButton = new JButton("Yellow");
        blueButton = new JButton("Blue");

        add(redButton);
        add(yellowButton);
        add(blueButton);

        // Button Action Listeners
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.RED);
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.YELLOW);
            }
        });

        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.BLUE);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new RGBbutton();
    }
}