import javax.swing.*;
import java.awt.*;

public class gridMap{
    //graphics
    JButton btn0 = new JButton("");
    JButton btn1 = new JButton("");
    JButton btn2 = new JButton("");
    JButton btn3 = new JButton("");
    JButton btn4 = new JButton("");
    JButton btn5 = new JButton("");
    JButton btn6 = new JButton("");
    JButton btn7 = new JButton("");
    JButton btn8 = new JButton("");
    JButton btn9 = new JButton("");
    JButton btn10 = new JButton("");
    JButton btn11 = new JButton("");
    JButton btn12 = new JButton("");
    JButton btn13 = new JButton("");
    JButton btn14 = new JButton("");
    JButton btn15 = new JButton("");
    JButton btn16 = new JButton("");
    JButton btn17 = new JButton("");
    JButton btn18 = new JButton("");
    JButton btn19 = new JButton("");
    JButton btn20 = new JButton("");
    JButton btn21 = new JButton("");
    JButton btn22 = new JButton("");
    JButton btn23 = new JButton("");
    JButton btn24 = new JButton("");

    JButton[] btnArr = new JButton[]
            {
                   btn0 , btn1, btn2, btn3, btn4, btn5, btn6, btn7 , btn8, btn9 , btn10, btn11, btn12,
                    btn13, btn14 ,btn15 , btn16, btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24
            };

    Font fnt = new Font("Arial" , Font.BOLD , 18);
    gridMap() {
        JFrame frame = new JFrame();

        for(int i = 0; i < 25; i++)
        {
            frame.add(btnArr[i]);
        }

        frame.setLayout(new GridLayout(5, 5));
        frame.setSize(700, 700);
        frame.setTitle("Game Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        for(int b = 0;b<25;b++)
        {
            btnArr[b].setBackground(Color.getHSBColor(.14f,.90f,.25f));

        }


        frame.setVisible(true);
    }


    //Can set a tile to green, blue, black, and brown
    //Needs where the button is(0 is top left, and what color)
    protected void setButtonColor(int btnNum , String color)
    {

        if(btnNum > 25 || btnNum < 0)
            return;
        for(int i = 0; i<25;i++)
        {
            if(i == btnNum)
            {
                if(color.equals("green"))
                {
                    btnArr[i].setForeground(Color.GREEN);
                    btnArr[i].setBackground(Color.GREEN);
                }
                else if(color.equals("blue"))
                {
                    btnArr[i].setForeground(Color.blue);
                    btnArr[i].setBackground(Color.blue);
                }
                else if(color.equals("black"))
                {
                    btnArr[i].setForeground(Color.black);
                    btnArr[i].setBackground(Color.black);
                }
                else if(color.equals("brown"))
                {
                    btnArr[i].setForeground(Color.getHSBColor(.14f,.90f,.25f));
                    btnArr[i].setBackground(Color.getHSBColor(.14f,.90f,.25f));
                }
            }
        }






    }

    //Adds/sets bugs on a tile
    //Needs which button(0 is top left, what bug, and the number of bugs
    protected void addBug(int btnNum , String bugType , int numBugs)
    {
        while(numBugs > 0)
        {
            String whatBugs;
            for (int i = 0; i < 25; i++) {
                if (i == btnNum) {
                    if (bugType.equals("ant")) {
                        whatBugs = btnArr[i].getText();
                        btnArr[i].setForeground(Color.white);
                        btnArr[i].setFont(fnt);
                        btnArr[i].setText(whatBugs + "A");
                    }
                }
            }
            numBugs--;
        }


    }

    //Deletes a specific number of bugs and bug type from a tile
    //Requires the tile spot, bug type(CAPITALIZED) , and the number of bugs
    protected void deleteBug(int btnNum , String bugType , int numBugs)
    {
        StringBuilder sb = new StringBuilder();
        int length = btnArr[btnNum].getText().length();
        sb.append(btnArr[btnNum].getText());

        while(numBugs > 0)
        {
            for (int i = 0; i < length; i++) {
                if (bugType.charAt(0) == btnArr[btnNum].getText().charAt(i)) {
                    sb.deleteCharAt(i);
                    btnArr[btnNum].setText(sb.toString());
                    break;
                }

            }
            numBugs--;
        }

    }
}
