package ui;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import logic.Checker;


/**
 * This class adds the Board JPanel and the Buttons JPanel.
 * @author Fabiana Arias y Fabian Alfaro
 *
 */
public class Grid extends JPanel{
	
	Board board;
	
	/**
	 * Constructor method
	 */
	public Grid() {

		this.board = new Board();
		this.add(this.board);

		
		Buttons appButtons = new Buttons(this);
		this.add(appButtons);


	}
	
	
	/**
	 * Method to assign the colors chosen by the player to the player's combination on line 1
	 * @param combinationPlayer The player's combination
	 */
	public void setLine1(Color[] combinationPlayer) {
		this.board.l1.p1.setBackground(combinationPlayer[0]);
		this.board.l1.p2.setBackground(combinationPlayer[1]);
		this.board.l1.p3.setBackground(combinationPlayer[2]);
		this.board.l1.p4.setBackground(combinationPlayer[3]);
	}
	
	/**
	 * Method to assign the colors chosen by the player to the player's combination on line 2
	 * @param combinationPlayer The player's combination
	 */
	public void setLine2(Color[] combinationPlayer) {
		this.board.l2.p1.setBackground(combinationPlayer[0]);
		this.board.l2.p2.setBackground(combinationPlayer[1]);
		this.board.l2.p3.setBackground(combinationPlayer[2]);
		this.board.l2.p4.setBackground(combinationPlayer[3]);
	}
	
	
	/**
	 * Method to assign the colors chosen by the player to the player's combination on line 3
	 * @param combinationPlayer The player's combination
	 */
	public void setLine3(Color[] combinationPlayer) {
		this.board.l3.p1.setBackground(combinationPlayer[0]);
		this.board.l3.p2.setBackground(combinationPlayer[1]);
		this.board.l3.p3.setBackground(combinationPlayer[2]);
		this.board.l3.p4.setBackground(combinationPlayer[3]);
	}

	
	/**
	 * Method to assign the colors chosen by the player to the player's combination on line 4
	 * @param combinationPlayer The player's combination
	 */
	public void setLine4(Color[] combinationPlayer) {
		this.board.l4.p1.setBackground(combinationPlayer[0]);
		this.board.l4.p2.setBackground(combinationPlayer[1]);
		this.board.l4.p3.setBackground(combinationPlayer[2]);
		this.board.l4.p4.setBackground(combinationPlayer[3]);
	}
	
	
	/**
	 * Method to assign the colors chosen by the player to the player's combination on line 5
	 * @param combinationPlayer The player's combination
	 */
	public void setLine5(Color[] combinationPlayer) {
		this.board.l5.p1.setBackground(combinationPlayer[0]);
		this.board.l5.p2.setBackground(combinationPlayer[1]);
		this.board.l5.p3.setBackground(combinationPlayer[2]);
		this.board.l5.p4.setBackground(combinationPlayer[3]);
	}
	
	
	/**
	 * Method to assign the colors chosen by the player to the player's combination on line 6
	 * @param combinationPlayer The player's combination
	 */
	public void setLine6(Color[] combinationPlayer) {
		this.board.l6.p1.setBackground(combinationPlayer[0]);
		this.board.l6.p2.setBackground(combinationPlayer[1]);
		this.board.l6.p3.setBackground(combinationPlayer[2]);
		this.board.l6.p4.setBackground(combinationPlayer[3]);
	}
	
	
	/**
	 * Method to assign the colors chosen by the player to the player's combination on line 7
	 * @param combinationPlayer The player's combination
	 */
	public void setLine7(Color[] combinationPlayer) {
		this.board.l7.p1.setBackground(combinationPlayer[0]);
		this.board.l7.p2.setBackground(combinationPlayer[1]);
		this.board.l7.p3.setBackground(combinationPlayer[2]);
		this.board.l7.p4.setBackground(combinationPlayer[3]);
	}
	
	
	/**
	 * Method to assign the colors chosen by the player to the player's combination on line 8
	 * @param combinationPlayer The player's combination
	 */
	public void setLine8(Color[] combinationPlayer) {
		this.board.l8.p1.setBackground(combinationPlayer[0]);
		this.board.l8.p2.setBackground(combinationPlayer[1]);
		this.board.l8.p3.setBackground(combinationPlayer[2]);
		this.board.l8.p4.setBackground(combinationPlayer[3]);
	}
	
	
	/**
	 * Method to assign the colors chosen by the player to the player's combination on line 9
	 * @param combinationPlayer The player's combination
	 */
	public void setLine9(Color[] combinationPlayer) {
		this.board.l9.p1.setBackground(combinationPlayer[0]);
		this.board.l9.p2.setBackground(combinationPlayer[1]);
		this.board.l9.p3.setBackground(combinationPlayer[2]);
		this.board.l9.p4.setBackground(combinationPlayer[3]);
	}
	
	
	/**
	 * Method to assign the colors chosen by the player to the player's combination on line 10
	 * @param combinationPlayer The player's combination
	 */
	public void setLine10(Color[] combinationPlayer) {
		this.board.l10.p1.setBackground(combinationPlayer[0]);
		this.board.l10.p2.setBackground(combinationPlayer[1]);
		this.board.l10.p3.setBackground(combinationPlayer[2]);
		this.board.l10.p4.setBackground(combinationPlayer[3]);
	}
	
	
}
