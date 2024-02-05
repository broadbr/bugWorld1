public class leaf {

    leafList leafList = new leafList();
    bank bank = new bank();
    //leaf is the low health low value food
    //leafs *should spawn around the map randomly
    //other foods may extend leaf


    // leaf stats
    private String name ="leaf";
    private int health = 1;
    private int value = 1;//amount rewarded for eating


    // leaf location
    protected int row;
    protected int column;

    //initialize location
    protected leaf(){
        row = 100;
        column = 100;
    }

    //set location
    protected leaf(int row, int column){
        this.row=row;
        this.column=column;
        System.out.println("new leaf at, row: "+row +" col: " +column+"\n");
    }

    //access leaf stats
    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getValue(){
        return value;
    }

    public int getRow(){
        return row;
    }

    public void setRow(int row){
        this.row = row;
    }

    public int getColumn(){
        return column;
    }

    public void setColumn(int column){
        this.column = column;
    }

    public void damageLeaf(int damage){
        health = health-damage;
        if (health<=0){
            leafList.removeFood(this);
            bank.setEarnt(value);
            System.out.print("leaf killed!!, money earnt\n");
        }
    }
}
