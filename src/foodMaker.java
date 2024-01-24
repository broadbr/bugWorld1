import java.util.Timer;
import java.util.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class foodMaker {

    // spawns random food around the tileset every n seconds


    public int foodType = 0;
    public int count =0;


    // code for a 2-second timer
    // will create a random food every 2 seconds
        public static void produce(String[] args) {

            Timer foodTime = new Timer();
            TimerTask task = new TimerTask() {

                int counter = 0;
                @Override
                public void run() {
                    if(counter%2==0) {
                        //random food
                        int randomNum = ThreadLocalRandom.current().nextInt(1, 2 + 1);//(min,max)
                        //random row
                        int x = ThreadLocalRandom.current().nextInt(1,16 +1);
                        //random col
                        int y = ThreadLocalRandom.current().nextInt(1,16+1);

                        //if #==1 create leaf, otherwise create other food
                        if(randomNum == 1){
                            /*{
                                leaf l = new leaf(name leaf, health 1, row x, column y);
                                return l;
                            }*/
                        }
                        else{
                            /*{
                                leaf l = new OtherFoodType();
                                return l;
                            }*/
                        }

                        counter++;
                    }
                }
            };
            foodTime.scheduleAtFixedRate(task, 0, 1000);
        }

}
