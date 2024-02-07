// search leaflist and find what leaf current bug is closest to
// move 40 toward the leaf
import java.util.*;


public class seekFood2 {

    private int foodRow;
    private int foodCol;
    private int bugRow;
    private int bugCol;

    public void move(bug current, leafList l){

        bugRow = current.getX();
        bugCol = current.getY();
        //foodRow = l.objects.getRow()*40;//-40
        //foodCol = l.getColumn()*40;//-40

        int i = -1;
        int tempRow = 0;
        int tempCol = 0;
        for(leaf a : l.objects)
        {
            i=i+1;
            int k = l.objects.get(i).getRow()*40;
            int j = l.objects.get(i).getColumn()*40;

            if ((bugRow == l.objects.get(i).getRow()) && (bugCol == l.objects.get(i).getColumn())) {
                l.objects.get(i).damageLeaf(current.getDamage());
            }
            if(Math.abs(current.getRow()+k) > Math.abs(tempRow)){
                    tempRow=k;
            }
            if(Math.abs(current.getRow()-k) < Math.abs(tempRow)){
                tempRow = k;
            }
            if(Math.abs(current.getRow()+j) > Math.abs(tempRow)){
                tempCol=j;
            }
            if(Math.abs(current.getRow()-j) < Math.abs(tempRow)){
                tempCol = j;
            }


        }

        current.setX(tempRow);
        current.setY(tempCol);//-current.getY()
    }



}


