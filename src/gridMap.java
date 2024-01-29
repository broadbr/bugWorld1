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
    protected void setButtonColor(int btnNum , String color)
    {
        if(btnNum > 25 || btnNum < 1)
            return;
        if(btnNum == 0)
        {
            if(color.equals("green"))
            {
                btn0.setForeground(Color.GREEN);
                btn0.setBackground(Color.GREEN);
            }
            if(color.equals("blue"))
            {
                btn0.setForeground(Color.blue);
                btn0.setBackground(Color.blue);
            }
            if(color.equals("black"))
            {
                btn0.setForeground(Color.black);
                btn0.setBackground(Color.black);
            }
            if(color.equals("brown"))
            {
                btn0.setForeground(Color.getHSBColor(.14f,.90f,.25f));
                btn0.setBackground(Color.getHSBColor(.14f,.90f,.25f));
            }
        }


    }




}
