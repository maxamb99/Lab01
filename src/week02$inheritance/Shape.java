package week02$inheritance;

/******************************************************************
 * {@code @author:} A. Ford
 * CODE EXAMPLE
 * This is an example of inheritance and OOP.
 * Shape is the superclass.
 * CLASS DESCRIPTION
 * This class stores the location of a shape in coordinate space.
 ******************************************************************/
public abstract class Shape {

    /**********************************************
     * State: data fields
     *        initialize data fields 
     **********************************************/
    public int x;
    public int y;

    /*****************************************************************
     * Constructor: Shape 
     *              data fields are initialized.
     * ***************************************************************/
    public Shape() {
        this(1, 1);
    }

    /*****************************************************************
     * Constructor: Shape(Shape) 
     *              data fields are initialized.
     * ***************************************************************/
    public Shape(Shape other) {
        x = other.x;
        y = other.y;
    }

    /*****************************************************************
     * Constructor: Shape(int, int) 
     *              data fields are initialized.
     * ***************************************************************/
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /****************************************************
     * abstract: area
     *           placeholder for any sublcass that uses
     *           this class as a superclass
     ****************************************************/
    public abstract double area();

    /****************************************************
     * abstract: perimeter
     *           placeholder for any sublcass that uses
     *           this class as a superclass
     ****************************************************/
    public abstract double perimeter();

    /****************************************************
     * acessor: getX
     *          accesses x data field
     ****************************************************/
    public int getX() {
        return x;
    }

    /****************************************************
     * acessor: getY
     *          accesses y data field
     ****************************************************/
    public int getY() {
        return y;
    }

    /**********************************************************
     * method: thisShape
     * 		   displays which Shape
     **********************************************************/
    public String thisShape() {
        return "Shape";
    }

    /******************************************************
     * method: toString
     * 		   displays coordinates of Shape
     ******************************************************/
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
