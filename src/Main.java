import javax.swing.*;
import java.awt.event.*;

public class Main extends JPanel {

    private JPanel shopPanel;

    public static void main(String[] args) {
        System.out.println("");

        bank bank = new bank();

        foodMaker fm = new foodMaker();
        //foodMaker.stage1();//call stage2 & cancelStage X2 with gems after defeating farmer



        gridMap f = new gridMap();
        f.setButtonColor(0 , "green");
        f.addBug(5,"ant" , 1);

        ant a = new ant();
        spider s = new spider();
        beetle b = new beetle();

        System.out.println("Ant: \n" + a.getName() + a.getPrice());
        System.out.println("beetle: \n" + b.getName() + b.getPrice());
        System.out.println("spider: \n" + s.getName() + s.getPrice());

        System.out.println("Bank: " + bank.getAccount());


        //shopDisplay.displayShop(); // Call the function here


        System.out.println("Bank: " + bank.getAccount());


    }
}