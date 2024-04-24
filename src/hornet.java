import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class hornet extends gameObject implements enemy {
    //Stats
    protected int damage = 20;
    protected String name = "hornet";
    protected int health = 1;
    //Other
    private enemyList el = new enemyList();
    private Image image;

    //move vars
    private int canMovei = 0;
    private int bugY , bugX, enemyX, enemyY;
    private boolean lockOnBug = false;
    private boolean onLeaf = false;
    private bugList bl = new bugList();

    public boolean right = true;
    public hornet() {
        super.setX(100);
        super.setY(100);
    }

    public hornet(int x, int y) {
        super.setX(x);
        super.setY(y);
        try{
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream input = classLoader.getResourceAsStream("assets/hornet.png");
            image = ImageIO.read(input);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


    @Override
    public void Update() {
        
        //move(this, findNearestBug(this));
        
        if(bl.getSize()!=0 && el.getSize()!=0) {
            move(this, findNearestBug(this));
        }
        else {
           game.gameOver = true;
        }
    }

    @Override
    public void Render(Graphics var1) {

        if(right){
        var1.drawImage(image,(int)x,(int)y,null);}
        else{
        var1.drawImage(image,(int)x+37,(int)y,-37,26,null);}
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
       if(health<=0) {
           bank.a2+=2;
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
            enemyX+=2;
            //x = enemyX++;
            enemy.setX(enemyX);
            right=true;
        }
        else if(bugX < enemyX)
        {
            enemyX-=2;
            right=false;
            //x = enemyX++;
            enemy.setX(enemyX);
        }

        if(bugY > enemyY)
        {
            enemyY+=2;
            //y = enemyY++;
            enemy.setY(enemyY);
        }
        else if(bugY < enemyY)
        {
            enemyY-=2;
            //y = enemyY++;
            enemy.setY(enemyY);
        }
        //System.out.println("Ant cords:(" + enemyX + "," + enemyY + ") Leaf cords:(" + bugX + "," + bugY + ")");
        if((bugX >= enemyX-2 && bugX <= enemyX+2) && (bugY >= enemyY-2 && bugY <= enemyY+2))
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
