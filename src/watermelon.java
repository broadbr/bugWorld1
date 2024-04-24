import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class watermelon extends gameObject implements food{

    protected String name = "watermelon";
    protected int value = 5;
    protected int health = 400;

    private Image image;

    //
    public watermelon(){
    };

    public watermelon(int x, int y) {
        super.setX(x);
        super.setY(y);
        try{
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream input = classLoader.getResourceAsStream("assets/watermelon.png");
            image = ImageIO.read(input);
        }
        catch(IOException e){
            e.printStackTrace();
        }
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
        return "watermelon";
    }

    @Override
    public int getValue() {
        return 5;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    public void grow(gameObject food){

    }

}
