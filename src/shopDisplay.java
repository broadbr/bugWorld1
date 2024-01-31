import javax.swing.*;
import java.awt.event.*;


//code used from Google Bard
public class shopDisplay extends JFrame{

    public shopDisplay(){

        shopDisplay sd = new shopDisplay();

        JButton antPurchase = new JButton("purchase ant");

        // Add an action listener to the button
        antPurchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ant ant = new ant();
                bank bank = new bank();

                bank.setSpend(ant.getPrice());

                // Handle the button click event
                JOptionPane.showMessageDialog(null, "ant purchased!");
            }
        });

        // Add the button to the frame
        add(antPurchase);

        // Set the frame's title and default close operation
        setTitle("Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pack the frame to fit its contents
        pack();

        // Make the frame visible
        setVisible(true);
    }

    public static void displayShop(){
        // Create and display the window
        new shopDisplay();
    }
}

