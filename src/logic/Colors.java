package logic;

import java.awt.Color;

/**
 * This class contains the list of default colors
 * @author Fabiana Arias y Fabian Alfaro
 *
 */
public class Colors {
	
	private static final Color[] colors = { Color.MAGENTA, Color.YELLOW, Color.ORANGE, Color.BLUE, Color.GREEN };
	
	private int numberOfColors = colors.length;
	
	/**
	 * Constructor method
	 */
	public Colors() {}
	
	/**
	 * Method that returns the list of default colors
	 * @return List of default colors
	 */
	public Color[] getColors() {
		return this.colors;
	}
}
