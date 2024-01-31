import java.util.*;
public class objectList {

        private List<objectList> objects = new ArrayList<>();

        public void addBug(bug obj)
        {
            objects.add(obj);
        }

        public void removeBug(bug obj)
        {
            objects.remove(obj);
        }

            public void addFood (leaf obj)
            {
                objects.add(obj);
            }
            public void removeFood (leaf obj)
            {
                objects.remove(obj);
            }

}
