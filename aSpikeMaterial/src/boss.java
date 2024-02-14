public class boss {

    //farmer is purchased with ~coins from the shop
    //farmer approaches the bugs and attacks them
    //farmer drops gems that increase stage (?later provide buffs?)

    private int bossRow;
    private int bossCol;
    private int bugRow;
    private int bugCol;

    public void move(farmer current, ant a){

        bossRow = current.getRow();
        bossCol = current.getColumn();
        bugRow = a.getRow();
        bugCol = a.getColumn();

        if ((bossRow == bugRow) && (bossCol == bugCol)){

        //bug.takeDamage(3);//

        }
        else {
            if (Math.abs(bossRow-bugRow) > Math.abs(bossCol-bugCol)){
                if((bossRow-bugRow) < 0){
                    current.setRow(bossRow+1);
                }
                else{
                    current.setRow(bossRow-1);
                }

            }
            else{
                if((bossCol-bugCol) < 0){
                    current.setColumn(bossCol+1);
                }
                else{
                    current.setColumn(bossCol-1);
                }
            }

        }

    }


}
