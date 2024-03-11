import java.awt.*;

//game object that have ally behaviour
public class ant extends gameObject implements ally {
    foodList fl = new foodList();
    bank bank = new bank();
    leaf newLeaf = new leaf(200,100);
    private int bugX , bugY;
    private int leafX , leafY;

    private boolean canMove = true;
    private int canMovei = 0;
    private boolean lockOnLeaf = false;
    private boolean justPickedLeaf = false;

    Image image = Toolkit.getDefaultToolkit().getImage("src/assets/AntSmall.png");
    protected String name = "ant";

    protected int damage = 1;
    protected int price = 1;
    protected int health = 1;

    protected boolean onLeaf = false;


    //
    public ant(){
        super.setX(500);
        super.setY(300);
    };

    public ant(int x, int y) {
        super.setX(x);
        super.setY(y);
    }


    //Graphics
    public void Update() {
        
        move(this , findNearestLeaf(this));
    }

    public void Render(Graphics var1) {
        var1.drawImage(image,(int)x,(int)y,null);
       // var1.fillRect(x, y, 20, 20);
    }
    public Rectangle getBounds() {
        return null;
    }


    //Kill bug
    public void damageObject(int var1) {
        this.health -= var1;
        if (this.health <= 0) {
            bugList.objects.remove(this);
        }

    }

    //Get/Set
        @Override
        public String getName() {
            return "ant";
        }

        @Override
        public int getDamage() {
            return 1;
        }

        @Override
        public int getPrice() {
            return 1;
        }

        @Override
        public int getHealth() {
            return this.health;
        }

        public void setDamage(int damage) {this.damage=damage;}
        public void setHealth(int health) {this.health=health;}

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

        public void move(gameObject bug, gameObject leaf){
           
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
                //x = bugX++;
                bug.setX(bugX);
            }
            else if(leafX < bugX)
            {
                bugX--;
                //x = bugX++;
                bug.setX(bugX);
            }

            if(leafY > bugY)
            {
            bugY++;
            //y = bugY++;
            bug.setY(bugY);
            }
            else if(leafY < bugY)
            {
            bugY--;
            //y = bugY++;
                bug.setY(bugY);
            }
            //System.out.println("Ant cords:(" + bugX + "," + bugY + ") Leaf cords:(" + leafX + "," + leafY + ")");
            if(leafX == bugX && leafY == bugY)
            {
                onLeaf = true;
                lockOnLeaf = false;
                //System.out.println("WE FOUND A LEAF AND GOT IT");
                fl.destroy(leaf);
                bug.setX(bugX);
                bug.setY(bugY);
                justPickedLeaf = true;
                
            }
            else{
                onLeaf = false;
            }
            canMovei++;
 

        }


}
