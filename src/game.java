import java.awt.*;
import java.awt.image.BufferStrategy;

import javax.swing.*;

 public class Game extends Canvas implements Runnable {
    
    private int bank =1; //eventual track account here
    private boolean isRunning = false;
    private Thread thread;

    public Game() {
        new Window(680,320,"Bug World 1",this);//shop+upgrades = 100x2+width = 24x20 = 480+200=680 & height = 16x20=320
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
        thread = new Thread();
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
        g.fillRect(0,0,680,320);

        g.clearRect(9,20,50,50);
        g.drawString("Shop",10,10);
        g.drawString("Update",590,10);

        g.dispose();
        buff.show();
    }
    public static void main(String[] args) {
        
        new Game();
        new bugList();


        //testing insects
        bug b = new ant();
        bugList.objects.add(b);
        bugList.listBugs();
        


    }
}