import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class window {
    public window(int width, int height, String title, game game) {
        JFrame frame = new JFrame(title);

        ant a = new ant();
        beatle b = new beatle();

        JButton antButton = new JButton("Ant purchase");
        JButton beetleButton = new JButton("Beetle purchase");
        JButton antUpgrade = new JButton("Upgrade Ant");
        JButton beetleUpgrade = new JButton("Upgrade Beetle");
        JButton levelUp = new JButton("Level Up");

        JLabel shopName = new JLabel("Insect Shop: ");
        JLabel upgradeName = new JLabel("Upgrades: ");

        Dimension buttonA = new Dimension(150, 100);
        antButton.setPreferredSize(buttonA);
        beetleButton.setPreferredSize(buttonA);
        antUpgrade.setPreferredSize(buttonA);

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.GRAY);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.add(shopName);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        leftPanel.add(antButton);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        leftPanel.add(beetleButton);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.GRAY);
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.add(upgradeName);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        rightPanel.add(antUpgrade);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        rightPanel.add(beetleUpgrade);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 390)));
        rightPanel.add(levelUp);


        antButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bugList.objects.add(a);
                System.out.println("Ant has been purchased");
            }
        });

        beetleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bugList.objects.add(b);
                System.out.println("Beetle has been purchased");
            }
        });


        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension(width,height));
        frame.setMaximumSize(new Dimension (width,height));
        frame.setMinimumSize(new Dimension (width,height));
        
        frame.add(game);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
