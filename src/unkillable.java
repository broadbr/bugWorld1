import java.awt.*;

//game object that have ally behaviour
public class unkillable extends gameObject implements ally {
    private foodList fl = new foodList();
    private enemyList el = new enemyList();
    private int bugX , bugY;
    private int leafX , leafY;

    private boolean canMove = true;
    private int canMovei = 0;
    private boolean lockOnLeaf = false;
    private boolean justPickedLeaf = false;

    private Image image = Toolkit.getDefaultToolkit().getImage("src/assets/unkillableSmall.png");
    protected String name = "unkillable";


    ///Stats
    protected int damage = 0;
    protected int price = 0;
    protected int health = 0;

    protected boolean onLeaf = false;


    //
    public unkillable(){
        super.setX(500);
        super.setY(300);
    };

    public unkillable(int x, int y) {
        super.setX(x);
        super.setY(y);
    }


    //Graphics
    public void Update() {


            move(this , findNearestLeaf(this,1));
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
        this.health+=1; //nice try
    }

    //Get/Set
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public int getDamage() {
            return this.damage;
        }

        @Override
        public int getPrice() {
            return this.price;
        }

        @Override
        public int getHealth() {
            return this.health;
        }

        public void setDamage(int damage) {this.damage=damage;}
        public void setHealth(int health) {this.health=health;}

        public gameObject findNearestLeaf(gameObject unkillable,int g)
        {
            int nearestLeaf = 0;
            int x , y;
            int differenceX , differenceY , thisTotDifference;
            int totDifference = 0;
            gameObject leaf;
            if(g==1) {
                for(int i = 0; i<fl.getSize();i++)
                {
                    leaf = fl.getLeafList(i);
                    x = leaf.getX();
                    y = leaf.getY();
                    if(x > unkillable.getX())
                    {
                        differenceX = x - unkillable.getX();
                    }
                    else
                    {
                        differenceX = unkillable.getX() - x;
                    }
                    if(y > unkillable.getY())
                    {
                        differenceY = y - unkillable.getY();
                    }
                    else
                    {
                        differenceY = unkillable.getY() - y;
                    }
                    thisTotDifference = differenceY + differenceX;
                    if(totDifference > thisTotDifference || i == 0)
                    {
                        totDifference = thisTotDifference;
                        nearestLeaf = i;
                    }


                }
            }
            if(g==2) {

                for(int i = 0; i<el.getSize();i++)
                {
                    leaf = el.getEnemyList(i);
                    x = leaf.getX();
                    y = leaf.getY();
                    if(x > unkillable.getX())
                    {
                        differenceX = x - unkillable.getX();
                    }
                    else
                    {
                        differenceX = unkillable.getX() - x;
                    }
                    if(y > unkillable.getY())
                    {
                        differenceY = y - unkillable.getY();
                    }
                    else
                    {
                        differenceY = unkillable.getY() - y;
                    }
                    thisTotDifference = differenceY + differenceX;
                    if(totDifference > thisTotDifference || i == 0)
                    {
                        totDifference = thisTotDifference;
                        nearestLeaf = i;
                    }


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
                bug.setY(bugY);
            }
            if(leaf.name.equals("spider") && (leafX >= bugX+5 && leafX <= bugX-5)&& (leafY >= bugY+5 && leafY <= bugY-5))
            {
                onLeaf = true;
                lockOnLeaf = false;
                leaf.damageObject(damage);
                bug.setX(bugX);
                bug.setY(bugY);
                justPickedLeaf = true;
                
            }
            else if(bugX == leafX && bugY == leafY){
                onLeaf = true;
                lockOnLeaf = false;
                leaf.damageObject(damage);
                bug.setX(bugX);
                bug.setY(bugY);
                justPickedLeaf = true;
            }
            else {
                onLeaf = false;
            }
            canMovei++;
 

        }


}