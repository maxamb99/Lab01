package junits;

import coordinates.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PointJUnitTest {

    //TEST: Two Point objects
    Point p1;
    Point p2;

    /*****************************************************
     * Test method for {@link coordinates.Point#Point()}.
     *****************************************************/
    @Test
    void testPoint() {
        System.out.println();
        System.out.println("==== T E S T   D E F A U L T   C O N S T R U C T O R ====");

        //TEST: empty reference
        assertNull(p1);

        //ASSIGN: test Point object
        p1 = new Point(1, 1);

        //TEST: constructor Point()
        assertEquals(1, p1.getX());
        assertEquals(1, p1.getY());

        //CHECK: contents of Point object
        System.out.println("test p1 at origin: " + p1);
        System.out.println("===========================================================");
    }

    /*********************************************************************
     * Test method for {@link coordinates.Point#Point(coordinates.Point)}.
     *********************************************************************/
    @Test
    void testPointPoint() {
        System.out.println();
        System.out.println("======== T E S T   C O N S T R U C T O R (Point) =========");

        //TEST: empty reference
        assertNull(p1);

        //ASSIGN: test Point object(s)
        p2 = new Point(2, 5);
        p1 = new Point(p2);

        //TEST: constructor Point(Point)
        assertEquals(2, p1.getX());
        assertEquals(5, p1.getY());

        //CHECK: contents of Point object
        System.out.println("point: " +  p2);
        System.out.println("copy:  " +  p1);
        System.out.println("SUCCESS: @END");
        System.out.println("===========================================================");
    }

    /*************************************************************
     * Test method for {@link coordinates.Point#Point(int, int)}.
     *************************************************************/
    @Test
    void testPointIntInt() {
        System.out.println();
        System.out.println("======= T E S T   C O N S T R U C T O R (int, int) ========");

        //TEST: empty reference
        assertNull(p1);

        //ASSIGN: test Point object
        p1 = new Point(1, 4);

        //TEST: constructor Point(x, y)
        assertEquals(1, p1.getX());
        assertEquals(4, p1.getY());

        //CHECK: contents of Point object
        System.out.println("point (x,y): " + p1);
        System.out.println("SUCCESS: @END");
        System.out.println("===========================================================");
    }

    /************************************************************************
     * Test method for {@link coordinates.Point#distanceFrom(int, int)}.
     ************************************************************************/
    @Test
    void testDistanceFromOrigin() {
        System.out.println();
        System.out.println("==== T E S T   D I S T A N C E   F R O M   O R I G I N ====");

        //TEST: empty reference
        assertNull(p1);

        //ASSIGN: test Point object
        p1 = new Point(3, 4);
        p2 = new Point(5, 12);

        double distFromOrig1 = p1.distanceFrom(0,0);
        double distFromOrig2 = p2.distanceFrom(0,0);

        //TEST: constructor Point(x, y)
        assertEquals(5.0 , distFromOrig1);
        assertEquals(13.0, distFromOrig2);

        //CHECK: contents of Point objects
        System.out.println("distance from Origin 1: " + distFromOrig1);
        System.out.println("distance from Origin 2: " + distFromOrig2);
        System.out.println("SUCCESS: @END");
        System.out.println("===========================================================");
    }


    /************************************************************************
     * Test method for {@link coordinates.Point#distanceFrom(Point)}.
     ************************************************************************/
    @Test
    void testDistanceFrom() {
        System.out.println();
        System.out.println("========= T E S T    D I S T A N C E    F R O M ===========");

        //TEST: empty reference
        assertNull(p1);

        //ASSIGN: test Point object
        p1 = new Point(1, 2);
        p2 = new Point(4, 6);


        //TEST: constructor Point(x, y)
        assertEquals(5.0 , p2.distanceFrom(p1));
        assertEquals(5.0 , p1.distanceFrom(p2));

        //CHECK: contents of Point objects
        System.out.println("distance : " + p2.distanceFrom(p1));
        System.out.println("distance : " + p1.distanceFrom(p2));
        System.out.println("SUCCESS: @END");
        System.out.println("===========================================================");
    }

    /********************************************************
     * Test method for {@link coordinates.Point#equals(Object)}.
     ********************************************************/
    @Test
    void testEquals() {

        System.out.println();
        System.out.println("================== T E S T    E Q U A L S =================");

        //TEST: empty reference(s)
        assertNull(p1);
        assertNull(p2);

        //ASSIGN: test Point object
        p1          = new Point(3, 8);
        p2          = new Point(2, 5);
        Point other = new Point(3, 8);

        //TEST: equals method
        assertEquals(p1, other);
        assertNotEquals(p1, p2);

        //CHECK: contents of Point object
        System.out.println("test Point 1:     " + p1);
        System.out.println("test Point 2:     " + p2);
        System.out.println("test Point other: " + other);
        System.out.println("SUCCESS: @END");
        System.out.println("===========================================================");
    }

    /********************************************************
     * Test method for {@link coordinates.Point#getX()}.
     ********************************************************/
    @Test
    void testGetX() {
        System.out.println();
        System.out.println("==================== T E S T    G E T  X ==================");

        //TEST: empty reference
        assertNull(p1);

        //ASSIGN: test Point object
        p1 = new Point(6, 0);

        //TEST: getX method
        assertEquals(6, p1.getX());

        //CHECK: contents of Point object
        System.out.println("test getX: " + p1);
        System.out.println("SUCCESS: @END");
        System.out.println("===========================================================");
    }

    /********************************************************
     * Test method for {@link coordinates.Point#getY()}.
     ********************************************************/
    @Test
    void testGetY() {
        System.out.println();
        System.out.println("==================== T E S T    G E T  Y ==================");

        //TEST: empty reference
        assertNull(p1);

        //ASSIGN: test Point object
        p1 = new Point(0, 6);

        //TEST: getY method     -> assertEquals(expected, actual)
        assertEquals(6, p1.getY());

        //CHECK: contents of Point object
        System.out.println("test getY: " + p1);
        System.out.println("SUCCESS: @END");
        System.out.println("===========================================================");
    }


    /******************************************************************
     * Test method for {@link coordinates.Point#move(int, int)}.
     ******************************************************************/
    @Test
    void testMove() {
        System.out.println();
        System.out.println("=============== T E S T   M O V E =================");

        //TEST: empty reference
        assertNull(p1);

        //ASSIGN: test Point object
        p1 = new Point();
        System.out.println("\tvalue before:          " + p1);

        //MODIFY: Point object
        p1.setLocation(2, 3);
        System.out.println("\tvalue after set:       " + p1);
        p1.move(4, 1);

        //TEST: move method
        assertEquals(6, p1.getX());
        assertEquals(4, p1.getY());

        //CHECK: contents of Point object
        System.out.println("\tvalue after move: " + p1);
        System.out.println("===================================================");
    }
    
    /********************************************************************
     * Test method for {@link coordinates.Point#setLocation(int, int)}.
     *******************************************************************/
    @Test
    void testSetLocationIntInt() {
        System.out.println();
        System.out.println("============= T E S T  S E T  L O C A T I O N ===============");


        //TEST: empty reference
        assertNull(p1);

        //ASSIGN: test Point object
        p1 = new Point();
        System.out.println("\tvalue before:  " + p1);

        //MODIFY: Point object
        p1.setLocation(4, 9);

        //TEST: setLocation method
        assertEquals(4, p1.getX());
        assertEquals(9, p1.getY());

        //CHECK: contents of Point object
        System.out.println("\tvalue after:   " + p1);
        System.out.println("=============================================================");
    }


    /***********************************************************
     * Test method for Exceptions.
     ***********************************************************/
    @Test
    void testSlope() {
        System.out.println();
        System.out.println("================== T E S T    S L O P E ====================");


        //TEST: empty reference
        assertNull(p1);

        //ASSIGN: test Point object
        p1 = new Point(1, 1);
        p2 = new Point(4, 5);

        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();

        double result = dy / dx;

        assertEquals(result, p2.slope(p1));

        //TEST: failure of precondition exception
        p1 = new Point(0, 1);
        p2 = new Point(0, 5);

        assertThrows(IllegalArgumentException.class, () -> p2.slope(p1));
        System.out.println("SUCCESS: @END");
        System.out.println("============================================================");
    }


    /********************************************************
     * Test method for {@link coordinates.Point#toString()}.
     ********************************************************/
    @Test
    void testToString() {
        System.out.println("=============== T E S T   TO   S T R I N G =================");

        //TEST: empty reference
        assertNull(p1);

        p1 = new Point(5, 3);

        //TEST: toString method
        assertEquals(5, p1.getX());
        assertEquals(3, p1.getY());

        //CHECK: contents of Point object
        System.out.println("\ttest toString: " + p1);
        System.out.println("SUCCESS: @END");
        System.out.println("============================================================");
    }

}
