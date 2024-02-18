public class farmer {

    private String name ="Farmer";
    public int damage = 3;
    public int price = 10;

    public int health = 10;
    public int row;
    public int column;

    public void damageBoss(int damage){
        health = health- damage;
        if(health<=0){
            //killfarmer
            //setBank
        }
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getPrice(){
        return price;
    }

    public int getHealth(){return health;}

    public int getRow(){
        return row;
    }

    public int getColumn(){
        return column;
    }

    public void setRow(int row){
        this.row = row;
    }

    public void setColumn(int column){
        this.column = column;
    }
}
