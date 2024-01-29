import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {



    public static void main(String[] args) {
        System.out.println("");

        foodMaker fm = new foodMaker();
        foodMaker.produce();

        JFrame frame = new JFrame();
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
        JButton btn25 = new JButton("25");

        frame.add(btn1); frame.add(btn2); frame.add(btn3); frame.add(btn4);
        frame.add(btn5); frame.add(btn6); frame.add(btn7); frame.add(btn8);
        frame.add(btn9); frame.add(btn10); frame.add(btn11); frame.add(btn12);
        frame.add(btn13); frame.add(btn14); frame.add(btn15); frame.add(btn16);
        frame.add(btn17); frame.add(btn18); frame.add(btn19); frame.add(btn20);
        frame.add(btn21); frame.add(btn22); frame.add(btn23); frame.add(btn24); frame.add(btn25);

        frame.setLayout(new GridLayout(5,5));
        frame.setSize(700, 700);
        frame.setTitle("Game Board");
        //frame.setLocationRelativeTo(null);
        //frame.setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}