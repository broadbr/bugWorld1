import java.awt.*;

//game object that have ally behaviour
public class ant extends gameObject implements ally {
    foodList fl = new foodList();

    protected String name = "ant";

    protected int damage = 1;
    protected int price = 1;
    protected int health = 1;

    protected boolean onLeaf = false;


    //
    public ant(){
    };

    public ant(int x, int y) {
        super.setX(x);
        super.setY(y);
    }


    //Graphics
    public void Update() {
        if(!onLeaf)
        {
            //move(this , fl.getLeafList());
        }
    }

    public void Render(Graphics var1) {
        var1.setColor(Color.black);
        var1.fillRect(x, y, 20, 20);
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

        public void move(gameObject bug, gameObject leaf){
            int leafX = leaf.getX();
            int leafY = leaf.getY();
            int bugX = bug.getX();
            int bugY = bug.getY();
            if(leafX > bugX)
            {
                bugX ++;
            }
            else if(leafX < bugX)
            {
                bugX--;
            }
            if(leafY > bugY)
            {
                bugY++;
            }
            else if(leafY < bugY)
            {
                bugY--;
            }
            System.out.println("Ant cords:(" + bugX + "," + bugY + ") Leaf cords:(" + leafX + "," + leafY + ")");
            if(leafX == bugX && leafY == bugY)
            {
                onLeaf = true;
            }
            else{
                onLeaf = false;
            }


        }


}
