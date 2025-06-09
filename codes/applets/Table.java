import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Table {
    public static void main(String[] args) {
        // Creating the frame
        JFrame frame = new JFrame("Data Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Column names
        String[] columns = {"ID", "Name", "Age", "City"};

        // Sample data
        Object[][] data = {
            {1, "Alice", 25, "New York"},
            {2, "Bob", 30, "Los Angeles"},
            {3, "Charlie", 35, "Chicago"},
            {4, "David", 40, "Houston"}
        };

        // Creating the table
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);

        // Adding table to scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // Set frame visibility
        frame.setVisible(true);
    }
}

