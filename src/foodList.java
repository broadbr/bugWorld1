import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class foodList {
    //leaf firstLeaf = new leaf(100,100);
    public static List<gameObject> objects = new ArrayList();


    public foodList() {
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
    public void addLeaf(gameObject var1) {
        objects.add(var1);
    }

    //top of list
    //also try bugList.objects.get(i);
    public void topLeaf(){objects.get(0);}


    //list type of object
    /*
    public String bugName(){
        bug top = objects.get(0);
        if (top instanceof ant) {
            ant a = (ant)top;
            String n = a.getName();
        }
        return n;
    }*/


    //display all bugs to terminal
    public void listLeaves(){

        System.out.print("\nfood content: ");
        for(int i = 0; i < objects.size(); i++)
        {
            System.out.print(objects.get(i).getName());
        }
        System.out.print("\n");
    }
    public gameObject getLeafList(int index)
    {
        return objects.get(index);
    }
    public int getSize()
    {
        return objects.size();
    }



    public void destroy(gameObject g){
        bank.bank.setEarnt(g.getValue());
        objects.remove(g);

    }


}
