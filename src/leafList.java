import java.util.*;
public class leafList {

        public static List<leaf> objects = new ArrayList<>();


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
        int i =-1;
        System.out.print("leafList content: ");
        for(leaf b : objects)
        {
            i=i+1;
            System.out.print(objects.get(i).getName()+",");
        }
        System.out.print("\n");
    }

}
