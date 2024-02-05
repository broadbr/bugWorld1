 import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics;

public class bugList {


        private List<bug> objects = new ArrayList<>();


        public void addBug (bug obj)
        {
            objects.add(obj);
        }
        public void removeBug (bug obj)
        {
            objects.remove(obj);
        }
        public void Update() {
            for(int i = 0; i < objects.size(); i++) {
                bug obj = objects.get(i);
                obj.Update();
            }
        }

        public void Render(Graphics g) {
            for(int i = 0; i < objects.size(); i++) {
                bug obj = objects.get(i);
                obj.Render(g);
            }
        }

    public void listBugs ()
    {
        int i =-1;
        System.out.print("bugList content: ");
        for(bug b : objects)
        {
            i=i+1;
            System.out.print(objects.get(i).getName()+",");
        }
        System.out.print("\n");
    }

}

