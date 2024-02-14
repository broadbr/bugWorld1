// search leaflist and find what leaf current bug is closest to
// move 40 toward the leaf
import java.util.*;


public class seekFood2 {

    private int foodRow;
    private int foodCol;
    private int bugRow;
    private int bugCol;
    private int bank;

    //public void move(bugList bl, leafList ll) {
    public void move(bug current, leafList l) {

        for (int i = 0; i < l.objects.size(); i++) {

            if ((current.getX() == leafList.objects.get(0).getRow() && current.getY() == leafList.objects.get(0).getColumn())) {
                leafList.objects.get(i).damageLeaf(current.getDamage());
            }
        }
        //foodRow = l.objects.getRow()*40;//-40
        //foodCol = l.getColumn()*40;//-40
        int closestLeafIndex = 0;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < leafList.objects.size(); i++) {
            int distanceX = Math.abs(leafList.objects.get(i).getRow() - current.getX());
            int distanceY = Math.abs(leafList.objects.get(i).getColumn() - current.getY());

            int totalDistance = distanceX + distanceY;

            if (totalDistance < minDistance) {
                minDistance = totalDistance;
                closestLeafIndex = i;
            }
        }

        leaf closestLeaf = leafList.objects.get(closestLeafIndex);
        int deltaX = closestLeaf.getRow() - current.getX();
        int deltaY = closestLeaf.getColumn() - current.getY();

// Move the bug towards the closest leaf
        if (Math.abs(deltaX) <= Math.abs(deltaY)) {
            current.setX(current.getX() + (int) Math.signum(deltaX) * 40);
        } else {
            current.setY(current.getY() + (int) Math.signum(deltaY) * 40);
        }



        }
    }

