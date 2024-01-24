import java.util.*;

// heavily referenced from 'Seek.Player' CS249 Dr. Reale
//behaviour that bugs could implement to reach food

// could be set on a timer


    public class seekFood {

        private int foodRow;
        private int foodCol;
        private int bugRow;
        private int bugCol;

        public void move(leaf current, ant a){

            bugRow = current.getRow();
            bugCol = current.getColumn();
            foodRow = a.getRow();
            foodCol = a.getColumn();

            if ((bugRow == foodRow) && (bugCol == foodCol)){
                //do nothing
            }
            else {
                if (Math.abs(bugRow-foodRow) > Math.abs(bugCol-foodCol)){
                    if((bugRow-foodRow) < 0){
                        current.setRow(bugRow+1);
                    }
                    else{
                        current.setRow(bugRow-1);
                    }

                }
                else{
                    if((bugCol-foodCol) < 0){
                        current.setColumn(bugCol+1);
                    }
                    else{
                        current.setColumn(bugCol-1);
                    }
                }

            }

        }

    }


