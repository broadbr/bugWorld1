import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class game extends Canvas implements Runnable {
    
    private int bank = 1;
    private boolean isRunning = false;
    private Thread thread;
    private bugList bugList;
    private foodList foodList;
    private stage1 stage1;
    private stage2 stage2;
    public int activeStage =1;
    //public int activeStage =0;

    public game() {
        new window(1360,640,"Bug World 1",this);//shop+upgrades = 100x2+width = 24x20 = 480+200=680 & height = 16x20=320
        start();

        bugList = new bugList();
        foodList = new foodList();
        stage1 = new stage1();
        stage2 = new stage2();
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
        foodList.Update();



        //select active stage
        if(activeStage==1) {
            stage1.makeFood();// runs stage 1
        }
        if(activeStage==2){
            stage2.makeFood();// runs stage 2
        }
        /* Cycle 2


        if(activeStage==1) {
            stage1.makeFood();// runs stage 1
        }
        if(activeStage==2) {
            stage1.makeFood2();// run S 1 L 2
        }
        if(activeStage==3){
            stage2.makeFood();// runs stage 2
        }
        if(activeStage==4){
            stage2.makeFood2();// run S2 L2
        }


        */

    }

    public void render() {
        BufferStrategy buff = this.getBufferStrategy();
        
        if(buff == null) { 
            this.createBufferStrategy(3);
            return; 
        }
        
        // load stage2
        //Image image = Toolkit.getDefaultToolkit().getImage("src/assets/csStage2.png");
        Graphics g = buff.getDrawGraphics();
        //g.drawImage(image,-70,0,null); // loads stage 2
        ////////////////////////////////////

            //load stage1
        if(activeStage == 1) {
            Image image = Toolkit.getDefaultToolkit().getImage("src/assets/csNewAsset.png");
            g.drawImage(image,150,100,null); // loads stage 1
        }
        if(activeStage == 2) {
            Image image = Toolkit.getDefaultToolkit().getImage("src/assets/csStage2.png");
            g.drawImage(image,-70,0,null); // loads stage
        }

        /*
        if(activeStage == 0) {
            Image image = Toolkit.getDefaultToolkit().getImage("menu.png");
            g.drawImage(image,150,100,null); // loads menu png
        }
        if(activeStage == 1) {
            Image image = Toolkit.getDefaultToolkit().getImage("src/assets/Stage1AssetTemp.png");
            g.drawImage(image,150,100,null); // loads stage 1 L1

        if(activeStage == 2) {
            Image image = Toolkit.getDefaultToolkit().getImage("src/assets/Stage1Asset2.png");
            g.drawImage(image,150,100,null);  // loads stage 1 L2
        }

        if(activeStage == 3) {
            Image image = Toolkit.getDefaultToolkit().getImage("src/assets/Stage2Asset1.png");
            g.drawImage(image,150,100,null); // loads stage 2 L1

        if(activeStage == 4) {
            Image image = Toolkit.getDefaultToolkit().getImage("src/assets/Stage2Asset2.png");
            g.drawImage(image,-70,0,null); // loads stage 2 L2

        */




        // Draw portal
        Image image2 = Toolkit.getDefaultToolkit().getImage("src/assets/portal.png");
        g.drawImage(image2,500,290,null); //


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