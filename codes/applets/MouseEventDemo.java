import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventDemo extends JFrame implements MouseListener {
    JLabel label;

    MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Perform mouse actions here!");
        add(label);

        addMouseListener(this); // Register mouse events

        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed!");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released!");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered! at ("+e.getX()+","+ e.getY()+")");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited!");
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}