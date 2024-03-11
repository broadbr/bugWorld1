public class getNearest {
    
    private foodList fl = new foodList();
    
    //find nearest leaf when given gameObject
    public gameObject findNearestFood(gameObject ant)
        {   
            int nearestLeaf = 0;
            int x, y;
            int differenceX , differenceY , thisTotDifference;
            int totDifference = 0;
            gameObject leaf;
            for(int i = 0; i<fl.getSize();i++)
            {
                leaf = fl.getLeafList(i);
                x = leaf.getX();
                y = leaf.getY();
                if(x > ant.getX())
                {
                    differenceX = x - ant.getX();
                }
                else
                {
                    differenceX = ant.getX() - x;
                }
                if(y > ant.getY())
                {
                    differenceY = y - ant.getY();
                }
                else
                {
                    differenceY = ant.getY() - y;
                }
                thisTotDifference = differenceY + differenceX;
                if(totDifference > thisTotDifference || i == 0)
                {
                    totDifference = thisTotDifference;
                    nearestLeaf = i;
                }


            }
            gameObject closestLeaf = fl.getLeafList(nearestLeaf);
            //leafX = closestLeaf.getX();
            //leafY = closestLeaf.getY();
            return closestLeaf;
        }
    public gameObject findNearestBug(gameObject ant)
    {
        int nearestLeaf = 0;
        int x , y;
        int differenceX , differenceY , thisTotDifference;
        int totDifference = 0;
        gameObject leaf;
        for(int i = 0; i<fl.getSize();i++)
        {
            leaf = fl.getLeafList(i);
            x = leaf.getX();
            y = leaf.getY();
            if(x > ant.getX())
            {
                differenceX = x - ant.getX();
            }
            else
            {
                differenceX = ant.getX() - x;
            }
            if(y > ant.getY())
            {
                differenceY = y - ant.getY();
            }
            else
            {
                differenceY = ant.getY() - y;
            }
            thisTotDifference = differenceY + differenceX;
            if(totDifference > thisTotDifference || i == 0)
            {
                totDifference = thisTotDifference;
                nearestLeaf = i;
            }


        }
        gameObject closestLeaf = fl.getLeafList(nearestLeaf);
        //leafX = closestLeaf.getX();
        //leafY = closestLeaf.getY();
        return closestLeaf;
    }
    
    public gameObject findNearestEnemy(gameObject ant)
    {
        int nearestLeaf = 0;
        int x , y;
        int differenceX , differenceY , thisTotDifference;
        int totDifference = 0;
        gameObject leaf;
        for(int i = 0; i<fl.getSize();i++)
        {
            leaf = fl.getLeafList(i);
            x = leaf.getX();
            y = leaf.getY();
            if(x > ant.getX())
            {
                differenceX = x - ant.getX();
            }
            else
            {
                differenceX = ant.getX() - x;
            }
            if(y > ant.getY())
            {
                differenceY = y - ant.getY();
            }
            else
            {
                differenceY = ant.getY() - y;
            }
            thisTotDifference = differenceY + differenceX;
            if(totDifference > thisTotDifference || i == 0)
            {
                totDifference = thisTotDifference;
                nearestLeaf = i;
            }


        }
        gameObject closestLeaf = fl.getLeafList(nearestLeaf);
        //leafX = closestLeaf.getX();
        //leafY = closestLeaf.getY();
        return closestLeaf;
    }


}
