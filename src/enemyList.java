import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class enemyList {
    public static List<gameObject> objects = new ArrayList();

    public enemyList() {
    }



    public void Update() {
        for(int var1 = 0; var1 < objects.size(); ++var1) {
            gameObject var2 = (gameObject)objects.get(var1);
            var2.Update();
        }

    }

    public void Render(Graphics var1) {
        for(int var2 = 0; var2 < objects.size(); ++var2) {
            gameObject var3 = (gameObject)objects.get(var2);
            var3.Render(var1);
        }

    }


    //Add a bug
    //also try: bugList.objects.add(bug);
    public void addBug(gameObject var1) {
        objects.add(var1);
    }

    //top of list
    //also try bugList.objects.get(i);
    public void topBug(){objects.get(0);}

    //return a enemy of list at index i
    public gameObject getEnemyList(int i) {
        return objects.get(i);
    }

    //display all bugs to terminal
    public void listBugs(){

        System.out.print("\nbug content: ");
        for(int i = 0; i < objects.size(); i++)
        {
            System.out.print(objects.get(i).getName());
        }
        System.out.print("\n");
    }

    //returns size of arraylist
    public int getSize() {
        return objects.size();
    }


}
