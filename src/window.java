import java.awt.*;

import javax.swing.*;

public class window {
    public window(int width, int height, String title, game game) {
        JFrame frame = new JFrame(title);

        JButton antButton = new JButton("Ant purchase");
        Dimension buttonA = new Dimension(125, 100);
        antButton.setPreferredSize(buttonA);

        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Top, Left, Bottom, Right padding
        leftPanel.add(antButton);

        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension(width,height));
        frame.setMaximumSize(new Dimension (width,height));
        frame.setMinimumSize(new Dimension (width,height));
        
        frame.add(game);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
