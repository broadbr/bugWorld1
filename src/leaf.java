public class leaf {

    // leaf stats
    private String name ="";
    private int health = 0;

    // leaf location
    protected int row;
    protected int column;

    //initialize location
    protected leaf(){
        row = 0;
        column = 0;
    }

    //set location
    protected leaf(int row, int col){
        this.row=row;
        this.column=column;
    }


    //access leaf stats
    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
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
}
