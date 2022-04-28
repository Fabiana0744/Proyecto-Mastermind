package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;

/**
 * This class creates ten lines of four JPanels
 * @author Fabiana Arias y Fabian Alfaro
 *
 */
public class Board extends JPanel{
	
	
	public Line l1 = new Line();
	public Line l2 = new Line();
	public Line l3 = new Line();
	public Line l4 = new Line();
	public Line l5 = new Line();
	public Line l6 = new Line();
	public Line l7 = new Line();
	public Line l8 = new Line();
	public Line l9 = new Line();
	public Line l10 = new Line();
	
	
	/**
	 * Constructor method
	 * The lines are added to a large JPanel
	 */
	public Board(){
		//this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.setBorder(BorderFactory.createLineBorder(Color.green,12));
		this.setPreferredSize(new Dimension(390,580));
		this.setMaximumSize(new Dimension(390,580));
		
		//this.setLayout(null);
		this.setBackground(null);
		
		this.add(l10);
		this.add(l9);
		this.add(l8);
		this.add(l7);
		this.add(l6);
		this.add(l5);
		this.add(l4);
		this.add(l3);
		this.add(l2);
		this.add(l1);
		
		//this.l1.p1.setBackground(Color.black);
		
	}
	
	
	
}
