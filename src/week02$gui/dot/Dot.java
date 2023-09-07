package week02$gui.dot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
/******************************************************************
 * @author: A. Ford
 * CLASS DESCRIPTION
 * This class contains the graphics to draw a green solid circle.
 ******************************************************************/
public class Dot {

    private int centerX, centerY;
    private final int radius;
    private final Color color;

    //****************************************************
    //*	Creates a circle at location (x, y)
    //****************************************************
    public Dot(Point p) {
        radius = 25;
        color = new Color(0, 125, 50);
        centerX = p.x;
        centerY = p.y;
    }

    //****************************************************
    //*	Draws a circle with the Graphics object "pen"
    //****************************************************
    public void draw(Graphics pen) {
        int x = centerX - radius;
        int y = centerY - radius;
        pen.setColor(color);
        pen.fillOval( x,  y, 2 * radius, 2 * radius);
    }

    public void move(Point p) {
        centerX = p.x;
        centerY = p.y;
    }

}
