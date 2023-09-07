package week02$gui.circles;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

//****************************************************
//* ButtonDisplay.java
//*
//*	Demonstrates mouse events and drawing on a panel
//****************************************************
public class Viewer {

	//****************************************************
	//*	Creates and displays the display frame
	//****************************************************
	private static final int WIDTH  = 600;
	private static final int HEIGHT = 400;
	private static final int LEFT_X = 750;
	private static final int TOP_Y  = 100;
	
	public Viewer() {
		
		ControlPanel panel = new ControlPanel();
		JFrame frame  = new JFrame("Drag Viewer");
		frame.add(panel);
		
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(LEFT_X, TOP_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(Viewer::new);
	}
}
