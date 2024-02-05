import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.*;

public class window {

    public window(int width, int height, String title, Main game) {
        //set fram name title
        JFrame frame = new JFrame(title);
        //set size
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.add(game); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
    }

}
