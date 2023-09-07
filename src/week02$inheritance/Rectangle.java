package week02$inheritance;
/******************************************************************
 * {@code @author:} A. Ford
 * CODE EXAMPLE
 * This is an example of inheritance and OOP.
 * Rectangle is a subclass of Shape.
 * CLASS DESCRIPTION
 * This class is an extension of the Shape class and describes
 * and stores the dimensions of a Rectangle shape.
 ******************************************************************/

public class Rectangle extends Shape{
    /************************************************************
     * State: data fields
     *        initialize data fields 
     ************************************************************/
    private double height;
    private double width;

    /************************************************************
     * Constructor: Rectangle
     *              data fields are initialized.
     * **********************************************************/
    public Rectangle() {
        this(1.0, 1.0);
    }

    /*************************************************************
     * Constructor: Rectangle(Rectangle) 
     *              data fields are initialized.
     * ***********************************************************/
    public Rectangle(Rectangle r) {
        this(r.width, r.height);
    }

    /*************************************************************
     * Constructor: Rectangle(double, double) 
     *              data fields are initialized.
     * ***********************************************************/
    public Rectangle(double width, double height) {
        this.height = height;
        this.width  = width;
    }

    /**********************************************************
     * acessor: getHeight
     *          accesses height field
     **********************************************************/
    public double getHeight() {
        return height;
    }

    /***********************************************************
     * accessor: getWidth
     *           accesses width field
     **********************************************************/
    public double getWidth() {
        return width;
    }

    /**********************************************************
     * mutator: setFields
     *          modifies object's data fields
     **********************************************************/
    public void setFields(double width, double height) {
        this.height = height;
        this.width  = width;
    }

    /**********************************************************
     * mutator: setHeight
     *          modifies height data field
     **********************************************************/
    public void setHeight(double height) {
        this.height = height;
    }

    /**********************************************************
     * mutator:setWidth
     * 		   modifies width data field
     **********************************************************/
    public void setWidth(double width) {
        this.width = width;
    }

    /**********************************************************
     * method: area
     *         returns area of shape
     **********************************************************/
    public double area() {
        return width * height;
    }

    /**********************************************************
     * method: perimeter
     *         returns perimeter of shape
     **********************************************************/
    public double perimeter() {
        return 2 * (width + height);
    }

    /**********************************************************
     * method: thisShape
     * 		   displays which Shape
     **********************************************************/
    public String thisShape() {
        return "Rectangle";
    }

    /******************************************************
     * method: toString
     * 		   displays parameters of Rectangle
     ******************************************************/
    public String toString() {
        return String.format("(%.1f, %.1f)", width, height);
    }
}
