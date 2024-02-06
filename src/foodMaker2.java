//import java.util.Random;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class foodMaker2
{

    leafList leafList = new leafList();
    // spawns random food around the tileset every n seconds
    public boolean cancel = false;
    // code for a 2-second timer
    // will create a random food every 4 seconds
    public void stage1() {
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {

                //random food
                int randomNum = ThreadLocalRandom.current().nextInt(1, 2 + 1);//(min,max)
                //random row
                int x = ThreadLocalRandom.current().nextInt(1, 16 + 1);
                //random col
                int y = ThreadLocalRandom.current().nextInt(1, 16 + 1);

                //if #==1 create leaf, otherwise create other food
                if (randomNum == 1) {
                    //checks for existing leafs in same position
                    int i = -1;// controls objects in list
                    boolean overlap = false;// trip if an object is in same location
                    //checks existing food locations
                    for (leaf b : leafList.objects) {
                        i = i + 1;
                        int tempRow = leafList.objects.get(i).getRow();
                        int tempCol = leafList.objects.get(i).getColumn();
                        if ((tempRow == x) && (tempCol == y)) {
                            overlap = true;
                        }
                    }
                    if (overlap) {

                    } else {
                        leaf l = new leaf(x, y);//creates new leaf
                        leafList.addFood(l);//adds it to list
                    }
                    overlap = false;
                } else {
                    //leaf l = new OtherFoodType( x, y);
                }
            }
        },1, 900);


    }

    //second stage spawns food faster
    public void stage2()
    {

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {

                //random food
                int randomNum = ThreadLocalRandom.current().nextInt(1, 2 + 1);//(min,max)
                //random row
                int x = ThreadLocalRandom.current().nextInt(1, 16 + 1);
                //random col
                int y = ThreadLocalRandom.current().nextInt(1, 16 + 1);

                //if #==1 create leaf, otherwise create other food
                if (randomNum == 1)
                {
                    //checks for existing leafs in same position
                    int i =-1;// controls objects in list
                    boolean overlap = false;// trip if an object is in same location
                    //checks existing food locations
                    for(leaf b : leafList.objects)
                    {
                        i=i+1;
                        int tempRow = leafList.objects.get(i).getRow();
                        int tempCol = leafList.objects.get(i).getColumn();
                        if ((tempRow==x)&&(tempCol==y))
                        {
                            overlap = true;
                        }
                    }
                    if(overlap)
                    {

                    }
                    else
                    {
                        leaf l = new leaf(x, y);//creates new leaf
                        leafList.addFood(l);//adds it to list
                    }
                    overlap=false;
                }
                else
                {
                    //leaf l = new OtherFoodType( x, y);
                }
            }
        }, 2, 800);

    }
    //call cancel to end stage and before starting another
    //obsolete replace
    public void cancelStage() {
        cancel = !cancel;
    }

}
