package week02$algorithms;

import coordinates.Point;
import coordinates.Rectangle;

import java.util.ArrayList;
import java.util.List;

/*******************************************************************************
 * This Test shows results of comparing Point and Rectangle objects
 * using algorithms from TModule.
 *******************************************************************************/

public class CompareTest {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t \t  C O M P A R I N G    O B J E C T S  ");
        System.out.println(" \t \t      T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
        System.out.println();
    }


    public static void comparePoints(){
        System.out.println();
        System.out.println("========   C O M P A R E    L O C A T I O N S   ========");
        System.out.println();
        List<Point> list = new ArrayList<Point>();
        list.add(new Point(6, 5));
        list.add(new Point(8, 6));
        list.add(new Point(3, 7));
        list.add(new Point(7, 9));
        list.add(new Point(2, 5));
        list.add(new Point(5, 4));
        list.add(new Point(5, 6));
        list.add(new Point(1, 8));
        list.add(new Point(7, 5));
        list.add(new Point(4, 8));

        System.out.println("============= B E F O R E    S O R T I N G ===========");
        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + ": " + list.get(i));
        }
        System.out.println();

        System.out.println("========== N A T U R A L   O R D E R I N G ===========");
//        quickSort(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + " : " + list.get(i));
        }

    }


    /**********************************************************************
     * Test to compare the rectangles using Comparable ordering rules
     **********************************************************************/
    public static void compareRectangles(){
        System.out.println();
        System.out.println("========   C O M P A R E    D I M E N S I O N S   =========");
        System.out.println();
        List<Rectangle> list = new ArrayList<Rectangle>();
        list.add(new Rectangle(7, 9));
        list.add(new Rectangle(5, 4));
        list.add(new Rectangle(8, 6));
        list.add(new Rectangle(3, 7));
        list.add(new Rectangle(1, 8));
        list.add(new Rectangle(6, 5));
        list.add(new Rectangle(4, 8));
        list.add(new Rectangle(7, 5));
        list.add(new Rectangle(2, 5));
        list.add(new Rectangle(5, 9));

        System.out.println("============= B E F O R E    S O R T I N G ===========");
        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + ": " + list.get(i));
        }

        System.out.println();
        System.out.println("============= N A T U R A L   O R D E R I N G =============");
//        quickSort(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + " : " + list.get(i));
        }

    }


    /**************************************************************************
     * Test to compare the rectangles using Area Comparator ordering rules
     **************************************************************************/
    public static void compareRectangleAreas(){
        System.out.println();
        System.out.println("========  A R E A    C O M P A R A T O R  =========");
        System.out.println();
        List<Rectangle> list = new ArrayList<Rectangle>();
        list.add(new Rectangle(7, 9));
        list.add(new Rectangle(5, 4));
        list.add(new Rectangle(8, 6));
        list.add(new Rectangle(3, 7));
        list.add(new Rectangle(1, 8));
        list.add(new Rectangle(6, 5));
        list.add(new Rectangle(4, 8));
        list.add(new Rectangle(7, 5));
        list.add(new Rectangle(2, 5));
        list.add(new Rectangle(5, 9));

        System.out.println("============= B E F O R E    S O R T I N G ===========");
        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + ": " + list.get(i));
        }

        System.out.println();
        System.out.println("============= O R D E R   B Y   A R E A  =============");
//        sort(list, Rectangle::compareAreas);

        for (Rectangle rectangle : list) {
            System.out.println(rectangle + ": " + rectangle.area());
        }

    }


    /****************************************************************************
     * Test to compare the rectangles using Perimeter Comparator ordering rules
     ****************************************************************************/
    public static void compareRectanglePerimeters(){
        System.out.println();
        System.out.println("========  P E R I M E T E R    C O M P A R A T O R  =========");
        System.out.println();
        List<Rectangle> list = new ArrayList<Rectangle>();
        list.add(new Rectangle(7, 9));
        list.add(new Rectangle(5, 4));
        list.add(new Rectangle(8, 6));
        list.add(new Rectangle(3, 7));
        list.add(new Rectangle(1, 8));
        list.add(new Rectangle(6, 5));
        list.add(new Rectangle(4, 8));
        list.add(new Rectangle(7, 5));
        list.add(new Rectangle(2, 5));
        list.add(new Rectangle(5, 9));

        System.out.println("============= B E F O R E    S O R T I N G ===========");
        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + ": " + list.get(i));
        }


        System.out.println();
        System.out.println("============= O R D E R   B Y   P E R I M E T E R  =============");
//        sort(list, Rectangle::comparePerimeters);

        for (Rectangle rectangle : list) {
            System.out.println(rectangle + ": " + rectangle.perimeter());
        }
    }

    public static void main(String[] args) {
        intro();
        comparePoints();
        compareRectangles();
        compareRectangleAreas();
        compareRectanglePerimeters();
    }
}
