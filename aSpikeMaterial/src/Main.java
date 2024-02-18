import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.nio.Buffer;
import java.util.Timer;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main extends Canvas implements Runnable {
    private Boolean isRunning = false;
    private Thread thread;
    private bugList bugList;
    private leafList leafList;
    private bugMaker bugMaker;
    public foodMaker2 foodMaker2;
    seekFood seekFood = new seekFood();
    public int account = 1;
    public int leafs = 0;
    public int bg= 0;

    public Main() {
        new window(750, 750, "Bug World 1", this);
        start();

        bugList = new bugList();
        leafList = new leafList();
        foodMaker2 = new foodMaker2();
        bugMaker = new bugMaker();
        
        bank bank = new bank();


    }

    private void start() {
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    private void stop() {
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException x) {
            x.printStackTrace();
        }

    }

    public void run() {
        //Minecraft Game Loop
        long lastime = System.nanoTime();
        double AmountOfTicks = 30;
        double ns = 1000000000 / AmountOfTicks;
        double delta = 0;
        int frames = 0;
        double time = System.currentTimeMillis();

        while (isRunning == true) {
            long now = System.nanoTime();
            delta += (now - lastime) / ns;
            lastime = now;

            if (delta >= 1) {
                Update();
                Render();
                frames++;
                delta--;
                if (System.currentTimeMillis() - time >= 1000) {
                    //System.out.println("fps:" + frames);
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

        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        bank bank = new bank();
        //attempting to make grid
        /*  for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                g.setColor(Color.green  ); // Set default grid color
                g.fillRect(i * 40, j * 40, 40, 40);

                // Customize cell appearance based on game logic (e.g., player, obstacles)
            }
        }  */
        g.setColor(Color.getHSBColor(.14f, .90f, .25f));
        g.fillRect(0, 0, 640, 640);

        

        //ant b = new ant();
        //bugList.addBug(b);
        bugList.Render(g);
        leafList.Render(g);
       

        if(leafList.getAmount()<leafs) account++;
        leafs = leafList.getAmount();

        if(bugList.getAmount()>bg) account--;
        bg= bugList.getAmount();
        
        g.setColor(Color.black);
        g.clearRect(10, 640, 100, 75);
        g.drawString("Bank: "+ account,10,655);
        g.drawString("Leafs: "+ leafList.getAmount(),10,680);
        g.drawString("Ants: "+ bugList.getAmount(),10,705);


        g.dispose();
        bs.show();

        
    }

    public static void main(String[] args) {
        new Main();
        foodMaker2 foodMaker2;

        //bugMaker bugMaker = new bugMaker();
        bugList bugList = new bugList();
        leafList leafList = new leafList();
        bank bank = new bank();
        foodMaker2 = new foodMaker2();
        bugMaker bugMaker = new bugMaker();
        seekFood seekFood = new seekFood();
        seekFood2 seekFood2 = new seekFood2();


        foodMaker2.stage1();
        //ant b = new ant();
        //bugList.addBug(b);

       /*  gridMap f = new gridMap();
        f.setButtonColor(0 , "green");
        f.addBug(4,"ant" , 7);
        f.deleteBug(4,"Ant" , 5); */

        //
        //testing list content

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {


                if (leafList.objects.isEmpty()) {
                    try {
                        System.out.print("\n");
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                    }
                }

                //seekFood seekFood = new seekFood();
                //ant a = new ant();
                //bugList.addBug(a);
                leafList.listLeafs();
                bugList.listBugs();

                //int i = -1;
                //for(bug b : bugList.objects)
                //{
                //i=i+1;
                //b=bugList.objects.get(i);

                bug b = bugList.objects.get(0);
                leaf l = leafList.objects.get(0);
                System.out.print("\nleaf1 at " + l.getRow() * 40 + ", " + l.getColumn() * 40 + "\n");
                System.out.print("bank value:" + bank.getAccount() + "\n");
                int j =0;
                for(bug n : bugList.objects) {

                    seekFood.move(bugList.objects.get(j), l);
                    j++;
                }
                //seekFood2.move(bugList, leafList);
                //seekFood2.move(b, leafList);

                //seekFood2.move(b,leafList);
                //}
            }


        }, 0, 250);//5000


        //testing damage
/*        Timer d = new Timer();
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
*/
    }
}
