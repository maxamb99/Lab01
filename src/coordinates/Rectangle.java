package coordinates;

/******************************************************************
 * These comments represent an example of JavaDoc Comments
 * in the way your instructor likes to write them.
 * DESCRIPTION
 * This class describes a point representing a location (x, y) in
 * coordinate space, specified to double floating point precision.
 ******************************************************************/

public class Rectangle implements Comparable<Rectangle> {
    double height;
    double width;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width  = width;
    }

    public double area() {
        return width * height;
    }


    //TODO: Use this method to Compare Areas
    public static int compareAreas(Rectangle r1, Rectangle r2) {
        return Double.compare(r1.area(), r2.area());
    }


    //TODO: Use this method to Compare Perimeters
    public static int comparePerimeters(Rectangle r1, Rectangle r2) {
        return Double.compare(r1.perimeter(), r2.perimeter());
    }


    public int compareTo(Rectangle other) {
        if(width != other.width)
            return Double.compare(width, other.width);
        else
            return Double.compare(height, other.height);
    }


    public boolean equals(Object obj) {
        if(obj instanceof Rectangle other)
            return width == other.width && height == other.height;
        else
            return false;
    }

    public double perimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public String toString() {
        return String.format("[%.2f, %.2f]", width, height);
    }

}
