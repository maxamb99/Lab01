package week02$gui.ball;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.io.Serial;

/******************************************************************
 * {@code @author:} A. Ford
 * This class shows an example of
 * 1. Inheritance
 * 2. Interfaces
 * 3. Event Driven Programming
 * CLASS DESCRIPTION
 * This class uses signal detection (listener) and responses to
 * animate graphics on a display screen.
 ******************************************************************/
public class ControlPanel extends JPanel implements ActionListener, MouseListener, KeyListener{

    @Serial
    private static final long serialVersionUID = 1L;

    private final Timer timer;
    private final double delta = 2.0;
    private double x  = 0,  y = 0;
    private double dx = delta, dy = delta;
    private final double radius = 40.0;

    public ControlPanel() {

        int delay = 5;
        timer = new Timer(delay, this);
        addMouseListener(this);
        addKeyListener(this);
        setBackground(Color.LIGHT_GRAY);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer.start( );
    }

    public void paintComponent(Graphics _graphics){

        super.paintComponent(_graphics);
        Graphics2D pen = (Graphics2D) _graphics;

        pen.setColor(Color.BLUE);
        Ellipse2D ball = new Ellipse2D.Double(x, y, radius, radius);
        pen.fill(ball);

    }

    public void actionPerformed(ActionEvent event){
        move();
        repaint();

    }

    //****************************************************
    //*	Check the boundaries of the display
    //****************************************************		

    public void move() {

        if (x < 0 || x > Viewer.WIDTH - radius){
            dx = - dx;	//change the ball direction
        }

        if (y < 0 || y > Viewer.HEIGHT - 3 *  radius / 2){
            dy = - dy;	//change the ball direction
        }

        //advance the ball position
        x += dx;
        y += dy;
    }

    //****************************************************
    //*	Stops Timer when mouse is pressed
    //****************************************************
    public void mousePressed(MouseEvent event) {
        timer.stop();
    }

    //****************************************************
    //*	Resumes Timer when mouse is released
    //****************************************************
    public void mouseReleased(MouseEvent event) {
        timer.restart();
    }

    //****************************************************
    //*	Provides empty definitions for the unused
    //* mouse methods of the Listener interface.
    //****************************************************
    public void mouseEntered(MouseEvent event) {	}
    public void mouseExited(MouseEvent event) {}
    public void mouseClicked(MouseEvent event) {	}

    //****************************************************
    //*	Moves the ball whenever a keyboard button press
    //  is detected, returns a response and repaints.
    //****************************************************

    public void keyPressed(KeyEvent event){

        int keyPress = event.getKeyCode();

        if (keyPress == KeyEvent.VK_UP){
            up();
        }else if (keyPress == KeyEvent.VK_DOWN){
            down();
        }else if (keyPress == KeyEvent.VK_LEFT){
            left();
        }else if (keyPress == KeyEvent.VK_RIGHT){
            right();
        }else if (keyPress == KeyEvent.VK_TAB){
            increase();
        }else if (keyPress == KeyEvent.VK_SHIFT){
            decrease();
        }else if (keyPress == KeyEvent.VK_SPACE){
            plane();
        }
        repaint();
    }

    public void up(){
        dx = 0;
        dy = -delta;
    }

    public void down(){
        dx = 0;
        dy = delta;
    }

    public void left(){
        dx = -delta;
        dy = 0;
    }

    public void right(){
        dx = delta;
        dy = 0;
    }

    public void increase() {
        dx *= 2;
        dy *= 2;
    }

    public void decrease() {
        dx /= 2;
        dy /= 2;
    }

    public void plane() {
        dx = delta;
        dy = delta;
    }

    /*****************************************************
     * Provides empty definitions for the unused
     * key methods of the Listener interface.
     * ***************************************************/

    public void keyTyped(KeyEvent event){}

    public void keyReleased(KeyEvent event){}


}
