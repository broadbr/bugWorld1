import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class spider extends gameObject implements enemy {
    //Stats
    protected int damage = 5;
    protected String name = "spider";
    protected int health = 10;
    //Other
    

    //move vars
    private int canMovei = 0;
    private int bugY , bugX, enemyX, enemyY;
    private boolean lockOnBug = false;
    private boolean onLeaf = false;
    private getNearest nearBug = new getNearest();
    private gameObject nearestBug;
    private bugList bl;

    public spider() {
        super.setX(100);
        super.setY(100);
    }

    public spider(int x, int y) {
        super.setX(x);
        super.setY(y);
    }


    @Override
    public void Update() {
        
        if(bl.getSize()>0) {
            nearestBug = nearBug.findNearestBug(this);
            move(this, nearestBug);
        }
    }

    @Override
    public void Render(Graphics var1) {
        var1.setColor(Color.BLACK);
        var1.fillRect(x, y, 20, 20);
        
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
    public void move(gameObject enemy, gameObject bug) {
        
       
        if(!lockOnBug) {
            bugX = bug.getX();
            bugY = bug.getY();
            enemyX = enemy.getX();
            enemyY = enemy.getY();
            lockOnBug = true;
            return;
        }
        if(enemyX > enemyX)
        {   
            enemyX++;
            //x = enemyX++;
            bug.setX(enemyX);
        }
        else if(bugX < enemyX)
        {
            enemyX--;
            //x = enemyX++;
            bug.setX(enemyX);
        }

        if(bugY > enemyY)
        {
        enemyY++;
        //y = enemyY++;
        bug.setY(enemyY);
        }
        else if(bugY < enemyY)
        {
        enemyY--;
        //y = enemyY++;
            bug.setY(enemyY);
        }
        //System.out.println("Ant cords:(" + enemyX + "," + enemyY + ") Leaf cords:(" + bugX + "," + bugY + ")");
        if(bugX == enemyX && bugY == enemyY)
        {
            onLeaf = true;
            lockOnBug = false;
            //bl.destroy();
            bug.setX(enemyX);
            bug.setY(enemyY);
            
        }
        else{
            onLeaf = false;
        }
        canMovei++;   
        
    }
}
