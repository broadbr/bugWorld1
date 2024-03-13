import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class hornet extends gameObject implements enemy {
    //Stats
    protected int damage = 20;
    protected String name = "hornet";
    protected int health = 1;
    //Other
    private enemyList el = new enemyList();

    //move vars
    private int canMovei = 0;
    private int bugY , bugX, enemyX, enemyY;
    private boolean lockOnBug = false;
    private boolean onLeaf = false;
    private bugList bl = new bugList();

    public hornet() {
        super.setX(100);
        super.setY(100);
    }

    public hornet(int x, int y) {
        super.setX(x);
        super.setY(y);
    }


    @Override
    public void Update() {
        
        move(this, findNearestBug(this));
    }

    @Override
    public void Render(Graphics var1) {
        
        var1.fillRect(x, y, 20, 20);
        var1.setColor(Color.YELLOW);
        
        
    }

    @Override
    public Rectangle getBounds() {
        
        return null;
    }
    
    @Override
    public String getName () {
        return name;
    }
    @Override
        public int getDamage () {
            return damage;
    }
    @Override
    public int getPrice () {
        return price;
    }
    @Override
        public int getHealth () {
            return this.health;
    }
    public void setDamage(int damage) {this.damage=damage;}

    public void setHealth(int health){this.health=health;}
    @Override
    public void damageObject(int var1) {
       this.health -= var1;
       if(health==0) {
           el.objects.remove(this);
       }
        
    }

    public gameObject findNearestBug(gameObject hornet)
        {
            int nearestBug = 0;
            int x , y;
            int differenceX , differenceY , thisTotDifference;
            int totDifference = 0;
            gameObject bug;
            
            for(int i = 0; i<bl.getSize();i++)
            {
                bug = bl.getBugList(i);
                x = bug.getX();
                y = bug.getY();
                if(x > hornet.getX())
                {
                    differenceX = x - hornet.getX();
                }
                else
                {
                    differenceX = hornet.getX() - x;
                }
                if(y > bug.getY())
                {
                    differenceY = y - hornet.getY();
                }
                else
                {
                    differenceY = hornet.getY() - y;
                }
                thisTotDifference = differenceY + differenceX;
                if(totDifference > thisTotDifference || i == 0)
                {
                    totDifference = thisTotDifference;
                    nearestBug = i;
                }


            }
            gameObject closestBug = bl.getBugList(nearestBug);
            bugX = closestBug.getX();
            bugY = closestBug.getY();
            return closestBug;
        }
        

    @Override
    public void move(gameObject enemy, gameObject bug) {
        
       
        if(!lockOnBug) {
            bugX = bug.getX();
            bugY = bug.getY();
            enemyX = enemy.getX();
            enemyY = enemy.getY();
            lockOnBug = true;
            return;
        }
        if(bugX > enemyX)
        {   
            enemyX++;
            //x = enemyX++;
            enemy.setX(enemyX);
        }
        else if(bugX < enemyX)
        {
            enemyX--;
            //x = enemyX++;
            enemy.setX(enemyX);
        }

        if(bugY > enemyY)
        {
            enemyY++;
            //y = enemyY++;
            enemy.setY(enemyY);
        }
        else if(bugY < enemyY)
        {
            enemyY--;
            //y = enemyY++;
            enemy.setY(enemyY);
        }
        //System.out.println("Ant cords:(" + enemyX + "," + enemyY + ") Leaf cords:(" + bugX + "," + bugY + ")");
        if(bugX == enemyX && bugY == enemyY)
        {
            onLeaf = true;
            lockOnBug = false;
            bug.damageObject(damage);
            bug.setX(enemyX);
            bug.setY(enemyY);
            
        }
        else{
            onLeaf = false;
        }
        canMovei++;   
        
    }

    
}
