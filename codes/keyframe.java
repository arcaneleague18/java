import java.awt.*;
import java.awt.event.*;

public class keyframe extends Frame implements KeyListener {

    String msg = "";

    public keyframe() {
        setTitle("Typed Text Display");
        setSize(400, 200);

        addKeyListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        msg = "keyPressed " + e.getKeyChar();
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        msg = "keyReleased " + e.getKeyChar();
        repaint();
    }
    @Override
    public void keyTyped(KeyEvent e) {
        msg = "keyTyped " + e.getKeyChar();
        repaint();

    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }

    public static void main(String[] args) {
        new keyframe();
    }
}
