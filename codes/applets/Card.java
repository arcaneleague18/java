import java.awt.*;
import javax.swing.*;

public class Card extends JFrame {

    public Card() {
        setTitle("CardLayout Example");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create CardLayout and card panel
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // Create cards
        JPanel card1 = new JPanel();
        card1.add(new JLabel("This is Card 1"));

        JPanel card2 = new JPanel();
        card2.add(new JLabel("This is Card 2"));

        // Add cards to card panel
        cardPanel.add(card1, "Card1");
        cardPanel.add(card2, "Card2");

        // Buttons to switch cards
        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(e -> cardLayout.next(cardPanel));

        // Layout and add components
        add(cardPanel, BorderLayout.CENTER);
        add(nextButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Card();
    }
}
