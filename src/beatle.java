import java.awt.*;
public class beatle extends gameObject implements ally {


    protected String name = "beatle";

    protected int damage = 2;
    protected int price = 3;
    protected int health = 2;


    //
    public beatle() {
        }
        ;
    public beatle( int x, int y){
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
    public void damageObject ( int var1){
        this.health -= var1;
        if (this.health <= 0) {
            bugList.objects.remove(this);
        }

    }


    //Get/Set
    @Override
    public String getName () {
        return "beatle";
    }
    @Override
        public int getDamage () {
            return 2;
    }
    @Override
    public int getPrice () {
        return 3;
    }
    @Override
        public int getHealth () {
            return this.health;
    }
    public void setDamage(int damage) {this.damage=damage;}

    public boolean move(gameObject bug, gameObject leaf){
        //
        return false;
    }

}