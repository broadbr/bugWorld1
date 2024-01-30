import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {



    public static void main(String[] args) {
        System.out.println("");

        foodMaker fm = new foodMaker();
        foodMaker.produce();

        gridMap f = new gridMap();
        f.setButtonColor(0 , "green");

    }
}