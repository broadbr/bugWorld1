//import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

    // used for first stage
    //will spawn each leaf in a radius around a theoretical tree

    //call every n seconds to make food
public class stage1 {


    public void makeFood()

    {
        // tree location(s)
        int tree1X = 230;
        int tree1Y = 140;
        int tree2X = 620;
        int tree2Y = 250;


        //choose a tree

        int currTreeX =0;
        int currTreeY;
        int r = ThreadLocalRandom.current().nextInt(1, 2+1);
        if(r ==1){
            currTreeX = tree1X;
            currTreeY = tree1Y;
        }
        else{
            currTreeX = tree2X;
            currTreeY = tree2Y;
        }


        //selects random type of food
        int randNum = ThreadLocalRandom.current().nextInt(1, 2 + 1);//(min,max)


        // creates random location within 6 units of tree
        int x = ThreadLocalRandom.current().nextInt(currTreeX, 175 + currTreeX);
        int y = ThreadLocalRandom.current().nextInt(currTreeY, 175 + currTreeY);

        //if #==1 create leaf, otherwise create other food
        if (randNum == 1) {

            //check existing food locations
            int i = 0;
            boolean overlap = false;
            for(gameObject g: foodList.objects){
                if (x == foodList.objects.get(i).getX() && y == foodList.objects.get(i).getY()){
                    overlap = true;
                }
            }
            //if !ovelaping spawn food in random location
            if(!overlap){
                leaf l = new leaf(x, y);//creates new leaf
                foodList.objects.add(l);//adds it to list
            }
        }
        else {

            //check existing food locations
            int i = 0;
            boolean overlap = false;
            for(gameObject g: foodList.objects){
                if(x == foodList.objects.get(i).getX() && y == foodList.objects.get(i).getY()){
                    overlap = true;
                }
            }
            //if !ovelaping spawn food in random location
            if(!overlap){
            berry l = new berry(x, y);//creates new leaf
            foodList.objects.add(l);//adds it to list
            }
        }
    }
}
