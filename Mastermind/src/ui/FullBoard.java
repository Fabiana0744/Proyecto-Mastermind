package ui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import logic.SecretCombination;


/**
 * This class creates the main JFrame
 * @author Fabiana Arias y Fabian Alfaro
 *
 */
public class FullBoard {
	
	/**
	 * Method that runs the application
	 * @param args Program arguments
	 */
	public static void main(String[] args) {
		JFrame appFrame = new JFrame("Mastermind");
		appFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Grid appGrid = new Grid();
		appFrame.add(appGrid);
		
		appFrame.setSize(new Dimension(400,750));
		appFrame.setPreferredSize(new Dimension(400,750));
		appFrame.setResizable(false);
		appFrame.pack();
		appFrame.setVisible(true);
		
	}
}
