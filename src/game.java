import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.KeyEvent;

public class game extends Canvas implements Runnable, KeyListener {


    private boolean isRunning = false;
    private Thread thread;
    private bugList bugList;
    private foodList foodList;
    private stage1 stage1;
    private stage2 stage2;
    public  int activeStage = 0;//1
    private enemyList enemyList;
    public static boolean gameOver = false;
    


    public game() {//
        new window(1200, 705, "Bug World 1", this);//shop+upgrades = 100x2+width = 24x20 = 480+200=680 & height = 16x20=320
        start();
        addKeyListener(this);

        enemyList = new enemyList();
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
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            // Handle enter key press here
            System.out.println("Enter key pressed!"); //
            if (activeStage == 0) {
                // Start the game if in menu
                activeStage = 1;
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void update() {

        enemyList.Update();
        bugList.Update();
        foodList.Update();


        //spawn spider
        // need a broader spawn radius for mod x = 0 or better method
        if (bank.bank.getIntScore() % 10 == 0 && enemyList.getSize() < 2) {
            spider spider = new spider();
            enemyList.addBug(spider);
            //bank.bank.setScore(1);
        }

        if (bank.bank.getIntScore() % 15 == 0 && bank.bank.getIntScore() % 10 != 0 && enemyList.getSize() < 2) {
            hornet hornet = new hornet();
            enemyList.addBug(hornet);
            //bank.bank.setScore(1); /
        }

        //game display updates
        //unmenu names
        int j = 0;
        int k = 0;
        for (int i = 0; i < bugList.objects.size(); i++) {
            if (bugList.objects.get(i).getName().equals(("ant"))) {
                k =1+ j++;
            }
        }

        int j2 = 0;
        int k2 = 0;
        for (int i = 0; i < bugList.objects.size(); i++) {
            if (bugList.objects.get(i).getName().equals(("beatle"))) {
                k2 =1+ j2++;
            }
        }
        window.shopText.setText("Money: " + bank.bank.getAccount() + "$");
        window.shopText2.setText("Souls: " + bank.bank.getAccount2() + "*");
        window.bugCurrA.setText("Curr Ants: " + k +"/"+window.bugLimit);
        window.bugCurrB.setText("Curr Beetles: "+ k2+"/"+window.bugLimit);
        window.limitInc.setText(String.valueOf(window.scaler1+2)+"*");
        window.attackUpgrade.setText("$"+String.valueOf(window.scaler2+10));
        window.healUpgrade.setText("$"+String.valueOf(window.scaler3+10));
        window.rateButton.setText("$"+String.valueOf(window.scaler5+10));
        window.valueButton.setText("$"+String.valueOf(window.scaler4+10));


        //select active stage
        if (activeStage == 1) {
            stage1.makeFood();
        }
        if (activeStage == 2) {
            stage1.makeFood2();// runs stage 1
        }
        if (activeStage == 3) {
            stage2.makeFood();
        }

        if (activeStage == 4) {
            stage2.makeFood2();// runs stage 2
        }


    }

    public void render() {
        BufferStrategy buff = this.getBufferStrategy();

        if (buff == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = buff.getDrawGraphics();
        //load stage

        if (activeStage == 0) {
            Image image = Toolkit.getDefaultToolkit().getImage("src/assets/menuAsset.png");
            g.drawImage(image, 0, 0, null); // loads menu png
            window.menuToggle();
            //menuWindow.menuToggleOn();


        }
        if (activeStage == 1) {
            Image image1 = Toolkit.getDefaultToolkit().getImage("src/assets/stage1Asset.png");
            g.drawImage(image1, -100, 0, null); // loads stage 1 L1
            window.menuToggleOn();
            //menuWindow.menuToggle();
        }

        if (activeStage == 2) {
            Image image2 = Toolkit.getDefaultToolkit().getImage("src/assets/Stage1Asset2.png");//asset2
            g.drawImage(image2, -100, 0, null);  // loads stage 1 L2
        }

        if (activeStage == 3) {
            Image image3 = Toolkit.getDefaultToolkit().getImage("src/assets/Stage2Asset.png");
            g.drawImage(image3, -100, 0, null); // loads stage 2 L1
        }

        if (activeStage == 4) {
            Image image4 = Toolkit.getDefaultToolkit().getImage("src/assets/Stage2Asset2.png");//asses2
            g.drawImage(image4, -100, 0, null); // loads stage 2 L2
        }


        if (activeStage == 5) {
            Image image4 = Toolkit.getDefaultToolkit().getImage("src/assets/Stage2Asset2.png");//asses2
            g.drawImage(image4, -100, 0, null); // loads stage 2 L2

            Image image5 = Toolkit.getDefaultToolkit().getImage("src/assets/gameOver.png");//asses2
            g.drawImage(image5, 0, 200, null);

        }

        // Draw portal
        if (activeStage>0) {
            Image image5 = Toolkit.getDefaultToolkit().getImage("src/assets/portal.png");
            g.drawImage(image5, 500, 290, null); //
        }

        // Game Over
        if (gameOver) {
            Image image5 = Toolkit.getDefaultToolkit().getImage("src/assets/gameOver.png");
            g.drawImage(image5, 0, 200, null); 
            g.setFont(new Font("Serif", Font.PLAIN, 50));
            g.drawString("Score: " + bank.bank.getStringScore(), 350, 400);
        }

        /////////////////////////////////////
        enemyList.Render(g);
        bugList.Render(g);
        foodList.Render(g);

        g.dispose();
        buff.show();
    }
    public static void main(String[] args){

        new game();

        /////TESTING////////
        bugList bugList = new bugList();
        foodList foodList = new foodList();
        stage1 stage1 = new stage1();

    }
}

