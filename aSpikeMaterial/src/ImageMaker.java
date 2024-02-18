import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;

public class ImageMaker {

    public ImageMaker() {
        // Create a JFrame
        JFrame frame = new JFrame("Image Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load the PNG image
        ImageIcon icon = new ImageIcon("C:\\Users\\theki\\IdeaProjects\\Image\\src\\Leaf.png");

        // Resize the image if needed
        Image image = icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);

        // Create a JLabel with the ImageIcon
        JLabel label = new JLabel(new ImageIcon(image));

        // Add the label to the frame
        frame.getContentPane().add(label);

        // Set frame properties
        frame.setSize(40, 40);
        frame.setVisible(true);
    }
}