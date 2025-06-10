import javax.swing.*;

public class DialogBoxExample {
    public static void main(String[] args) {
        // Show a message dialog
        JOptionPane.showMessageDialog(null, "Welcome to the Dialog Box Demo!");

        // Ask for user input
        String name = JOptionPane.showInputDialog("What is your name?");

        // Show a greeting message
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");

        // Ask for confirmation
        int option = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You chose to continue.");
        } else {
            JOptionPane.showMessageDialog(null, "You chose not to continue.");
        }
    }
}
