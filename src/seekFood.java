import java.util.*;
import java.util.concurrent.TimeUnit;
// heavily referenced from 'Seek.Player' CS249 Dr. Reale
//behaviour that bugs could implement to reach food


    public class seekFood {

        private int foodRow;
        private int foodCol;
        private int bugRow;
        private int bugCol;

        public void move(bug current, leaf l){

            bugRow = current.getX();
            bugCol = current.getY();
            foodRow = l.getRow()*40;//-40
            foodCol = l.getColumn()*40;//-40

            if ((bugRow == foodRow) && (bugCol == foodCol)){
                l.damageLeaf(current.getDamage());
            }
            else {
                if (Math.abs(bugRow-foodRow) > Math.abs(bugCol-foodCol)){
                    if((bugRow-foodRow) < 0){
                        current.setX(bugRow+40);
                    }
                    else{
                        current.setX(bugRow-40);
                    }

                }
                else{
                    if((bugCol-foodCol) < 0){
                        current.setY(bugCol+40);
                    }
                    else{
                        current.setY(bugCol-40);
                    }
                }

            }

        }

    }


