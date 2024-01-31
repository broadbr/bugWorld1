import javax.swing.*;
import java.awt.*;

public class gridMap{
    //graphics
    JButton btn0 = new JButton("0");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn10 = new JButton("10");
    JButton btn11 = new JButton("11");
    JButton btn12 = new JButton("12");
    JButton btn13 = new JButton("13");
    JButton btn14 = new JButton("14");
    JButton btn15 = new JButton("15");
    JButton btn16 = new JButton("16");
    JButton btn17 = new JButton("17");
    JButton btn18 = new JButton("18");
    JButton btn19 = new JButton("19");
    JButton btn20 = new JButton("20");
    JButton btn21 = new JButton("21");
    JButton btn22 = new JButton("22");
    JButton btn23 = new JButton("23");
    JButton btn24 = new JButton("24");

    JButton[] btnArr = new JButton[]
            {
                   btn0 , btn1, btn2, btn3, btn4, btn5, btn6, btn7 , btn8, btn9 , btn10, btn11, btn12,
                    btn13, btn14 ,btn15 , btn16, btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24
            };

    Font fnt = new Font("Arial" , Font.BOLD , 18);
    gridMap() {
        JFrame frame = new JFrame();

        frame.add(btn0);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btn10);
        frame.add(btn11);
        frame.add(btn12);
        frame.add(btn13);
        frame.add(btn14);
        frame.add(btn15);
        frame.add(btn16);
        frame.add(btn17);
        frame.add(btn18);
        frame.add(btn19);
        frame.add(btn20);
        frame.add(btn21);
        frame.add(btn22);
        frame.add(btn23);
        frame.add(btn24);

        frame.setLayout(new GridLayout(5, 5));
        frame.setSize(700, 700);
        frame.setTitle("Game Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        btn0.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn0.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn1.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn1.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn2.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn2.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn3.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn3.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn4.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn4.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn5.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn5.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn6.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn6.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn7.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn7.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn8.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn8.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn9.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn9.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn10.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn10.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn11.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn11.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn12.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn12.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn13.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn13.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn14.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn14.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn15.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn15.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn16.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn16.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn17.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn17.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn18.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn18.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn19.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn19.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn20.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn20.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn21.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn21.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn22.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn22.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn23.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn23.setForeground(Color.getHSBColor(.14f,.90f,.25f));
        btn24.setBackground(Color.getHSBColor(.14f,.90f,.25f));
        btn24.setForeground(Color.getHSBColor(.14f,.90f,.25f));


        frame.setVisible(true);
    }


    //Can set a tile to green, blue, black, and brown
    //Needs where the button is(0 is top left, and what color)
    protected void setButtonColor(int btnNum , String color)
    {

        if(btnNum > 25 || btnNum < 0)
            return;

        if(btnNum == 0)
        {
            if(color.equals("green"))
            {
                btn0.setForeground(Color.GREEN);
                btn0.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn0.setForeground(Color.blue);
                btn0.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn0.setForeground(Color.black);
                btn0.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn0.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn0.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 1)
        {
            if(color.equals("green"))
            {
                btn1.setForeground(Color.GREEN);
                btn1.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn1.setForeground(Color.blue);
                btn1.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn1.setForeground(Color.black);
                btn1.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn1.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn1.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 2)
        {
            if(color.equals("green"))
            {
                btn2.setForeground(Color.GREEN);
                btn2.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn2.setForeground(Color.blue);
                btn2.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn2.setForeground(Color.black);
                btn2.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn2.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn2.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 3)
        {
            if(color.equals("green"))
            {
                btn3.setForeground(Color.GREEN);
                btn3.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn3.setForeground(Color.blue);
                btn3.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn3.setForeground(Color.black);
                btn3.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn3.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn3.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 4)
        {
            if(color.equals("green"))
            {
                btn4.setForeground(Color.GREEN);
                btn4.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn4.setForeground(Color.blue);
                btn4.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn4.setForeground(Color.black);
                btn4.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn4.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn4.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 5)
        {
            if(color.equals("green"))
            {
                btn5.setForeground(Color.GREEN);
                btn5.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn5.setForeground(Color.blue);
                btn5.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn5.setForeground(Color.black);
                btn5.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn5.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn5.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 6)
        {
            if(color.equals("green"))
            {
                btn6.setForeground(Color.GREEN);
                btn6.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn6.setForeground(Color.blue);
                btn6.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn6.setForeground(Color.black);
                btn6.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn6.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn6.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 7)
        {
            if(color.equals("green"))
            {
                btn7.setForeground(Color.GREEN);
                btn7.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn7.setForeground(Color.blue);
                btn7.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn7.setForeground(Color.black);
                btn7.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn7.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn7.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 8)
        {
            if(color.equals("green"))
            {
                btn8.setForeground(Color.GREEN);
                btn8.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn8.setForeground(Color.blue);
                btn8.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn8.setForeground(Color.black);
                btn8.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn8.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn8.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 9)
        {
            if(color.equals("green"))
            {
                btn9.setForeground(Color.GREEN);
                btn9.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn9.setForeground(Color.blue);
                btn9.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn9.setForeground(Color.black);
                btn9.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn9.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn9.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 10)
        {
            if(color.equals("green"))
            {
                btn10.setForeground(Color.GREEN);
                btn10.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn10.setForeground(Color.blue);
                btn10.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn10.setForeground(Color.black);
                btn10.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn10.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn10.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 11)
        {
            if(color.equals("green"))
            {
                btn11.setForeground(Color.GREEN);
                btn11.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn11.setForeground(Color.blue);
                btn11.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn11.setForeground(Color.black);
                btn11.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn11.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn11.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 12)
        {
            if(color.equals("green"))
            {
                btn12.setForeground(Color.GREEN);
                btn12.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn12.setForeground(Color.blue);
                btn12.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn12.setForeground(Color.black);
                btn12.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn12.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn12.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 13)
        {
            if(color.equals("green"))
            {
                btn13.setForeground(Color.GREEN);
                btn13.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn13.setForeground(Color.blue);
                btn13.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn13.setForeground(Color.black);
                btn13.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn13.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn13.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 14)
        {
            if(color.equals("green"))
            {
                btn14.setForeground(Color.GREEN);
                btn14.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn14.setForeground(Color.blue);
                btn14.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn14.setForeground(Color.black);
                btn14.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn14.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn14.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 15)
        {
            if(color.equals("green"))
            {
                btn15.setForeground(Color.GREEN);
                btn15.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn15.setForeground(Color.blue);
                btn15.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn15.setForeground(Color.black);
                btn15.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn15.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn15.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 16)
        {
            if(color.equals("green"))
            {
                btn16.setForeground(Color.GREEN);
                btn16.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn16.setForeground(Color.blue);
                btn16.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn16.setForeground(Color.black);
                btn16.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn16.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn16.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 17)
        {
            if(color.equals("green"))
            {
                btn17.setForeground(Color.GREEN);
                btn17.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn17.setForeground(Color.blue);
                btn17.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn17.setForeground(Color.black);
                btn17.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn17.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn17.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 18)
        {
            if(color.equals("green"))
            {
                btn18.setForeground(Color.GREEN);
                btn18.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn18.setForeground(Color.blue);
                btn18.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn18.setForeground(Color.black);
                btn18.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn18.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn18.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 19)
        {
            if(color.equals("green"))
            {
                btn19.setForeground(Color.GREEN);
                btn19.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn19.setForeground(Color.blue);
                btn19.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn19.setForeground(Color.black);
                btn19.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn19.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn19.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 20)
        {
            if(color.equals("green"))
            {
                btn20.setForeground(Color.GREEN);
                btn20.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn20.setForeground(Color.blue);
                btn20.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn20.setForeground(Color.black);
                btn20.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn20.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn20.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 21)
        {
            if(color.equals("green"))
            {
                btn21.setForeground(Color.GREEN);
                btn21.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn21.setForeground(Color.blue);
                btn21.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn21.setForeground(Color.black);
                btn21.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn21.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn21.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 22)
        {
            if(color.equals("green"))
            {
                btn22.setForeground(Color.GREEN);
                btn22.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn22.setForeground(Color.blue);
                btn22.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn22.setForeground(Color.black);
                btn22.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn22.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn22.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 23)
        {
            if(color.equals("green"))
            {
                btn23.setForeground(Color.GREEN);
                btn23.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn23.setForeground(Color.blue);
                btn23.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn23.setForeground(Color.black);
                btn23.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn23.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn23.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }
        if(btnNum == 24)
        {
            if(color.equals("green"))
            {
                btn24.setForeground(Color.GREEN);
                btn24.setBackground(Color.GREEN);
            }
            else if(color.equals("blue"))
            {
                btn24.setForeground(Color.blue);
                btn24.setBackground(Color.blue);
            }
            else if(color.equals("black"))
            {
                btn24.setForeground(Color.black);
                btn24.setBackground(Color.black);
            }
            else if(color.equals("brown"))
            {
                btn24.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn24.setBackground(Color.getHSBColor(.14f,.90f,.25f));
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
                        btnArr[i].setText("A");
                    }
                }
            }
            numBugs--;
        }
        return;














    }
}
