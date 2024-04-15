import java.awt.*;

public class spider extends gameObject implements enemy {
    //Stats
    protected int damage = 3;
    protected String name = "spider";
    protected int health = 10;
    //Other
    private enemyList el = new enemyList();
    private Image image = Toolkit.getDefaultToolkit().getImage("src/assets/spider32.png");

    //move vars
    private int canMovei = 0;
    private int bugY , bugX, enemyX, enemyY;
    private boolean lockOnBug = false;
    private boolean onenemy = false;
    private bugList bl = new bugList();

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
        
        var1.drawImage(image,(int)x,(int)y,null);
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

    public gameObject findNearestBug(gameObject spider)
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
                if(x > spider.getX())
                {
                    differenceX = x - spider.getX();
                }
                else
                {
                    differenceX = spider.getX() - x;
                }
                if(y > bug.getY())
                {
                    differenceY = y - spider.getY();
                }
                else
                {
                    differenceY = spider.getY() - y;
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
        //System.out.println("Ant cords:(" + enemyX + "," + enemyY + ") enemy cords:(" + bugX + "," + bugY + ")");
        if((enemyX >= bugX-5 && enemyX <= bugX+5) && (enemyY >= bugY-5 && enemyY <= bugY+5))
        {
            onenemy = true;
            lockOnBug = false;
            bug.damageObject(damage);
            bug.setX(enemyX);
            bug.setY(enemyY);
            
        }
        else{
            onenemy = false;
        }
        canMovei++;   

        System.out.println(health);
        
    }

    
}