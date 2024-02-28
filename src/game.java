import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class game extends Canvas implements Runnable {
    
    private int bank =1;
    private boolean isRunning = false;
    private Thread thread;
    private bugList bugList;
    private foodList foodList;

    public game() {
        new window(1360,640,"Bug World 1",this);//shop+upgrades = 100x2+width = 24x20 = 480+200=680 & height = 16x20=320
        start();

        bugList = new bugList();
        foodList = new foodList();
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
					//System.out.println("fps:" + frames);
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
        bugList.Update();
    }

    public void render() {
        BufferStrategy buff = this.getBufferStrategy();
        
        if(buff == null) { 
            this.createBufferStrategy(3);
            return; 
        }
        
        //Image image = Toolkit.getDefaultToolkit().getImage("src/assets/csNewAsset.png"); // loads stage 1
        Image image = Toolkit.getDefaultToolkit().getImage("src/assets/csStage2.png");// loads stage2
        Graphics g = buff.getDrawGraphics();
        ////////////////////////////////////
        //g.drawImage(image,150,100,null); // loads stage 1
        g.drawImage(image,-70,0,null); // loads stage 2


        // Draw portal
        Image image2 = Toolkit.getDefaultToolkit().getImage("src/assets/portal.png");
        Graphics g2 = buff.getDrawGraphics();
        g2.drawImage(image2,500,290,null); //


        /////////////////////////////////////
        bugList.Render(g);
        foodList.Render(g);

        g.dispose();
        buff.show();
    }
    public static void main(String[] args) {
        
        new game();
        bugList bugList = new bugList();
        foodList foodList = new foodList();
        stage1 stage1 = new stage1();



        stage1.makeFood();

        //testing insects
        /*
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
        */



        


    }
}