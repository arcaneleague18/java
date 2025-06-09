import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBScrollBarAppLayout extends JFrame implements AdjustmentListener {

    JScrollBar redScroll, greenScroll, blueScroll;
    JLabel label;

    public RGBScrollBarAppLayout() {
        setTitle("RGB Scroll Bar with Layout");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Label at the top
        label = new JLabel("Adjust RGB Scroll Bars", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        add(label, BorderLayout.NORTH);

        // Panel to hold scroll bars
        JPanel scrollPanel = new JPanel();
        scrollPanel.setLayout(new GridLayout(3, 1, 5, 5));

        redScroll = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 255);
        greenScroll = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 255);
        blueScroll = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 255);

        redScroll.addAdjustmentListener(this);
        greenScroll.addAdjustmentListener(this);
        blueScroll.addAdjustmentListener(this);

        scrollPanel.add(redScroll);
        scrollPanel.add(greenScroll);
        scrollPanel.add(blueScroll);

        add(scrollPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        int r = redScroll.getValue();
        int g = greenScroll.getValue();
        int b = blueScroll.getValue();

        label.setForeground(new Color(r, g, b));
    }

    public static void main(String[] args) {
        new RGBScrollBarAppLayout();
    }
}
