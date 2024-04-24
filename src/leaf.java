import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class leaf extends gameObject implements food{


    protected String name = "leaf";
    protected int value = 1;
    //protected int health = 20;
    protected int health = 5;
    public static int valueMod = 0;
    private Image image;

    //
    public leaf(){
    };

    public leaf(int x, int y) {
        super.setX(x);
        super.setY(y);
        try{
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream input = classLoader.getResourceAsStream("assets/REDgrass.png");
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
       // var1.fillRect(x, y, 20, 20);
    }
    public Rectangle getBounds() {
        return null;
    }


    //Kill leaf
    public void damageObject(int var1) {
        this.health -= var1;
        if (this.health <= 0) {
            foodList.objects.remove(this);
            bank.bank.setEarnt(value+valueMod);
        }

    }

    //Get/Set
    @Override
    public String getName() {
        return "leaf";
    }

    @Override
    public int getValue() {
        return 1;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    public void grow(gameObject food){
        //
    }

}
