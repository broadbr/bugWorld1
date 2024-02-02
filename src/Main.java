import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.*;

public class Main extends JPanel {



    public static void main(String[] args) {
        System.out.println("");
        bugList bugList = new bugList();
        leafList leafList = new leafList();
        foodMaker foodMaker= new foodMaker();
        bank bank = new bank();


        foodMaker.stage1();//call stage2 & cancelStage X2 with gems after defeating farmer

        gridMap f = new gridMap();
        f.setButtonColor(0 , "green");
        f.addBug(4,"ant" , 7);
        f.deleteBug(4,"Ant" , 5);

        ant a = new ant();
        spider s = new spider();
        beetle b = new beetle();

        System.out.println("Ant: \n" + a.getName() + a.getPrice());
        System.out.println("beetle: \n" + b.getName() + b.getPrice());
        System.out.println("spider: \n" + s.getName() + s.getPrice());

        System.out.println("Bank: " + bank.getAccount());

        //shopDisplay sd = new shopDisplay();
        //
        //testing
        Timer t = new Timer();
        t.schedule(new TimerTask()
        {
            @Override
            public void run()
                {

                        leafList.listLeafs();
                }

        }, 0, 5000);

    }
}