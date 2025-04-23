import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {

    private TextField textField;
    private Label displayLabel;
    private String typedText = ""; // buffer to store typed characters

    public KeyListenerExample() {
        setTitle("Typed Text Display");
        setSize(400, 200);
        setLayout(new FlowLayout());

        textField = new TextField(20);
        textField.addKeyListener(this);
        add(textField);

        displayLabel = new Label("Typed Text: ");
        add(displayLabel);

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        System.out.println("Key Typed: " + keyChar);
        typedText += keyChar;
        displayLabel.setText("Typed Text: " + typedText);
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
