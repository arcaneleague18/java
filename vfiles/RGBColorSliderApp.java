import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class RGBColorSliderApp extends JFrame implements ChangeListener {

    private JSlider redSlider, greenSlider, blueSlider;
    private JLabel colorLabel;

    public RGBColorSliderApp() {
        setTitle("RGB Color Adjuster");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Create sliders
        redSlider = createColorSlider("Red");
        greenSlider = createColorSlider("Green");
        blueSlider = createColorSlider("Blue");

        // Create label to display color
        colorLabel = new JLabel("RGB Color Preview", JLabel.CENTER);
        colorLabel.setFont(new Font("Arial", Font.BOLD, 24));
        colorLabel.setForeground(Color.BLACK);
        add(colorLabel);

        // Add sliders
        add(redSlider);
        add(greenSlider);
        add(blueSlider);

        setVisible(true);
    }

    private JSlider createColorSlider(String name) {
        JSlider slider = new JSlider(0, 255, 0);
        slider.setMajorTickSpacing(85);
        slider.setMinorTickSpacing(17);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBorder(BorderFactory.createTitledBorder(name));
        slider.addChangeListener(this);
        return slider;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // Get RGB values from sliders
        int r = redSlider.getValue();
        int g = greenSlider.getValue();
        int b = blueSlider.getValue();

        Color newColor = new Color(r, g, b);
        colorLabel.setForeground(newColor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RGBColorSliderApp());
    }
}
