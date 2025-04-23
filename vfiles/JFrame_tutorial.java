import javax.swing.*;
public class JFrame_tutorial{
    public static void main(String args[]){
        JFrame frame = new JFrame("My first JFrame");
        JLabel label = new JLabel("Hero hero");
        frame.add(label);

        frame.setSize(300,200);

        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}