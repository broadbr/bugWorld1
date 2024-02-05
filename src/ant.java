import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;

public class ant extends bug{
    /* Values are subject to change
    private String name = "ant";
    private int damage = 1;
    private int cost = 1; 
    private int health = 1;
    test*/
    
    ant(){
    super("ant", 1, 1, 1, 0,0 );
    }

    @Override
    public void Update() {

        
    }

    @Override
    public void Render(Graphics g) {
        
        g.setColor(Color.black);
        g.fillRect(5,5 ,20, 20);
    }

    @Override
     public Rectangle getBounds() {
        return null;
    } 
}