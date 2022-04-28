package ui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import logic.Checker;


/**
 * This class creates the warning JFrames when the combination was successful or the attempts were finished.
 * @author Fabiana Arias y Fabian Alfaro
 *
 */
public class Frame extends JFrame{
	
	/**
	 * Constructor method
	 */
	public Frame() {
	}
	
	/**
	 * Method to create and display the warning JFrame when attempts finish.
	 */
	public void close() {
		String boton[] = {"Sí","Cerrar","Cancelar"};
		
		int opcion = JOptionPane.showOptionDialog(this, "Sus turnos se han terminado. ¿Desea jugar de nuevo?", "Select an option", 0, 0, null, boton, JOptionPane.ERROR_MESSAGE);
		
		if (opcion == JOptionPane.YES_OPTION) {
			FullBoard fb = new FullBoard();
			fb.main(boton);
			
		}
		if (opcion == JOptionPane.NO_OPTION) {
			System.exit(0);
		}
		if (opcion == JOptionPane.OK_CANCEL_OPTION) {
			System.exit(0);
		}
		
		
	}
	
	
	/**
	 * Method to create and display the warning JFrame when the combination was successful
	 * @param pIsVictory 
	 */
	public void victory(boolean pIsVictory) {
		String boton[] = {"Sí","Cerrar","Cancelar"};
		
		
		int opcion = JOptionPane.showConfirmDialog(this, "¡Felicidades, has ganado! ¿Desea jugar de nuevo?", "Select an option",JOptionPane.INFORMATION_MESSAGE );
		if(pIsVictory == true) {
			if (opcion == JOptionPane.YES_OPTION) {
				System.exit(0);
				FullBoard fb = new FullBoard();
				fb.main(boton);
				//Se debe volver a iniciar el juego
			}
			if (opcion == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
			if (opcion == JOptionPane.OK_CANCEL_OPTION) {
				System.exit(0);
			}
		}
	}
}
