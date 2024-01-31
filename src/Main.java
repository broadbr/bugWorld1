import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {



    public static void main(String[] args) {
        System.out.println("");

        foodMaker fm = new foodMaker();
        foodMaker.stage1();//call stage2 & cancelStage X2 with gems after defeating farmer



        gridMap f = new gridMap();
        f.setButtonColor(0 , "green");

        ant a = new ant();
        spider s = new spider();
        beetle b = new beetle();

        System.out.println("Ant: \n" + a.getName() + a.getPrice());
        System.out.println("beetle: \n" + b.getName() + b.getPrice());
        System.out.println("spider: \n" + s.getName() + s.getPrice());
    }
}