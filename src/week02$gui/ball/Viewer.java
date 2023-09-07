package week02$gui.ball;

import javax.swing.JFrame;

/******************************************************************
 * @author: A. Ford
 * This class creates a display frame for Control Panel graphics.
 ******************************************************************/
public class Viewer {

    //****************************************************
    //*	Creates and displays the display frame
    //****************************************************
    public static final int WIDTH  = 600;
    public static final int HEIGHT = 400;
    public static final int LEFT_X = 750;
    public static final int TOP_Y  = 100;

    public static void main(String[] args) {
        ControlPanel panel = new ControlPanel();
        JFrame frame = new JFrame("Ball Viewer");
        frame.add(panel);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocation(LEFT_X, TOP_Y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
