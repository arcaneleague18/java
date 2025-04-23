import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends Frame implements MouseListener{

    private String msg = "";

    // Constructor
    public MouseEventExample() {
        setTitle("Mouse Event Demonstration");
        setSize(400, 200);

        // Add mouse listeners
        addMouseListener(this);  // for mouse clicks
        // Add a window listener to close the frame on click
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        msg = "Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        msg = "Mouse Released at: (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        msg = "Mouse Entered the frame";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        msg = "Mouse Exited the frame";
        repaint();
    }
    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);  // Displaying the message
    }

    // Main method to launch the frame
    public static void main(String[] args) {
        new MouseEventExample();
    }
}
