import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.*;
import java.awt.event.*;

public class window{

    bugList buglist = new bugList();
    ant a = new ant();

    public window(int width, int height, String title, Main game) {
        //set frame name title

        JFrame frame = new JFrame(title);
        JFrame buttonFrame = new JFrame();

        JButton myButton = new JButton("buy ant");


        myButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                if (e.getSource() == myButton) {
                    buglist.addBug(a);
                    System.out.println("Ant from shop");

                }
            }

        });


        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.getContentPane().add(myButton);
        buttonFrame.setSize(200,200);
        buttonFrame.setVisible(true);

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
