import java.awt.*;

public class ant extends bug {

    protected String name = "ant";

    protected int damage = 1;
    protected int price = 1;
    protected int health = 1;


    //
    public ant(){
    };

    public ant(int x, int y) {
        super.setX(x);
        super.setY(y);
    }


    //Graphics
    public void Update() {
    }

    public void Render(Graphics var1) {
        var1.setColor(Color.black);
        var1.fillRect(280, 280, 20, 20);
    }
    public Rectangle getBounds() {
        return null;
    }


    //Kill bug
    public void damageBug(int var1) {
        this.health -= var1;
        if (this.health <= 0) {
            bugList.objects.remove(this);
        }

    }

    //Get/Set
        public String getName() {
            return this.name;
        }

        public int getDamage() {
            return this.damage;
        }

        public int getPrice() {
            return this.price;
        }

        public int getHealth() {
            return this.health;
        }



}
