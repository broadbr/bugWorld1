import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Thread;

import javax.swing.*;

public class window {

    public int activeStage = 1;
    public window(){

    }
    public window(int width, int height, String title, game game) {
        JFrame frame = new JFrame(title);

        //local variables defined
        ant a = new ant();
        beatle b = new beatle();
        upgrades upgrades = new upgrades();
        stage1 stage1 = new stage1();


        //buttons created
        JButton antButton = new JButton("Ant: " + a.getPrice() + "$");
        JButton beetleButton = new JButton("Beetle: " + b.getPrice() + "$");
        JButton attackUpgrade = new JButton("Upgrade Damage");
        JButton healUpgrade = new JButton("Heal");
        JButton levelUp = new JButton("Level Up");



        //text titles created
        JLabel shopName = new JLabel("Insect Shop: ");
        JLabel upgradeName = new JLabel("Upgrades: ");
        JLabel shopText = new JLabel("Money: " + bank.bank.getAccount() + "$");
        shopText.setText("Money: " + bank.bank.getAccount() + "$");


        //button size declared
        Dimension buttonA = new Dimension(150, 100);
        antButton.setPreferredSize(buttonA);
        beetleButton.setPreferredSize(buttonA);
        attackUpgrade.setPreferredSize(buttonA);


        //shop display to left of page
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.GRAY);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        //leftPanel.setPreferredSize(new Dimension(150, 2000));
        leftPanel.add(shopName);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        leftPanel.add(antButton);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        leftPanel.add(beetleButton);


        //temp game testing
        JButton tempLeaf = new JButton("Spawn Leaf");
        JButton moneyInc = new JButton("Money +1");
        tempLeaf.setPreferredSize(buttonA);
        moneyInc.setPreferredSize(buttonA);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 100)));
        //leftPanel.add(tempLeaf);
        leftPanel.add(shopText);
        leftPanel.add(moneyInc);

        tempLeaf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                /*
                boolean runStage = true;
                try {
                    while (runStage) {
                        Thread.sleep(1000);
                        stage1.makeFood();

                    }
                } catch (InterruptedException ex){}
                */
            }

        });

        moneyInc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bank.bank.setEarnt(100000);
                shopText.setText("Money: " + bank.bank.getAccount() + "$");
                System.out.println(bank.bank.getAccount());
            }
        });

        ///upgrade display to right of page///
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.GRAY);
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        //rightPanel.setPreferredSize(new Dimension(150, 2000));
        rightPanel.add(upgradeName);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        rightPanel.add(attackUpgrade);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        rightPanel.add(healUpgrade);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 390)));
        rightPanel.add(levelUp);



        //button functionality///
        antButton.addActionListener(new ActionListener() {
          @Override
            public void actionPerformed(ActionEvent e) {
                if(bank.bank.getAccount() >= a.getPrice()) {
                    ant a = new ant();
                    bugList.objects.add(a);
                    bank.bank.setSpend(a.getPrice());
                    System.out.println(bank.bank.getAccount());
                    System.out.println("\nAnt has been purchased");
                    shopText.setText("Money: " + bank.bank.getAccount() + "$");
                }
                else{System.out.println("\nNot enough money for ant!");}
            }
       });

        beetleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(bank.bank.getAccount() >= b.getPrice()) {
                    beatle b = new beatle();
                    bugList.objects.add(b);
                    bank.bank.setSpend(b.getPrice());
                    System.out.println("\nBeetle has been purchased");
                    shopText.setText("Money: " + bank.bank.getAccount() + "$");
                }
                else{System.out.println("\nNot enough money for beetle!");}
            }
        });

        attackUpgrade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(bank.bank.getAccount() >= upgrades.getPrice()) {
                    upgrades.increaseDamage();
                    System.out.println("Bug damage increased");
                    bank.bank.setSpend(upgrades.getPrice());
                }
                else{System.out.println("\nNot enough money for beetle!");}
            }

        });

        healUpgrade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upgrades.healBugs();

            }
        });

        levelUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.activeStage++;
            }
        });



        //window created, objects added to window
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
    public int getActiveStage(){
        return activeStage;
    }
}
