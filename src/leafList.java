import java.util.*;
public class leafList {

        private List<leaf> objects = new ArrayList<>();


            public void addFood (leaf obj)
            {
                objects.add(obj);
            }
            public void removeFood (leaf obj)
            {
                objects.remove(obj);
            }

    public void listLeafs ()
    {
        int i =0;
        for(leaf b : objects)
        {
            i=i+1;
            System.out.print(objects.get(i));
        }
    }

}
