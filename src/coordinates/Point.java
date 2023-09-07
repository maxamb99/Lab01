package coordinates;
/******************************************************************
 * These comments represent an example of JavaDoc Comments
 * in the way your instructor likes to write them.
 * DESCRIPTION
 * This class describes a point representing a location (x, y)
 * in coordinate space, specified to integer precision.
 ******************************************************************/
public class Point implements Comparable<Point>{
    int x;
    int y;

    /**********************************************************
     * 	constructs and initializes the current point to the
     *  location specified by the other Point passed.
     **********************************************************/
    public Point(){
        this(0, 0);
    }

    /**********************************************************
     * 	constructs and initializes the current point to the
     *  location specified by the other Point passed.
     * 	@param other point object.
     **********************************************************/
    public Point(Point other){
        this.x = other.x;
        this.y = other.y;
    }

    /***********************************************************
     * 	constructs and initializes the current point to the
     *  specified (x,y) location.
     * 	@param x the x coordinate of point to construct.
     * 	@param y the y coordinate of point to construct.
     ***********************************************************/
    public Point(int x, int y){
        setLocation(x, y);
    }

    /**************************************************************
     * 	returns the result of comparing the current point to
     * 	another point.
     *  @param other point object.
     * 	@return result of comparison criteria.
     **************************************************************/
    public int compareTo(Point other) {
        if(x != other.x)
            return x - other.x;
        else
            return y - other.y;
    }


    /**************************************************************
     * 	returns the distance between the current Point to
     *  another Point in coordinate space.
     *  @param other point object.
     * 	@return distance between two points to double precision.
     **************************************************************/
    public double distanceFrom(Point other){
        return distanceFrom(other.x, other.y);
    }


    /**************************************************************
     * 	returns the distance between the current Point to
     *  another Point listed coordinates.
     *  @param x coordinate of Point.
     *  @param y coordinate of Point.
     * 	@return distance between two points to double precision.
     **************************************************************/
    public double distanceFrom(int x, int y){
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    /***************************************************************
     * 	compares the contents of the current object to the passed
     *  object. Returns true if they have the same (x,y) position.
     *  @param obj to be compared.
     * 	@return result of boolean evaluation.
     ***************************************************************/
    public boolean equals(Object obj){
        if(obj instanceof Point other){
            return x == other.x && y == other.y;
        }
        return false;
    }

    /***************************************************************
     * 	returns the x coordinate of the point in integer precision.
     * 	@return x the x coordinate of point object.
     ***************************************************************/
    public int getX() {
        return x;
    }


    /***************************************************************
     * 	returns the y coordinate of the point in integer precision.
     * 	@return y the y coordinate of point object.
     ***************************************************************/
    public int getY() {
        return y;
    }


    /***************************************************************
     * 	shifts the current point's (x,y) location by dx along the
     *  x-axis and dy along the y-axis, giving (x + dx, y + dy).
     * 	@param dx the specified x coordinate value.
     * 	@param dy the specified y coordinate value.
     ***************************************************************/
    public void move(int dx, int dy){
        x += dx;    // x = x + dx
        y += dy;    // y = y + dy
    }


    /*****************************************************************
     * 	changes the x location of the point in coordinate space to
     *  the location specified.
     * 	@param x the specified x coordinate value.
     *****************************************************************/
    public void setX(int x) {
        this.x = x;
    }


    /*****************************************************************
     * 	changes the y location of the point in coordinate space to
     *  the location specified.
     * 	@param y the specified y coordinate value.
     *****************************************************************/
    public void setY(int y) {
        this.y = y;
    }


    /*****************************************************************
     * 	changes the location of the point in the coordinate plane to
     *  the location specified by the values (x, y).
     * 	@param x the specified x coordinate value.
     * 	@param y the specified y coordinate value.
     *****************************************************************/
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }


    /********************************************************************
     * 	returns the slope is the same for each pair of points
     *  specified.
     *  @param other point
     * 	@return slope of two points.
     *  @throws IllegalArgumentException for division by zero.
     ********************************************************************/
    public double slope(Point other){
        double dx = this.x - other.x;
        double dy = this.y - other.y;

        if (dx == 0)
            throw new IllegalArgumentException("division by zero!");

        return dy / dx;
    }


    /***************************************************************
     * 	returns string representation of a point.
     * 	@return point (x, y) coordinates.
     **************************************************************/
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }


}
