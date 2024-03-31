import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Thread;

import javax.swing.*;

public class window {

    public int activeStage = 0;

    public int bugLimit = 5;
    public JLabel shopText = new JLabel("Money: " + bank.bank.getAccount() + "$");
    public static JPanel leftPanel = new JPanel();
    public static JPanel rightPanel = new JPanel();

    public static JPanel middlePanel = new JPanel();


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
            JButton antDelete = new JButton("X");
            JButton beetleDelete = new JButton("X");
            JButton startButton = new JButton("Start");


            //text titles created
            JLabel shopName = new JLabel("Insect Shop: ");
            JLabel upgradeName = new JLabel("Upgrades: ");
            //JLabel shopText = new JLabel("Money: " + bank.bank.getAccount() + "$");
            shopText.setText("Money: " + bank.bank.getAccount() + "$");


            //button size declared
            Dimension buttonA = new Dimension(120, 30);
            Dimension deleteButton = new Dimension(50, 30);
            antButton.setPreferredSize(buttonA);
            beetleButton.setPreferredSize(buttonA);
            attackUpgrade.setPreferredSize(buttonA);
            antDelete.setPreferredSize(deleteButton);
            beetleDelete.setPreferredSize(deleteButton);
            startButton.setPreferredSize(buttonA);

            JPanel bugNester = new JPanel(new GridLayout(2, 1));

            JPanel leftInner1 = new JPanel(new GridLayout(1, 2));
            //leftInner1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
            //leftInner1.setPreferredSize(new Dimension(200,50));
            leftInner1.add(antButton);
            leftInner1.add(antDelete);


            JPanel leftInner2 = new JPanel(new GridLayout(1, 2));
            //leftInner2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

            leftInner2.add(beetleButton);
            leftInner2.add(beetleDelete);

            bugNester.add(leftInner1);
            bugNester.add(leftInner2);

            ///start menu display///
            middlePanel.setBackground(Color.GRAY);
            middlePanel.setPreferredSize(new Dimension(100, 100));
            middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS));
            middlePanel.add(startButton);


            ////shop display to left of page////
            leftPanel.setBackground(Color.GRAY);
            //leftPanel.setLayout(new GridLayout(2, 2, 5, 5));
            //leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
            leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
            //leftPanel.setLayout(new BorderLayout());
            //leftPanel.setPreferredSize(new Dimension(150, 2000));
            leftPanel.add(shopName);
            leftPanel.add(bugNester);
            leftPanel.add(Box.createRigidArea(new Dimension(0, 500)));
            //leftPanel.add(Box.createRigidArea(new Dimension(0, 10)));


            //temp game testing
            JButton tempLeaf = new JButton("Spawn Leaf");
            JButton moneyInc = new JButton("Money +1");
            tempLeaf.setPreferredSize(buttonA);
            moneyInc.setPreferredSize(buttonA);
            //leftPanel.add(Box.createRigidArea(new Dimension(0, 100)));
            //leftPanel.add(tempLeaf);
            leftPanel.add(shopText);
            leftPanel.add(moneyInc);


            moneyInc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    bank.bank.setEarnt(100000);
                    shopText.setText("Money: " + bank.bank.getAccount() + "$");
                    System.out.println(bank.bank.getAccount());
                }
            });

            ///upgrade display to right of page///

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

                    int tempLimit = ((bugLimit + activeStage)-1);// calculates limit based on stage
                    boolean lim = true;//used to check if limit of bugs was reached
                    int temp = 0;

                    for(int i = 0; i < bugList.objects.size(); i++)
                        {
                            if(bugList.objects.get(i).getName().equals("ant"))
                            {
                                temp++;
                            }
                            if(temp>=tempLimit){
                                lim = false;
                                System.out.println("\n Max number of ants!");
                            }
                    }

                    if ((bank.bank.getAccount() >= a.getPrice())&&lim) {
                        ant a = new ant();
                        bugList.objects.add(a);
                        bank.bank.setSpend(a.getPrice());
                        System.out.println(bank.bank.getAccount());
                        System.out.println("\nAnt has been purchased");
                        shopText.setText("Money: " + bank.bank.getAccount() + "$");
                    } else {
                        //antButton.setText("Ant: X");
                        System.out.println("\nNot enough money for ant!");
                    }
                }
            });


            beetleButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    int tempLimit = ((bugLimit + activeStage)-1);// calculates limit based on stage
                    boolean lim = true;//used to check if limit of bugs was reached
                    int temp = 0;

                    for(int i = 0; i < bugList.objects.size(); i++)
                    {
                        if(bugList.objects.get(i).getName().equals("beatle"))
                        {
                            temp++;
                        }
                        if(temp>=tempLimit){
                            lim = false;
                            System.out.println("\n Max number of beatles!");
                        }
                    }

                    if (bank.bank.getAccount() >= b.getPrice()) {
                        beatle b = new beatle();
                        bugList.objects.add(b);
                        bank.bank.setSpend(b.getPrice());
                        System.out.println("\nBeetle has been purchased");
                        shopText.setText("Money: " + bank.bank.getAccount() + "$");
                    } else {
                        System.out.println("\nNot enough money for beetle!");
                    }
                }
            });

            attackUpgrade.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (bank.bank.getAccount() >= upgrades.getPrice()) {
                        upgrades.increaseDamage();
                        System.out.println("Bug damage increased");
                        bank.bank.setSpend(upgrades.getPrice());
                    } else {
                        System.out.println("\nNot enough money for upgrade!");
                    }
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

            startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.activeStage++;
            }
            });




            //window created, objects added to window
            frame.setLayout(new BorderLayout());
            frame.setPreferredSize(new Dimension(width, height));
            frame.setMaximumSize(new Dimension(width, height));
            frame.setMinimumSize(new Dimension(width, height));

            frame.add(game);
            frame.add(leftPanel, BorderLayout.WEST);
            frame.add(rightPanel, BorderLayout.EAST);
            frame.add(middlePanel, BorderLayout.CENTER);
            frame.setResizable(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }


    public int getActiveStage(){
        return activeStage;
    }

    public static void menuToggle(){
        leftPanel.setVisible(false);
        middlePanel.setVisible(true);
        rightPanel.setVisible(false);
    }

    public static void menuToggleOn(){
        leftPanel.setVisible(true);
        middlePanel.setVisible(false);
        rightPanel.setVisible(true);
    }


}


