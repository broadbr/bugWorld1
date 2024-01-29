public class boss {

    private String name ="Farmer";
    public int damage = 3;
    public int price = 10;
    public int row;
    public int column;

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getPrice(){
        return price;
    }

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
