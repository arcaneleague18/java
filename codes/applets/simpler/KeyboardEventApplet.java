import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeyboardEventApplet extends JFrame implements KeyListener {
    JLabel label;

    KeyboardEventApplet() {
        setTitle("Keyboard Event Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Press any key...");
        add(label);

        addKeyListener(this); // Register key events

        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyboardEventApplet();
    }
}