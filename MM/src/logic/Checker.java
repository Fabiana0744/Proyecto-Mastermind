package logic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

import ui.Buttons;
import ui.Grid;
import ui.Line;

/**
 * This class checks which colors are correct and which are not.
 * @author Fabiana Arias y Fabian Alfaro
 *
 */
public class Checker{

	
	private PlayerCombination pc = new PlayerCombination();
	
	private SecretCombination sc = new SecretCombination();
	
	private int correctPosAndColour = 0;
	 
	private int correctColourWrongPos = 0;
	 
	private boolean victory = false;
	 
	
	Grid grid;
	
	/**
	 * Constructor method
	 * @param appGrid
	 */
	public Checker(Grid appGrid) {
		this.grid = appGrid;
	}
	
	/**
	 * Method that modifies the value of the number of colors in the correct position
	 * @param pValue Value of number of colors in the correct position
	 */
	public void setcorrectPosAndColour(int pValue) {
        this.correctPosAndColour = pValue;
    }
	
	/**
	 * Method to get the number of correct colors
	 * @return number of correct colors
	 */
    public int getcorrectPosAndColour() {
        return this.correctPosAndColour;
    } 

    /**
	 * Method that modifies the value of the number of colors in the incorrect position
	 * @param pValue Value of number of colors in the incorrect position
	 */
    public void setcorrectColourWrongPos(int pValue) {
        this.correctColourWrongPos = pValue;
    }
    
    /**
	 * Method to get the number of correct colors
	 * @return number of correct colors
	 */
    public int getcorrectColourWrongPos() {
        return this.correctColourWrongPos;
    } 

    
    /**
     * Method to check which colors are in the correct position 
     * @param playerCombination Player combination color list
     * @param secretCombination Secret combination color list
     * @return number of correct colors
     */
	public int correctColorandPos(Color[] playerCombination, Color[] secretCombination) {
		
		this.setcorrectColourWrongPos(0);
		this.setcorrectPosAndColour(0);
		boolean encontre =false;
		System.out.println("playerCombination data" +playerCombination[0]+playerCombination[1]+playerCombination[2]+playerCombination[3] );
		System.out.println("secretCombination data " +secretCombination[0]+secretCombination[1]+secretCombination[2]+secretCombination[3] );
		
	for (int i = 0; i < playerCombination.length; i++) {
			encontre = false;
			//Verifica que esten en la misma posicion
			for (int a = 0; a < secretCombination.length; a++) {	
				//Verifica que esten en la misma posicion
				if (secretCombination[a] == playerCombination[i] && i == a){
					this.setcorrectPosAndColour(this.getcorrectPosAndColour()+1);
					encontre = false;
					break;
				}
				else if (secretCombination[a] == playerCombination[i]) {
					encontre = true;
				}
			}
			if (encontre) {
				this.setcorrectColourWrongPos(this.getcorrectColourWrongPos()+1);
			}
		}
		//System.out.println("Posicion correcta " +this.getcorrectPosAndColour() );
		//System.out.println("Posicion incorrecta " +this.getcorrectColourWrongPos() );
		return this.correctPosAndColour;
	}
	
	
	
	/**
     * Method to check which colors are in the incorrect position 
     * @param playerCombination Player combination color list
     * @param secretCombination Secret combination color list
     * @return number of incorrect colors
     */
	public int correctColorWrongPos(Color[] playerCombination, Color[] secretCombination) {
		this.correctColourWrongPos = 0;
		
		for (int i = 0; i < secretCombination.length; i++) {
			
			if(i != 0) {
				if (playerCombination[0] == secretCombination[i]) {
					this.correctColourWrongPos++;
				}
			}
			if( i != 1) {
				if (playerCombination[1] == secretCombination[i]) {
					this.correctColourWrongPos++;
					//System.out.println("Valor de incorrectas: " + correctColourWrongPos);
				}
			}
						
			if( i != 2) {
				if (playerCombination[2] == secretCombination[i]) {
					this.correctColourWrongPos++;
					//System.out.println("Valor de incorrectas: " + correctColourWrongPos);
				}
			}
						
			if( i != 3) {
				if (playerCombination[3] == secretCombination[i]) {
					this.correctColourWrongPos++;
					//System.out.println("Valor de incorrectas: " + correctColourWrongPos);
				}
			}
		}
		//System.out.println("Posicion incorrecta " + this.correctColourWrongPos);
		return correctColourWrongPos;
	}
	
	
	
	
	
	public void checkCombination(ArrayList pJPanel, int pCorrectPosAndColour, int pCorrectColourWrongPos, ArrayList pRandoms) {
		int next=0;

		while(pCorrectPosAndColour>0) {
			JPanel p1 = (JPanel) pJPanel.get(next);
			p1.setBackground(Color.red);
			next++;
			pCorrectPosAndColour--;
		}
		while(pCorrectColourWrongPos>0) {
			JPanel p1 = (JPanel) pJPanel.get(next);
			p1.setBackground(Color.white);
			next++;
			pCorrectColourWrongPos--;
		}

		for (int j = pCorrectPosAndColour; j < pCorrectColourWrongPos; j++){
			next++;
			JPanel p2 = (JPanel) pJPanel.get(next);
			p2.setBackground(Color.white);
		}
		
	}
	
	/**
	 * Method that checks if you already won
	 * @return Victory
	 */
	public boolean isVictory() {
		this.victory = true;
		return this.victory;
	}
	
	

}