 import java.awt.Canvas;
 import javax.swing.*;

 public class Game extends Canvas implements Runnable {
    
    private int bank =1; //eventual track account here
    private boolean isRunning = false;


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
    }
    public void stop() {
        isRunning = false;
    }
    public void update() {

    }
    public void render() {

    }
    public static void main(String[] args) {
        
        new Game();
        
        System.out.println("test");


    }
}