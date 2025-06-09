import javax.swing.*;

public class Menubar extends JFrame {

    JLabel label;

    public Menubar() {
        // Set title and layout
        setTitle("Menu Example");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Label to show selected item
        label = new JLabel("Select a menu item");
        label.setBounds(70, 80, 200, 30);
        add(label);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();

        // Menu
        JMenu menu = new JMenu("Options");

        // Menu items
        JMenuItem item1 = new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");

        // Action listeners
        item1.addActionListener(e -> label.setText("Selected: Item 1"));
        item2.addActionListener(e -> label.setText("Selected: Item 2"));

        // Add items to menu, menu to menu bar
        menu.add(item1);
        menu.add(item2);
        menuBar.add(menu);

        // Set menu bar
        setJMenuBar(menuBar);

        // Make frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new Menubar();
    }
}
