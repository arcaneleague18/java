import javax.swing.*;

class DialogBoxExample extends JFrame {
    DialogBoxExample() {
        setTitle("Dialog Box Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton button = new JButton("Show Dialog");
        button.setBounds(90, 70, 120, 30);
        add(button);

        button.addActionListener(e -> 
            JOptionPane.showMessageDialog(this, "This is a dialog box!", "Dialog", JOptionPane.INFORMATION_MESSAGE)
        );

        setVisible(true);
    }

    public static void main(String[] args) {
        new DialogBoxExample();
    }
}
