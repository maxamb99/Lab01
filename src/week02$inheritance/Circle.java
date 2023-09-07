package week02$inheritance;
/******************************************************************
 * @author: A. Ford
 * This is an example of inheritance and OOP (module-02).
 * Dot is a subclass of Shape.
 * CLASS DESCRIPTION
 * This class is an extension of the Shape class and describes
 * and stores the dimensions of a Dot shape.
 ******************************************************************/
public class Circle extends Shape {

    /**********************************************************
     * State: data fields
     *        initialize data fields
     **********************************************************/
    public double radius;

    /**********************************************************
     * Constructor: Dot
     *              data fields are initialized.
     * ********************************************************/
    public Circle() {
        this(1.0);
    }

    /**********************************************************
     * Constructor: Dot(Dot)
     *              data fields are initialized.
     * ********************************************************/
    public Circle(Circle other) {
        this(other.radius);
    }

    /**********************************************************
     * Constructor: Dot(double)
     *              data fields are initialized.
     * ********************************************************/
    public Circle(double radius) {
        this.radius = radius;
    }

    /**********************************************************
     * accessor: getRadius
     *           accesses radius field
     **********************************************************/
    public double getRadius() {
        return radius;
    }

    /**********************************************************
     * mutator: setRadius
     *          modifies radius data field
     **********************************************************/
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**********************************************************
     * method: area
     *         returns area of shape
     **********************************************************/
    public double area() {
        return Math.PI * radius * radius;
    }

    /**********************************************************
     * method: perimeter
     *         returns perimeter of shape
     **********************************************************/
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**********************************************************
     * method: thisShape
     * 		   displays which Shape
     **********************************************************/
    public String thisShape() {
        return "Dot";
    }

    /******************************************************
     * method: toString
     * 		   displays parameters of Dot
     ******************************************************/
    public String toString() {
        return String.format("(%.1f)", radius);
    }

}
