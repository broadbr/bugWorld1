import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class game extends Canvas implements Runnable {
    
    private int bank =1; //eventual track account here
    private boolean isRunning = false;
    private Thread thread;

    public game() {
        new window(1360,640,"Bug World 1",this);//shop+upgrades = 100x2+width = 24x20 = 480+200=680 & height = 16x20=320
        start();
    }

    public void run() {
		long lastime = System.nanoTime();
		double AmountOfTicks = 30;
		double ns = 1000000000 / AmountOfTicks;
		double delta = 0;
		int frames = 0;
		double time = System.currentTimeMillis();
		
		while(isRunning == true) {
			long now = System.nanoTime();
			delta += (now - lastime) / ns;
			lastime = now;
			
			if(delta >= 1) {
				update();
				render();
				frames++;
				delta--;
				if(System.currentTimeMillis() - time >= 1000) {
					System.out.println("fps:" + frames);
					time += 1000;
					frames = 0;
				}
			}
		}
	}
    public void start() {
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }
    public void stop() {
        isRunning = false;
        try{
            thread.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void update() {

    }
    public void render() {
        BufferStrategy buff = this.getBufferStrategy();
        
        if(buff == null) { 
            this.createBufferStrategy(3);
            return; 
        }
        
        Graphics g = buff.getDrawGraphics();
        
        g.setColor(Color.green);
        g.fillRect(0,0,1360,640);


        g.dispose();
        buff.show();
    }
    public static void main(String[] args) {
        
        new game();
        bugList bugList = new bugList();
        foodList foodList = new foodList();


        //testing insects
        gameObject b = new ant();
        bugList.addBug(b);
        bugList.listBugs();
        String name= "";
        name = bugList.objects.get(0).getName();
        System.out.print("type of bug: " + name);

        //testing food
        gameObject l = new leaf();
        foodList.addLeaf(l);
        foodList.listLeaves();
        String name2= "";
        name2 = foodList.objects.get(0).getName();
        System.out.print("type of food: " + name2);

/*
        //trying to load image
        Image image = Toolkit.getDefaultToolkit().getImage("jetbrains://idea/navigate/reference?project=bugWorld1&path=assets/csAsset.png");

        JFrame frame = new JFrame("Image Canvas");
        imageMaker canvas = new imageMaker(image);
        frame.add(canvas);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
  */


    }
}