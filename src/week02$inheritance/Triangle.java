package week02$inheritance;

/******************************************************************
 * {@code @author:} A. Ford
 * This is an example of inheritance and OOP(module-02).
 * Triangle is a subclass of Shape.
 * CLASS DESCRIPTION
 * This class is an extension of the Shape class and describes
 * and stores the dimensions of a Triangle shape.
 ******************************************************************/
public class Triangle extends Shape{

    /******************************************************
     * State: data fields
     *        initialize data fields 
     ******************************************************/
    public double a;
    public double b;
    public double c;

    /******************************************************
     * Constructor: Triangle
     *              data fields are initialized.
     * ****************************************************/
    public Triangle() {
        this(1, 1, 1);
    }

    /******************************************************
     * Constructor: Triangle(Triangle)
     *              data fields are initialized.
     * ****************************************************/
    public Triangle(Triangle other) {
        this(other.a, other.b, other.c);
    }

    /******************************************************
     * Constructor: Triangle(double, double, double)
     *              data fields are initialized.
     * ****************************************************/
    public Triangle(double a , double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /*******************************************************
     * method: area
     *         returns area of shape
     *******************************************************/
    public double area() {
        double s = (a + b + c) / 2;
        if( (s - a) == 0 || (s - b) == 0 || (s - c) == 0 ) {
            System.out.println("Cannot handle this operation");
            return -1;
        }else
            return Math.sqrt( (s- a) * (s-b) * (s-c) );
    }

    /******************************************************
     * method: perimeter
     *         returns perimeter of shape
     ******************************************************/
    public double perimeter() {
        return a + b + c;
    }

    /**********************************************************
     * method: thisShape
     * 		   displays which Shape
     **********************************************************/
    public String thisShape() {
        return "Triangle";
    }

    /******************************************************
     * method: toString
     * 		   displays parameters of Triangle
     ******************************************************/
    public String toString() {
        return String.format("(%.1f, %.1f, %.1f)", a, b, c);
    }
}
