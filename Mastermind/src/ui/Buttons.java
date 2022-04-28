package ui;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import logic.Checker;
import logic.PlayerCombination;
import logic.RoundedButtons;
import logic.RoundedPanel;
import logic.SecretCombination;


/**
 * This class 
 * @author Fabiana Arias y Fabian Alfaro
 *
 */
public class Buttons extends JPanel{
	
	private PlayerCombination pc = new PlayerCombination();
	
	private Color[] playerCombination = {Color.white, Color.white, Color.white, Color.white};	

	private SecretCombination sc = new SecretCombination();
		
	private Frame appFrame = new Frame();

	private Grid grid;
	
	private Checker checker = new Checker(grid);
	
	/**
	 * Constructor method
	 * @param appGrid AppGrid contains the JPanel
	 */
	public Buttons(Grid appGrid) {
		this.grid = appGrid;
		this.setLayout(null);
		this.setSize(400,100);
		this.setPreferredSize(new Dimension(400,100));
		this.setMaximumSize(new Dimension(400,100));
		
		sc.generateSecretCombination();
		

		JButton btn1 = new RoundedButtons();
		btn1.paint(getGraphics());
		btn1.setBounds(70,10,40,40);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btn1.setBackground(pc.assignColor());
				
			}
		});
				
		
		
		JButton btn2 = new RoundedButtons();
		btn2.setBounds(140,10,40,40);
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btn2.setBackground(pc.assignColor());
				
			}
		});
		
		JButton btn3 = new RoundedButtons();
		btn3.setBounds(210,10,40,40);
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btn3.setBackground(pc.assignColor());
				
			}
		});
		
		JButton btn4 = new RoundedButtons();
		btn4.setBounds(280,10,40,40);
		
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btn4.setBackground(pc.assignColor());
				
			}
		});
		
		
		JButton btnEnviar = new JButton();
		btnEnviar.setBounds(70,60,250,30);
		btnEnviar.setText("Enviar");
		btnEnviar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnEnviar.addActionListener(new ActionListener() {

			private int click;
			private int count = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pc.generatePlayerCombination(btn1.getBackground(), btn2.getBackground(), btn3.getBackground(), btn4.getBackground());
				Color[] playerList = pc.getPlayerCombination();
				//checker.verify(playerList);
				
				
				click = countClick();
				if(click==1) {
					callSetLine1();
					callCheckerLine1();
					
				}
				//click -= 1;
				if(click ==2) {
					callSetLine2();
					callCheckerLine2();
				}
				//click -= 1;
				if(click ==3) {
					callSetLine3();
					callCheckerLine3();
				}
				//click -= 1;
				if(click == 4) {
					callSetLine4();
					callCheckerLine4();
				}
				if(click == 5) {
					callSetLine5();
					callCheckerLine5();
				}
				if(click == 6) {
					callSetLine6();
					callCheckerLine6();
				}
				if(click == 7) {
					callSetLine7();
					callCheckerLine7();
				}
				if(click == 8) {
					callSetLine8();
					callCheckerLine8();
				}
				if(click == 9) {
					callSetLine9();
					callCheckerLine9();
				}
				if(click == 10) {
					callSetLine10();
					callCheckerLine10();
				}
				if(click >10) {
				System.out.println("Alcanzó la cantidad de turnos máxima");
				//Frame appFrame = new Frame();
				appFrame.close();
				appFrame.setVisible(true);
				//Acá debe ir el cuadrito de "Desea jugar de nuevo?"
				click = 0;
				}
				
			}

			private int countClick() {
				this.count ++;		
				return this.count;

			}
		});
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btnEnviar);
	}
	



	/**
	 * Method that calls line 1 with its respective panels
	 */
	public void callSetLine1() {
		this.grid.setLine1(pc.getPlayerCombination());
	}
	
	/**
	 * Method that calls line 2 with its respective panels
	 */
	public void callSetLine2() {
		this.grid.setLine2(pc.getPlayerCombination());
	}
	
	/**
	 * Method that calls line 3 with its respective panels
	 */
	public void callSetLine3() {
		this.grid.setLine3(pc.getPlayerCombination());
	}
	
	/**
	 * Method that calls line 4 with its respective panels
	 */
	public void callSetLine4() {
		this.grid.setLine4(pc.getPlayerCombination());
	}
	
	/**
	 * Method that calls line 5 with its respective panels
	 */
	public void callSetLine5() {
		this.grid.setLine5(pc.getPlayerCombination());
	}
	
	/**
	 * Method that calls line 6 with its respective panels
	 */
	public void callSetLine6() {
		this.grid.setLine6(pc.getPlayerCombination());
	}
	
	/**
	 * Method that calls line 7 with its respective panels
	 */
	public void callSetLine7() {
		this.grid.setLine7(pc.getPlayerCombination());
	}
	
	/**
	 * Method that calls line 8 with its respective panels
	 */
	public void callSetLine8() {
		this.grid.setLine8(pc.getPlayerCombination());
	}
	
	/**
	 * Method that calls line 9 with its respective panels
	 */
	public void callSetLine9() {
		this.grid.setLine9(pc.getPlayerCombination());
	}
	
	/**
	 * Method that calls line 10 with its respective panels
	 */
	public void callSetLine10() {
		this.grid.setLine10(pc.getPlayerCombination());
	}
	
	/**
	 * Method that allows modifying line 1 with its respective panels
	 */
	public void callCheckerLine1() {
		int correctPosAndColour = checker.correctColorandPos(pc.getPlayerCombination(), sc.getSecretCombination());
		checker.checkCombination(this.grid.board.l1.clues, checker.getcorrectPosAndColour(),
				checker.getcorrectColourWrongPos(), new ArrayList<>());
		if(correctPosAndColour == 4) {
			boolean isVictory = checker.isVictory();
			appFrame.victory(isVictory);
		}
	}
	
	/**
	 * Method that allows modifying line 2 with its respective panels
	 */
	public void callCheckerLine2() {
		
		int correctPosAndColour = checker.correctColorandPos(pc.getPlayerCombination(), sc.getSecretCombination());
		checker.checkCombination(this.grid.board.l2.clues, checker.getcorrectPosAndColour(),
				checker.getcorrectColourWrongPos(), new ArrayList<>());
		if(correctPosAndColour == 4) {
			boolean isVictory = checker.isVictory();
			appFrame.victory(isVictory);
		}
	}
	
	
	/**
	 * Method that allows modifying line 3 with its respective panels
	 */
	public void callCheckerLine3() {
		int correctPosAndColour = checker.correctColorandPos(pc.getPlayerCombination(), sc.getSecretCombination());
		checker.checkCombination(this.grid.board.l3.clues, checker.getcorrectPosAndColour(),
				checker.getcorrectColourWrongPos(), new ArrayList<>());
		if(correctPosAndColour == 4) {
			boolean isVictory = checker.isVictory();
			appFrame.victory(isVictory);
		}
	}
	
	/**
	 * Method that allows modifying line 4 with its respective panels
	 */
	public void callCheckerLine4() {
		int correctPosAndColour = checker.correctColorandPos(pc.getPlayerCombination(), sc.getSecretCombination());
		checker.checkCombination(this.grid.board.l4.clues, checker.getcorrectPosAndColour(),
				checker.getcorrectColourWrongPos(), new ArrayList<>());
		if(correctPosAndColour == 4) {
			boolean isVictory = checker.isVictory();
			appFrame.victory(isVictory);
		}
	}
	
	
	/**
	 * Method that allows modifying line 5 with its respective panels
	 */
	public void callCheckerLine5() {
		int correctPosAndColour = checker.correctColorandPos(pc.getPlayerCombination(), sc.getSecretCombination());
		checker.checkCombination(this.grid.board.l5.clues, checker.getcorrectPosAndColour(),
				checker.getcorrectColourWrongPos(), new ArrayList<>());
		if(correctPosAndColour == 4) {
			boolean isVictory = checker.isVictory();
			appFrame.victory(isVictory);
		}
	}
	
	/**
	 * Method that allows modifying line 6 with its respective panels
	 */
	public void callCheckerLine6() {
		int correctPosAndColour = checker.correctColorandPos(pc.getPlayerCombination(), sc.getSecretCombination());
		checker.checkCombination(this.grid.board.l6.clues, checker.getcorrectPosAndColour(),
				checker.getcorrectColourWrongPos(), new ArrayList<>());
		if(correctPosAndColour == 4) {
			boolean isVictory = checker.isVictory();
			appFrame.victory(isVictory);
		}	
	}
	
	/**
	 * Method that allows modifying line 7 with its respective panels
	 */
	public void callCheckerLine7() {
		int correctPosAndColour = checker.correctColorandPos(pc.getPlayerCombination(), sc.getSecretCombination());
		checker.checkCombination(this.grid.board.l7.clues, checker.getcorrectPosAndColour(),
				checker.getcorrectColourWrongPos(), new ArrayList<>());
		if(correctPosAndColour == 4) {
			boolean isVictory = checker.isVictory();
			appFrame.victory(isVictory);
		}
	}
	
	/**
	 * Method that allows modifying line 8 with its respective panels
	 */
	public void callCheckerLine8() {
		int correctPosAndColour = checker.correctColorandPos(pc.getPlayerCombination(), sc.getSecretCombination());
		checker.checkCombination(this.grid.board.l8.clues, checker.getcorrectPosAndColour(),
				checker.getcorrectColourWrongPos(), new ArrayList<>());
		if(correctPosAndColour == 4) {
			boolean isVictory = checker.isVictory();
			appFrame.victory(isVictory);
		}	
	}
	
	/**
	 * Method that allows modifying line 9 with its respective panels
	 */
	public void callCheckerLine9() {	
		int correctPosAndColour = checker.correctColorandPos(pc.getPlayerCombination(), sc.getSecretCombination());
		checker.checkCombination(this.grid.board.l9.clues, checker.getcorrectPosAndColour(),
				checker.getcorrectColourWrongPos(), new ArrayList<>());
		if(correctPosAndColour == 4) {
			boolean isVictory = checker.isVictory();
			appFrame.victory(isVictory);
		}	
	}
	
	/**
	 * Method that allows modifying line 10 with its respective panels
	 */
	public void callCheckerLine10() {
		int correctPosAndColour = checker.correctColorandPos(pc.getPlayerCombination(), sc.getSecretCombination());
		checker.checkCombination(this.grid.board.l10.clues, checker.getcorrectPosAndColour(),
				checker.getcorrectColourWrongPos(), new ArrayList<>());
		if(correctPosAndColour == 4) {
			boolean isVictory = checker.isVictory();
			appFrame.victory(isVictory);
		}	
	}
	
}