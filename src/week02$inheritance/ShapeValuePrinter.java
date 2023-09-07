package week02$inheritance;

import java.text.DecimalFormat;

public class ShapeValuePrinter {

    /******************************************************
     * method: task
     * 		   prints out the behaviors of shape 
     ******************************************************/
    public static void task(Shape shape) {

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("--------" + shape.thisShape() +"-------- " );
        System.out.println("Coordinate X: " + shape.getX() );
        System.out.println("Coordinate Y: " + shape.getY() );
        System.out.println("Parameters: "   + shape);
        System.out.println("Area: "         + df.format(shape.area()) );
        System.out.println("Perimeter: "    + df.format(shape.perimeter()) );

        if (shape instanceof Circle) {
            System.out.println("Radius: " + ((Circle)shape).getRadius() );
        }
        System.out.println();
    }

    /******************************************************
     * method: equalArea
     * 		   checks if the areas of two geometrical examples.animate.shapes
     * 		   are equal to two decimal places
     ******************************************************/
    private static String equalArea(Shape s1, Shape s2) {
        DecimalFormat df = new DecimalFormat("0.00");

        if (Math.abs(s1.area() - s2.area()) <= 0.01 ) {
            return "area 1: "  + df.format(s1.area()) + "\n"  +
                   "area 2: "  + df.format(s2.area()) + "\n"  +
                   "Equal Areas";

        }else {
            return "area 1: "  + df.format(s1.area()) + "\n"  +
                   "area 2: "  + df.format(s2.area()) + "\n"  +
                   "Areas NOT Equal";
        }
    }

    /******************************************************
     * method: main
     * 		   runs the program
     ******************************************************/
    public static void main(String[] args) {

        //---------------- modular design -----------------
        Shape shape = new Circle(5.0);
        task(shape);

        shape = new Rectangle(8.0, 4.0);
        task(shape);

        shape = new Triangle(1.0, Math.sqrt(3.0), 2.0);
        task(shape);

        //----------------- equal areas --------------------
        Circle    circle    = new Circle(3.7415);
        Rectangle rectangle = new Rectangle(1.0, 43.98);
        System.out.println( equalArea(circle, rectangle) );
    }
}
