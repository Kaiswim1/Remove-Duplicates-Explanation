public class Point {
    public int layer;
    public int row;
    public int col;

    public Point(int l, int r, int c){
        this.layer = l;
        this.row = r;
        this.col = c;
    }

    /**
     * In Java, every object by default contains three methods. hashcode(), equals(Object), and toString().
     *
     * Placing an @Override before the method definition will erase the current contents and rewrite it
     * to what you specify underneath the @Override annotation
     */


    /**
     * (Layer = 2; Row = 1; Col = 1) -> returns 211;
     * A good solution for small constraints like the 8x8x8 grid
     * Very simple but wouldn't work for a very large case.
     *
     */
    /*@Override
    public int hashCode(){
        return Integer.parseInt(this.layer+""+this.row+""+this.col);
    }*/

    /**
    * Using prime numbers can reduce clusters in a HashSet.
     * Clusters are overcrowded areas in a collection.
     * Clusters can cause collisions in a HashSet
     * Too many collisions can quickly turn HashSet operations from O(1) to O(N)
     */
    @Override
    public int hashCode() {
        int result = 17; // Starting with a prime number
        result = 31 * result + Integer.hashCode(layer); // Combine layer
        result = 31 * result + Integer.hashCode(row);   // Combine row
        result = 31 * result + Integer.hashCode(col);   // Combine col
        return result; // Ensure the result is between 000 and 999
    }


    /**
     * @return the string format of the object fields. Allows printing to be simpler.
     */
    @Override
    public String toString(){
        return "["+this.layer+"] ["+this.row+"] ["+this.col+"]\n";
    }

    /**
     * WHY DO WE NEED TO OVERRIDE EQUALS?
     * Non Overridden .equals will only return true if the two compared objects are
     * the same Instance of each other.
     * Overriding it causes the HashSet to consider the numeric equivalent of the fields as equal.
     */
    @Override
    public boolean equals(Object p){
        Point p1 = (Point) p;
        return this.layer == p1.layer && this.row == p1.row && this.col == p1.col;
    }


}
