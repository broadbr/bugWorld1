import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bugList {
    public static List<bug> objects = new ArrayList();

    public bugList() {
    }



    public void Update() {
        for(int var1 = 0; var1 < objects.size(); ++var1) {
            bug var2 = (bug)objects.get(var1);
            var2.Update();
        }

    }

    public void Render(Graphics var1) {
        for(int var2 = 0; var2 < objects.size(); ++var2) {
            bug var3 = (bug)objects.get(var2);
            var3.Render(var1);
        }

    }


    //Add a bug
    //also try: bugList.objects.add(bug);
    public void addBug(bug var1) {
        objects.add(var1);
    }


    //display all bugs to terminal
    public void listBugs(){

        System.out.print("bug content");
        for(int i = 0; i < objects.size(); i++)
        {
            System.out.print(objects.get(i));
        }
        System.out.print("\n");
    }


}
