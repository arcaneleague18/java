import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
 <applet code="RGBColorApplet" width=500 height=300>
 </applet>
*/

public class RGBColorApplet extends Applet implements AdjustmentListener {
    Scrollbar redScroll, greenScroll, blueScroll;
    int r = 0, g = 0, b = 0;

    public void init() {
        setLayout(null); // Using absolute positioning

        // Create scrollbars for R, G, B
        redScroll = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        greenScroll = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
        blueScroll = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);

        // Position the scrollbars
        redScroll.setBounds(50, 50, 300, 20);
        greenScroll.setBounds(50, 100, 300, 20);
        blueScroll.setBounds(50, 150, 300, 20);

        // Add listeners
        redScroll.addAdjustmentListener(this);
        greenScroll.addAdjustmentListener(this);
        blueScroll.addAdjustmentListener(this);

        // Add scrollbars to applet
        add(redScroll);
        add(greenScroll);
        add(blueScroll);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        r = redScroll.getValue();
        g = greenScroll.getValue();
        b = blueScroll.getValue();
        repaint(); // Repaint to update the color
    }

    public void paint(Graphics g) {
        Color selectedColor = new Color(r, g, b);
        g.setColor(selectedColor);
        g.drawString("RGB Color: (" + r + ", " + g + ", " + b + ")", 100, 220);
        g.fillRect(100, 240, 200, 30); // Show color swatch
    }
}
