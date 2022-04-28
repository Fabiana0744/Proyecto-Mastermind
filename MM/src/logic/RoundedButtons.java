package logic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;

/**
 * This class allows to make circular buttons
 * @author Fabiana Arias y Fabian Alfaro
 *
 */
public class RoundedButtons extends JButton{
	
	/**
	 * Constructor method
	 */
	public  RoundedButtons() {
	    Dimension size = getPreferredSize();
	    size.width = size.height = Math.max(size.width,size.height);
	    setPreferredSize(size);
	    setContentAreaFilled(false);
	  }

	/**
	 * Method to make it circular
	 */
	protected void paintComponent(Graphics g) {
		if (getModel().isArmed()) {
			g.setColor(Color.lightGray);
		} else {
		    g.setColor(getBackground());
		}
		g.fillOval(0, 0, getSize().width-1,getSize().height-1);
		super.paintComponent(g);
	}

	/**
	 * Method to modify the border
	 */
	protected void paintBorder(Graphics g) {
	    g.setColor(getForeground());
	    g.drawOval(0, 0, getSize().width-1,     getSize().height-1);
	  }

	  Shape shape;
	  
	  /**
	   * Method to define the size
	   */
	  public boolean contains(int x, int y) {
	    if (shape == null || 
	      !shape.getBounds().equals(getBounds())) {
	      shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
	    }
	    return shape.contains(x, y);
	  }
}
