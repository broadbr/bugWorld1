import java.awt.*;

public class berry extends gameObject implements food{

    protected String name = "berry";
    protected int value = 2;
    protected int health = 30;
    Image image = Toolkit.getDefaultToolkit().getImage("src/assets/cherry.png");

    //
    public berry(){
    };

    public berry(int x, int y) {
        super.setX(x);
        super.setY(y);
    }


    //Graphics
    public void Update() {
        
    }

    public void Render(Graphics var1) {
        var1.drawImage(image,(int)x,(int)y,null);
       // vr1.fillRect(x, y, 20, 20);
    }
    public Rectangle getBounds() {
        return null;
    }


    //Kill bug
    public void damageObject(int var1) {
        this.health -= var1;
        if (this.health <= 0) {
            foodList.objects.remove(this);
            bank.bank.setEarnt(value);
        }

    }

    //Get/Set
    @Override
    public String getName() {
        return "berry";
    }

    @Override
    public int getValue() {
        return 2;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    public void grow(gameObject food){

    }

}
