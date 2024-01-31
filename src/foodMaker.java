import java.util.Timer;
import java.util.*;
//import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.Executors;
import java.util.concurrent.*;
import java.util.concurrent.ScheduledExecutorService;
public class foodMaker {

    // spawns random food around the tileset every n seconds
    public static boolean cancel = false;
    // code for a 2-second timer
    // will create a random food every 2 seconds
    public static void stage1() {//String[] args

        //Timer foodTime = new Timer();
        //TimerTask task = new TimerTask() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {

                if(cancel){
                    scheduler.shutdown();
                }

                //random food
                int randomNum = ThreadLocalRandom.current().nextInt(1, 2 + 1);//(min,max)
                //random row
                int x = ThreadLocalRandom.current().nextInt(1, 16 + 1);
                //random col
                int y = ThreadLocalRandom.current().nextInt(1, 16 + 1);

                //if #==1 create leaf, otherwise create other food
                if (randomNum == 1) {
                    System.out.println("newAnt");
                    leaf l = new leaf(x, y);
                } else {

                    System.out.println("newOther");
                    //leaf l = new OtherFoodType( x, y);

                }
            }
        }, 1, 4L, TimeUnit.SECONDS);

    }

    public static void stage2() {//String[] args

        //Timer foodTime = new Timer();
        //TimerTask task = new TimerTask() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {

                if(cancel){
                    scheduler.shutdown();
                }

                //random food
                int randomNum = ThreadLocalRandom.current().nextInt(1, 2 + 1);//(min,max)
                //random row
                int x = ThreadLocalRandom.current().nextInt(1, 16 + 1);
                //random col
                int y = ThreadLocalRandom.current().nextInt(1, 16 + 1);

                //if #==1 create leaf, otherwise create other food
                if (randomNum == 1) {
                    System.out.println("newAnt");
                    leaf l = new leaf(x, y);//addFood
                } else {

                    System.out.println("newOther");
                    //leaf l = new OtherFoodType( x, y);

                }
            }
        }, 1, 3L, TimeUnit.SECONDS);

    }
    public void cancelStage(){
        cancel = !cancel;
    }

}
