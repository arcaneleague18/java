import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DialogBoxExample extends JFrame implements ActionListener {

    JButton msgButton, confirmButton, inputButton;

    public DialogBoxExample() {
        setTitle("Dialog Box Example");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Buttons for each dialog type
        msgButton = new JButton("Show Message");
        confirmButton = new JButton("Show Confirmation");
        inputButton = new JButton("Show Input");

        // Add buttons to frame
        add(msgButton);
        add(confirmButton);
        add(inputButton);

        // Add listeners
        msgButton.addActionListener(this);
        confirmButton.addActionListener(this);
        inputButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == msgButton) {
            // Message Dialog
            JOptionPane.showMessageDialog(this, "This is a Message Dialog!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == confirmButton) {
            // Confirmation Dialog
            int option = JOptionPane.showConfirmDialog(this, "Do you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "You clicked YES!");
            } else {
                JOptionPane.showMessageDialog(this, "You clicked NO!");
            }
        } else if (e.getSource() == inputButton) {
            // Input Dialog
            String name = JOptionPane.showInputDialog(this, "Enter your name:");
            if (name != null && !name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hello, " + name + "!");
            } else {
                JOptionPane.showMessageDialog(this, "You didn't enter anything!");
            }
        }
    }

    public static void main(String[] args) {
        new DialogBoxExample();
    }
}