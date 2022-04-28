package logic;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import ui.Buttons;

/**
 * This class generates the player's color combination.
 * @author Fabiana Arias y Fabian Alfaro
 *
 */
public class PlayerCombination{	
	
	private int count = 0;
	
	private Color[] playerCombination = {Color.white, Color.white, Color.white, Color.white};
	
	private int combinationLength = 4;
	
	Colors colors = new Colors();
	
	
	/**
	 * Constructor method
	 */
	public PlayerCombination() {}
	
	
	/**
	 * Method used to count clicks on the button that uses it
	 * @return count Number of clicks
	 */
	public int countClick() {
		count ++;		
		return count;
	}
	
	
	/**
	 * Method to assign the colors in the button each time it is pressed
	 * @return The color of the chosen button
	 */
	public Color assignColor() {
		Color[] colorsList = colors.getColors();
		int click = this.countClick();
		
		if(click == 1) {
			return colorsList[0];
		}
		if(click == 2) {
			return colorsList[1];
		}
		if(click == 3) {
			return colorsList[2];
		}
		if(click == 4) {
			return colorsList[3];
		}
		/*
		if(click == 5) {
			return colorsList[4];
		}
		
		if(click == 6) {
			return colorsList[5];
		}
		*/
		this.count = 0;
		return colorsList[4];
	}

	
	/**
	 * Method to assign the chosen color for the player to a list
	 * @param btn1 Color of the button1
	 * @param btn2 Color of the button2
	 * @param btn3 Color of the button3
	 * @param btn4 Color of the button4
	 */
	public void generatePlayerCombination(Color btn1, Color btn2, Color btn3, Color btn4) {
		this.playerCombination[0] = btn1;
		this.playerCombination[1] = btn2;
		this.playerCombination[2] = btn3;
		this.playerCombination[3] = btn4;
		//System.out.printf("%s  %s  %s  %s  ",playerCombination[0], playerCombination[1], playerCombination[2], playerCombination[3]);
		//System.out.println("");
	}
	
	
	/**
	 * Method that returns the list of the player's combination
	 * @return ArrayList of colors
	 */
	public Color[] getPlayerCombination() {
		//System.out.printf("%s  %s  %s  %s  ",playerCombination[0], playerCombination[1], playerCombination[2], playerCombination[3]);
		//System.out.println("");
		return this.playerCombination;
	}
}
