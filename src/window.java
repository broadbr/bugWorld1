import java.awt.*;

import javax.swing.*;

public class window {
    public window(int width, int height, String title, game game) {
        JFrame frame = new JFrame(title);

        JButton antButton = new JButton("Ant purchase");
        JButton beetleButton = new JButton("Beetle purchase");

        JLabel shopName = new JLabel("Insect Shop: ");

        Dimension buttonA = new Dimension(150, 100);
        antButton.setPreferredSize(buttonA);
        beetleButton.setPreferredSize(buttonA);

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.GRAY);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        //leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Top, Left, Bottom, Right padding
        leftPanel.add(shopName);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        leftPanel.add(antButton);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        leftPanel.add(beetleButton);

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
