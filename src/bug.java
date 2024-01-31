public class bug {
    //MVP should start with one bug type 'ant'
    //bugs need damage, price, and ai
    //other bugs can inherit from ant or be separate
    /* Changed ant class to bug
    **/


    //bug stats
    private String name;
    private int damage;
    private int price;//cost to purchase bug
    private int health;

    //bug location
    protected int row;
    protected int column;

    //initialize location
    protected bug(){
        row = 0;
        column = 0;
    }
    // set ant location

    protected bug(int row, int col){
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

    public int getHealth(){
        return health;
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
    
    bug(String name, int damage, int price, int health){
        this.name = name;
        this.damage = damage;
        this.price = price;
        this.health = health;
    }

    public void damageBug(int damage){
        health = health-damage;
        if (health<=0){
            //bugList.removeBug(this);
        }
    }

    /*
    public void setName(String bugName){
        name = bugName;
    }

    public void setDamage(int bugDamage){
        damage = bugDamage;
    }

    public void setPrice(int bugPrice){
        price = bugPrice;
    }

    public void setHealth(int bugHealth){
        health = bugHealth;
    }*/

}
