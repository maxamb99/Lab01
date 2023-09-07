package week02$gui.dot;

import javax.swing.JFrame;

/******************************************************************
 * @author: A. Ford
 * This class creates a display frame for Control Panel graphics.
 ******************************************************************/
public class Viewer {

    //****************************************************
    //*	Creates and displays the display frame
    //****************************************************
    private static final int WIDTH  = 600;
    private static final int HEIGHT = 400;
    private static final int LEFT_X = 750;
    private static final int TOP_Y  = 100;

    public static void main(String[] args) {
        ControlPanel panel = new ControlPanel();
        JFrame frame  = new JFrame("Dot Viewer");
        frame.add(panel);

        frame.setSize(WIDTH, HEIGHT);
        frame.setLocation(LEFT_X, TOP_Y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
