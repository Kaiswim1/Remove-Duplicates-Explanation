import java.util.HashSet;

/**
 * WHY IS A HASHSET BETTER THAN AN ARRAYLIST IN THIS CASE?
 * A HashSet is a collection Data Structure that makes use of the unique integer ID given
 * to every object in Java. If a duplicate is found, the HashSet will use .equals() to
 * remove it before it ever gets added to the HashSet collection.
 *
 * With an ArrayList you are adding tons of duplicates, after that you have to remove
 * all of them with another costly O(n^2) algorithm making it incredibly slow and un-scalable.
 *
 * Understanding data structures is a way you can write must faster code.
 *
 * Some common data structures include:
 * Array-List, Linked-List, Hash-Map, Binary-Tree, Heap.
 *
 * How do you determine what data structure you should use?
 * Every data structure specializes in specific operations.
 * For example an Array List lookup is O(1) but add and remove is O(n)
 * For a Linked list, lookup is O(n) but add an remove is O(1).
 *
 *
 * //TODO: HOW CAN YOU ADD AN ITEM AT A SPECIFIC INDEX OF AN ARRAY?
 * //Example: {"hi", "bye", "a", "the", null, null} --> list.add("hey", 1) --> {"hi", "hey", "bye", "a", "the", null}
 */

public class RemoveDuplicatesHashSet {
    public static void main(String[] args){
        HashSet<Point> a = new HashSet<>();
        a.add(new Point(0, 0, 0));
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
        System.out.print(a);

    }
}
