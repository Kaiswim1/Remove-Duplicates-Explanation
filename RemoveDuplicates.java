import java.util.ArrayList;
import java.util.Iterator;

/**
 * Removing Duplicates with an arrayList.
 * */
public class RemoveDuplicates {



    public static void main(String[] args){
        a = new ArrayList<>();
        a.add(new Point(1, 3, 3));
        a.add(new Point(6, 2, 3));
        a.add(new Point(8, 3, 3));
        a.add(new Point(6, 2, 4));
        a.add(new Point(1, 3, 3));
        a.add(new Point(6, 2, 3));
        a.add(new Point(8, 3, 3));
        a.add(new Point(6, 2, 4));

        a.add(new Point(1, 3, 3));
        a.add(new Point(6, 2, 3));
        a.add(new Point(8, 3, 3));
        a.add(new Point(6, 2, 4));
        a.add(new Point(1, 3, 3));
        a.add(new Point(6, 2, 3));
        a.add(new Point(8, 3, 3));
        a.add(new Point(6, 2, 4));

        a.add(new Point(1, 3, 3));
        a.add(new Point(6, 2, 3));
        a.add(new Point(8, 3, 3));
        a.add(new Point(6, 2, 4));
        a.add(new Point(1, 3, 3));
        a.add(new Point(6, 2, 3));
        a.add(new Point(8, 3, 3));
        a.add(new Point(6, 2, 4));

        a.add(new Point(1, 3, 3));
        a.add(new Point(6, 2, 3));
        a.add(new Point(8, 3, 3));
        a.add(new Point(6, 2, 4));
        a.add(new Point(1, 3, 3));
        a.add(new Point(6, 2, 3));
        a.add(new Point(8, 3, 3));
        a.add(new Point(6, 2, 4));

        a.add(new Point(1, 3, 3));
        a.add(new Point(6, 2, 3));
        a.add(new Point(8, 3, 3));
        a.add(new Point(6, 2, 4));
        a.add(new Point(1, 3, 3));
        a.add(new Point(6, 2, 3));
        a.add(new Point(8, 3, 3));
        a.add(new Point(6, 2, 4));

        a.add(new Point(1, 3, 3));
        a.add(new Point(6, 2, 3));
        a.add(new Point(8, 3, 3));
        a.add(new Point(6, 2, 4));
        a.add(new Point(1, 3, 3));
        a.add(new Point(6, 2, 3));
        a.add(new Point(8, 3, 3));
        a.add(new Point(6, 2, 4));

        removeDuplicates(a);
        printArrayList();
    }
    static ArrayList<Point> a;
    public static void removeDuplicates(ArrayList<Point> p){
        /**
         * Normally you could iterate using an i++ variable in a for loop.
         * However, if you remove an item from a list while looping through it then
         * Java will throw a ConcurrentModificationException.
         * Using an Iterator Object will solve this problem.
         */
        Iterator<Point> iterator = p.iterator();
        while (iterator.hasNext()) {
            Point pi = iterator.next();
            for (Point pj : p) {
                if (pi != pj && pi.equals(pj)) {
                    iterator.remove();
                    break; // Break the inner loop after removing a duplicate
                }
            }
        }

    }
    public static void printArrayList(){
        for(Point p:a){
            System.out.println("["+p.layer+"] ["+p.row+"] ["+p.col+"]");
        }
    }
}
