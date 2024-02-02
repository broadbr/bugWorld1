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
    public boolean cancel = false;
    // code for a 2-second timer
    // will create a random food every 4 seconds
    public void stage1() {//String[] args

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
                    System.out.println("newFood");
                    leaf l = new leaf(x, y);
                    leafList leafList = new leafList();
                    leafList.addFood(l);
                } else {

                    System.out.println("newOther");
                    //leaf l = new OtherFoodType( x, y);

                }
            }
        }, 1, 4L, TimeUnit.SECONDS);

    }

    //second stage spawns food faster
    public void stage2() {//String[] args

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
                    System.out.println("newFood");
                    leaf l = new leaf(x, y);//addFood
                    leafList.objects.add(l);
                } else {

                    System.out.println("newOther");
                    //leaf l = new OtherFoodType( x, y);

                }
            }
        }, 1, 3L, TimeUnit.SECONDS);

    }
    //call cancel to end stage and before starting another
    public void cancelStage(){
        cancel = !cancel;
    }

}
