package week02$gui.dot;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serial;

/******************************************************************
 * @author: A. Ford
 * This class shows an example of
 * 1. Inheritance
 * 2. Interfaces
 * 3. Event Driven Programming
 * CLASS DESCRIPTION
 * This class draws a dot at the location pressed
 * by mouse clicks.
 ******************************************************************/
public class ControlPanel extends JPanel implements MouseListener, MouseMotionListener{

    @Serial
    private static final long serialVersionUID = 1L;
    private Dot dot;
    Point point;

    //****************************************************
    //*	Sets up this Panel and Listener for mouse events.
    //* Panel listens for mouse events
    //****************************************************
    public ControlPanel() {
        setBackground(Color.LIGHT_GRAY);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    //****************************************************
    //*	Draws the current dot, if any
    //****************************************************
    public void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        if(dot != null) {
            dot.draw(pen);
        }
    }

    //****************************************************
    //*	Create new dot at the location, whenever the
    //* mouse button is pressed and repaints.
    //****************************************************
    public void mousePressed(MouseEvent event) {
        point = event.getPoint();
        dot = new Dot(point);
        repaint();
    }

    public void mouseDragged(MouseEvent event) {
        point = event.getPoint();
        dot.move(point);
        repaint();
    }

    //****************************************************
    //*	Provides empty definitions for the unused
    //* mouse methods of the Listener interface.
    //****************************************************
    public void mouseMoved(MouseEvent event) {}
    public void mouseEntered(MouseEvent event) {	}
    public void mouseExited(MouseEvent event) {}
    public void mouseClicked(MouseEvent event) {	}
    public void mouseReleased(MouseEvent event) {}

}
