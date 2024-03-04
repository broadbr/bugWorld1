import java.awt.*;
public class beatle extends gameObject implements ally {

    foodList fl = new foodList();
    protected String name = "beatle";

    protected int damage = 2;
    protected int price = 3;
    protected int health = 2;

    private int canMovei = 0;
    private int leafX , leafY;
    private int bugX, bugY;
    private boolean lockOnLeaf = false;
    private boolean onLeaf = false;





    Image image = Toolkit.getDefaultToolkit().getImage("src/assets/beetleSmall.png");

    //
    public beatle() {
            super.setX(500);
            super.setY(300);
        }
        
    public beatle( int x, int y){
            super.setX(x);
            super.setY(y);
        }



    //Graphics
    public void Update() {
        move(this, findNearestLeaf(this));
    }

    public void Render(Graphics var1) {
        var1.drawImage(image,x,y,null);
        //var1.fillRect(x, y, 20, 20);
    }
    public Rectangle getBounds() {
        return null;
    }

    public gameObject findNearestLeaf(gameObject ant)
        {
            int nearestLeaf = 0;
            int x , y;
            int differenceX , differenceY , thisTotDifference;
            int totDifference = 0;
            gameObject leaf;
            for(int i = 0; i<fl.getSize();i++)
            {
                leaf = fl.getLeafList(i);
                x = leaf.getX();
                y = leaf.getY();
                if(x > ant.getX())
                {
                    differenceX = x - ant.getX();
                }
                else
                {
                    differenceX = ant.getX() - x;
                }
                if(y > ant.getY())
                {
                    differenceY = y - ant.getY();
                }
                else
                {
                    differenceY = ant.getY() - y;
                }
                thisTotDifference = differenceY + differenceX;
                if(totDifference > thisTotDifference || i == 0)
                {
                    totDifference = thisTotDifference;
                    nearestLeaf = i;
                }


            }
            gameObject closestLeaf = fl.getLeafList(nearestLeaf);
            leafX = closestLeaf.getX();
            leafY = closestLeaf.getY();
            return closestLeaf;
        }




    //Kill bug
    public void damageObject ( int var1){
        this.health -= var1;
        if (this.health <= 0) {
            bugList.objects.remove(this);
        }

    }


    //Get/Set
    @Override
    public String getName () {
        return "beatle";
    }
    @Override
        public int getDamage () {
            return 2;
    }
    @Override
    public int getPrice () {
        return 3;
    }
    @Override
        public int getHealth () {
            return this.health;
    }
    public void setDamage(int damage) {this.damage=damage;}

    public void setHealth(int health){this.health=health;}

    public void move(gameObject bug, gameObject leaf){
        if(canMovei != 0)
        {
            canMovei++;
            if(canMovei >= 10)
            {
                canMovei = 0;
            }
            return;
        }
        if(!lockOnLeaf) {
            leafX = leaf.getX();
            leafY = leaf.getY();
            bugX = bug.getX();
            bugY = bug.getY();
            lockOnLeaf = true;
            return;
        }
        if(leafX > bugX)
        {
            bugX++;
            bug.setX(bugX);
        }
        else if(leafX < bugX)
        {
            bugX--;
            bug.setX(bugX);
        }

        if(leafY > bugY)
        {
            bugY++;
            bug.setY(bugY);
        }
        else if(leafY < bugY)
        {
            bugY--;
            bug.setY(bugY);
        }
        System.out.println("Ant cords:(" + bugX + "," + bugY + ") Leaf cords:(" + leafX + "," + leafY + ")");
        if(leafX == bugX && leafY == bugY)
        {
            onLeaf = true;
            lockOnLeaf = false;
            System.out.println("WE FOUND A LEAF AND GOT IT");
            bug.setX(bugX);
            bug.setY(bugY);
        }
        else{
            onLeaf = false;
        }
        canMovei++;


    }

}