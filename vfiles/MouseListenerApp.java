import java.awt.event.*;
import javax.swing.*;

public class MouseListenerApp implements MouseListener {

    static JLabel label1, label2, label3;

    public static void main(String[] args) {
        JFrame f = new JFrame("MouseListener Demo");
        f.setSize(600, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        // Initialize the labels
        label1 = new JLabel("Mouse action 1");
        label2 = new JLabel("Mouse action 2");
        label3 = new JLabel("Mouse action 3");

        // Add labels to the panel
        p.add(label1);
        p.add(label2);
        p.add(label3);

        // Create instance and add MouseListener to panel
        MouseListenerApp m = new MouseListenerApp();
        p.addMouseListener(m);

        f.add(p);
        f.setVisible(true);
    }

    public void mousePressed(MouseEvent e) {
        label1.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        label1.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseExited(MouseEvent e) {
        label2.setText("Mouse Exited at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        label2.setText("Mouse Entered at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseClicked(MouseEvent e) {
        label3.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + "), Click Count: " + e.getClickCount());
    }
}
