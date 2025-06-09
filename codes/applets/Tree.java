import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Tree Structure Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Category 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Category 2");

        // Create sub-nodes
        child1.add(new DefaultMutableTreeNode("Item 1.1"));
        child1.add(new DefaultMutableTreeNode("Item 1.2"));

        child2.add(new DefaultMutableTreeNode("Item 2.1"));
        child2.add(new DefaultMutableTreeNode("Item 2.2"));

        // Add child nodes to root
        root.add(child1);
        root.add(child2);

        // Create JTree and add it to a scroll pane
        JTree tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);
        frame.add(scrollPane);

        // Set frame visibility
        frame.setVisible(true);
    }

}
