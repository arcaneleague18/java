import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 <applet code="KeyboardEventApplet" width=400 height=300>
 </applet>
*/

public class KeyboardEventApplet extends Applet implements KeyListener {
    String message = "";
    String eventType = "";

    public void init() {
        addKeyListener(this);  // Register the applet to receive key events
        requestFocus();        // Set focus to the applet so it can capture keyboard input
    }

    public void keyPressed(KeyEvent e) {
        char ch = e.getKeyChar();
        eventType = "Key Pressed";
        message = "Pressed: " + getKeyDescription(e);
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        char ch = e.getKeyChar();
        eventType = "Key Released";
        message = "Released: " + getKeyDescription(e);
        repaint();
    }

    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();
        eventType = "Key Typed";
        message = "Typed: " + getKeyDescription(e);
        repaint();
    }

    private String getKeyDescription(KeyEvent e) {
        char ch = e.getKeyChar();
        if (Character.isLetter(ch)) return "Alphabet '" + ch + "'";
        else if (Character.isDigit(ch)) return "Digit '" + ch + "'";
        else return "Non-Alphanumeric Key (Code: " + e.getKeyCode() + ")";
    }

    public void paint(Graphics g) {
        g.drawString("Event: " + eventType, 50, 100);
        g.drawString("Details: " + message, 50, 130);
        g.drawString("Try typing letters, numbers, or pressing Shift, Enter, etc.", 50, 180);
    }
}
