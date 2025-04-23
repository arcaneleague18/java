import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 <applet code="MouseEventApplet" width=400 height=300>
 </applet>
*/

public class MouseEventApplet extends Applet implements MouseListener {
    String message = "";
    int x = 50, y = 100;

    public void init() {
        addMouseListener(this);  // Register mouse listener
    }

    public void mouseClicked(MouseEvent e) {
        message = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        message = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        message = "Mouse Released";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        message = "Mouse Entered Applet Area";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        message = "Mouse Exited Applet Area";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, x, y);
    }
}
