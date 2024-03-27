import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuWindow {


    public int activeStage = 0;
    public static JPanel middlePanel = new JPanel();

    public menuWindow() {
    }

    public menuWindow(int width, int height, String title, game game) {

        window window = new window();
        //JFrame frame = new JFrame(title);
        //local variables
        //buttons created
        JButton startButton = new JButton("Start");
        //text titles created
        //JLabel shopName = new JLabel("Insect Shop: ");
        //button size declared
        Dimension buttonA = new Dimension(120, 30);
        Dimension deleteButton = new Dimension(50, 30);
        startButton.setPreferredSize(buttonA);

        //JPanel leftInner1 = new JPanel(new GridLayout(1, 2));

        ////shop display to left of page////

        middlePanel.setBackground(Color.GRAY);

        middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS));
        //middlePanel.add();

        middlePanel.add(Box.createRigidArea(new Dimension(0, 500)));

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.activeStage++;
            }
        });
    }

        //window.frame.add(middlePanel, BorderLayout.NORTH);

        public int getActiveStage () {
            return activeStage;
        }

        public static void menuToggle () {
            middlePanel.setVisible(false);

        }

        public static void menuToggleOn () {
            middlePanel.setVisible(true);

        }
    }

