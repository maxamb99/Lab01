package week02$gui.circles;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serial;

public class ControlPanel extends JPanel implements MouseListener,MouseMotionListener{
	
	@Serial
	private static final long serialVersionUID = 1L;
	
	// add mouse detection (listeners)
	public ControlPanel() {
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	// draws a black circle when mouse dragged.
	public void mouseDragged(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		
		Graphics pen = getGraphics();
		pen.setColor(Color.BLACK);
		pen.drawOval(x, y, 50, 50);
		
	}
	
	// draws a red circle when mouse moves. 
	public void mouseMoved(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		
		Graphics pen = getGraphics();
		pen.setColor(Color.RED);
		pen.drawOval(x, y, 50, 50);
	}
	

	// draws a yellow 100 x 100 pixel square when mouse pressed 
	public void mousePressed(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		
		Graphics pen = getGraphics();
		pen.setColor(Color.YELLOW);
		pen.fillOval(x, y, 50, 50);
	}
	
	public void mouseEntered(MouseEvent event) {
		setBackground(Color.WHITE);
	}
	

	public void mouseExited(MouseEvent event) {
		setBackground(Color.CYAN);
	}
	
	// unused interface methods
	public void mouseClicked(MouseEvent event) {}
	public void mouseReleased(MouseEvent event) {}
	
}
