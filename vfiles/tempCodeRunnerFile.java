import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Message_with_coordinates extends Applet implements ActionListener {
    TextField xInput, yInput, messageInput;
    String message = "";
    int x = 0, y = 0;

    public void init() {
        // Add input fields and labels
        Label xLabel = new Label("Enter X coordinate:");
        xInput = new TextField(5);
        Label yLabel = new Label("Enter Y coordinate:");
        yInput = new TextField(5);
        Label messageLabel = new Label("Enter Message:");
        messageInput = new TextField(20);

        Button displayButton = new Button("Display Message");

        // Add components to the applet
        add(xLabel);
        add(xInput);
        add(yLabel);
        add(yInput);
        add(messageLabel);
        add(messageInput);
        add(displayButton);

        displayButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            // Parse input values
            x = Integer.parseInt(xInput.getText());
            y = Integer.parseInt(yInput.getText());
            message = messageInput.getText();

            // Repaint applet to display the message
            repaint();
        } catch (NumberFormatException ex) {
            message = "Invalid input!";
            repaint();
        }
    }

    public void paint(Graphics g) {
        // Display the message at the specified coordinates
        g.drawString(message, x, y);
    }
}
