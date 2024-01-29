import java.util.concurrent.TimeUnit;

public class farmer {

    //farmer is purchased with ~coins from the shop
    //farmer approaches the bugs and attacks them
    //farmer drops gems that increase stage (?later provide buffs?)
/*
    private int bossRow;
    private int bossCol;
    private int bugRow;
    private int bugCol;

    public void move(farmer current, ant a){

        bugRow = current.getRow();
        bugCol = current.getColumn();
        bossRow = a.getRow();
        bossCol = a.getColumn();

        if ((bugRow == foodRow) && (bugCol == foodCol)){
            //set value for eating leaf
            bank bank = new bank();
            leaf leaf = new leaf();

            //damaging food
            int temp = current.getHealth();
            while(temp > 0)
            {
                temp -= a.getDamage();
                try
                {
                    TimeUnit.SECONDS.sleep(1);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
            }
            bank.setEarnt(leaf.getValue());

            //implement code to delete current food?

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
*/

}
