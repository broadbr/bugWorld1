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

    }

