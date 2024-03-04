import java.awt.*;

//game object that have ally behaviour
public class ant extends gameObject implements ally {
    //foodList fl = new foodList();

    //gameObject leaf = fl.getLeafList();
    leaf newLeaf = new leaf(100,100);
    private int bugX , bugY;
    private int leafX , leafY;

    private boolean canMove = true;
    private int canMovei = 0;
    private boolean lockOnLeaf = false;

    Image image = Toolkit.getDefaultToolkit().getImage("src/assets/AntSmall.png");
    protected String name = "ant";

    protected int damage = 1;
    protected int price = 1;
    protected int health = 1;

    protected boolean onLeaf = false;


    //
    public ant(){
        super.setX(500);
        super.setY(20);
    };

    public ant(int x, int y) {
        super.setX(x);
        super.setY(y);
    }


    //Graphics
    public void Update() {
        
        
        //if(!onLeaf)
        //{
          move(this , newLeaf);
        //}
    
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
                bugX+=4;
                //x = bugX++;
                bug.setX(bugX);
            }
            else if(leafX < bugX)
            {
                bugX-=4;
                //x = bugX++;
                bug.setX(bugX);
            }

            if(leafY > bugY)
            {
               bugY+=4;
               //y = bugY++;
               bug.setY(bugX);
            }
            else if(leafY < bugY)
            {
               bugY-=4;
               //y = bugY++;
                bug.setY(bugX);
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
