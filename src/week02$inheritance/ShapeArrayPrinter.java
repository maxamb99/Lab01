package week02$inheritance;

import java.text.DecimalFormat;

public class ShapeArrayPrinter {
    /******************************************************
     * method: task
     * 		   prints out the behaviors of shape 
     ******************************************************/
    public static void task(Shape[] shape) {

        for(int i = 0; i < shape.length; i++) {
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("--------" + shape[i].thisShape() +"-------- " );
            System.out.println("Coordinate X: " + shape[i].getX() );
            System.out.println("Coordinate Y: " + shape[i].getY() );
            System.out.println("Parameters: "   + shape[i].toString() );
            System.out.println("Area: "         + df.format(shape[i].area()) );
            System.out.println("Perimeter: "    + df.format(shape[i].perimeter()) );

            if (shape[i] instanceof Circle) {
                System.out.println("Radius: " + ((Circle)shape[i]).getRadius() );
            }
            System.out.println();
        }
    }

    /******************************************************
     * method: equalArea
     * 		   checks if the areas of two geometrical examples.animate.shapes
     * 		   are equal to two decimal places
     ******************************************************/
    public static void main(String[] args) {

        Shape[] shape = {  new Circle(5.0),
                           new Rectangle(8.0, 4.0),
                           new Triangle(1.0, Math.sqrt(3.0), 2.0)
                        };
        task(shape);
    }
}
