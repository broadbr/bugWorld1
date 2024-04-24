import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

//game object that have ally behaviour
public class ant extends gameObject implements ally {
    private foodList fl = new foodList();
    private enemyList el = new enemyList();
    private int bugX , bugY;
    private int leafX , leafY;

    private boolean canMove = true;
    private int canMovei = 0;
    private boolean lockOnLeaf = false;
    private boolean justPickedLeaf = false;

    gameObject closestLeaf;

    private Image image;
    protected String name = "ant";


    ///Stats
    protected int damage = 5;
    protected int price = 1;
    protected int health = 10;

    protected boolean onLeaf = false;
    protected boolean left = true;

    //
    public ant(){
        super.setX(500);
        super.setY(300);
        try{
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream input = classLoader.getResourceAsStream("assets/AntSmall.png");
            image = ImageIO.read(input);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


    //Graphics
    public void Update() {

        //move(this , findNearestLeaf(this,1));
        if(health <= 0)
        {
            if(lockOnLeaf)
            {
                closestLeaf.setNotTargeted();
            }
        }

        if(fl.getSize()>0) {
            if(!lockOnLeaf) {
                move(this, findNearestLeaf(this, 1));
            }
            else
            {
                move(this , this.closestLeaf);
            }
        }
        //else if(el.getSize()>0 && (this.getX() <= el.topBug().getX()+25 &&  this.getX() >=el.topBug().getX() -25) &&
        //(this.getY() <= el.topBug().getY()+25 &&  this.getY() >=el.topBug().getY() -25)){
        //    move(this, findNearestLeaf(this,2));
        //}
        //else{
        //    move(this , closestLeaf);
        //};
    }

    public void Render(Graphics var1) {

        if(left){
        var1.drawImage(image,(int)x,(int)y,null);}
        else{
        var1.drawImage(image, (int)x+25, (int)y, -25, 13, null);}
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

    public gameObject findNearestLeaf(gameObject ant,int g)
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
                if(leaf.isTargeted())
                {
                    continue;
                }
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
        }
        if(g==2) {

            for(int i = 0; i<el.getSize();i++)
            {
                leaf = el.getEnemyList(i);
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
        }
        if(g==2) { closestLeaf = el.getEnemyList(nearestLeaf);}
        else{this.closestLeaf = fl.getLeafList(nearestLeaf);}
        leafX = closestLeaf.getX();
        leafY = closestLeaf.getY();
        closestLeaf.setTargeted();
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
            left = false;
        }
        else if(leafX < bugX)
        {
            bugX--;
            //x = bugX++;
            bug.setX(bugX);
            left = true;
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

        /*
        if(leaf.name.equals("spider") && (leafX >= bugX+5 && leafX <= bugX-5)&& (leafY >= bugY+5 && leafY <= bugY-5))
        {
            onLeaf = true;
            lockOnLeaf = false;
            leaf.damageObject(damage);
            bug.setX(bugX);
            bug.setY(bugY);
            justPickedLeaf = true;
            
        }

         */

        else if(bugX == leafX && bugY == leafY){
            if(this.closestLeaf.getHealth() > 0)
            {
                leaf.damageObject(damage);
                return;
            }
            onLeaf = true;
            lockOnLeaf = false;
            leaf.damageObject(damage);
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