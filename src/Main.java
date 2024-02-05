import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.nio.Buffer;
import java.util.Timer;
import java.util.*;

public class Main extends Canvas implements Runnable {
    private Boolean isRunning = false;
    private Thread thread;
    private bugList bugList;
    private leafList leafList;
    private foodMaker foodMaker;

     public Main() {
        new window (640,740, "Bug World 1", this);
        start();

        bugList = new bugList();
        leafList = new leafList();
        foodMaker = new foodMaker();


        
        /* Timer t = new Timer();
        t.schedule(new TimerTask()
        {
            @Override
            public void run()
                {
                    bugList.addBug(new ant());
                    leafList.addFood(new leaf());
                }

        }, 0, 5000); */
    } 
    private void start(){
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }
    private void stop(){
        isRunning = false;
        try {
        thread.join();
        }
        catch (InterruptedException x) {
            x.printStackTrace();
        }
        
    }
    public void run(){
        //Minecraft Game Loop
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
				Update();
				Render();
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
    public void Update() {
        bugList.Update();
    }
    public void Render() {

        BufferStrategy bs = this.getBufferStrategy();

        if(bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        //attempting to make grid
        /*  for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                g.setColor(Color.green  ); // Set default grid color
                g.fillRect(i * 40, j * 40, 40, 40);

                // Customize cell appearance based on game logic (e.g., player, obstacles)
            }
        }  */
        g.setColor(Color.green);
        g.fillRect(0,0,640,640);

        foodMaker.stage1();

        
        bugList.Render(g);
        leafList.Render(g);

        g.dispose();
        bs.show();
        //foodMaker.stage1();
    }

    public static void main(String[] args) {
        new Main();

        System.out.println("");
        
        
        foodMaker foodMaker= new foodMaker();
        //bugMaker bugMaker = new bugMaker();
        bugList bugList = new bugList();
        leafList leafList = new leafList();
        bank bank = new bank();


        foodMaker.stage1();//call stage2 & cancelStage X2 with gems after defeating farmer

       /*  gridMap f = new gridMap();
        f.setButtonColor(0 , "green");
        f.addBug(4,"ant" , 7);
        f.deleteBug(4,"Ant" , 5); */


        System.out.println("Bank: " + bank.getAccount());

        //shopDisplay sd = new shopDisplay();




        //
        //testing list content
        Timer t = new Timer();
        t.schedule(new TimerTask()
        {
            @Override
            public void run()
                {
                        leafList.listLeafs();
                        bugList.listBugs();
                }

        }, 0, 5000);

        //testing damage
        Timer d = new Timer();
        d.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                if(!leafList.objects.isEmpty()){
                    leafList.objects.get(0).damageLeaf(2);
                    //bugMaker.makeBug(leafList.objects.get(0).getRow(),leafList.objects.get(0).getColumn());
                }
            }
        }, 0, 15000);



    }

}