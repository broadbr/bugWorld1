import java.util.ArrayList;
import java.util.List;

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

    public void listBugs ()
    {
        int i =0;
        for(bug b ;  objects)
        {
            i=i+1;
            System.out.print(objects.get(i));
        }
    }

}

