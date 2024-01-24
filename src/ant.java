public class ant {
    //MVP should start with one bug type 'ant'
    //bugs need damage, price, speed, and ai
    //other bugs can inherit from ant or be separate


    // ant stats
    private String name ="ant";
    private int damage = 1;

    private int price = 1;


    //ant location
    protected int row;
    protected int column;

    //initialize location
    protected ant(){
        row = 0;
        column = 0;
    }
    // set ant location

    protected ant(int row, int col){
        this.row=row;
        this.column=column;
    }



    //access ant stats
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
