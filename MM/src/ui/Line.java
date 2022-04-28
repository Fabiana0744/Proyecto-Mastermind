package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

import logic.PlayerCombination;
import logic.RoundedPanel;


public class Line extends JPanel {
	
	JPanel p1 = getPanel();
	JPanel p2 = getPanel();
	JPanel p3 = getPanel();
	JPanel p4 = getPanel();
	JPanel clue1 = new JPanel();
	JPanel clue2 = new JPanel();
	JPanel clue3 = new JPanel();
	JPanel clue4 = new JPanel();
	
	ArrayList<JPanel> clues = new ArrayList<>();
	
	
	public JPanel getPanel() {
		
		return  new JPanel() {
			
			
		     @Override
		     protected void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        Dimension arcs = new Dimension(30,30); //Border corners arcs {width,height}, change this to whatever you want
		        int width = getWidth();
		        int height = getHeight();
		        Graphics2D graphics = (Graphics2D) g;
		        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


		        //Draws the rounded panel with borders.
		        graphics.setColor(Color.white);
		        //graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint background
		        graphics.setColor(Color.black);
		        graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint border
		     }
		  }; 
	}
	
	/**
	 * Constructor method
	 * Create a line of JPanels
	 */
	public Line() {
		this.setLayout(null);
		this.setPreferredSize(new Dimension(362,50));
		this.setBackground(null);
		
//		this.p1.setBackground(Color.gray);
//		this.p1.setBorder(BorderFactory.createLineBorder(Color.black));
		this.p1.setBounds(30,5,40,40);
		
		this.add(p1);
		
		
		this.p2.setBounds(90,5,40,40);
		this.add(p2);
		
		this.p3.setBounds(150,5,40,40);
		this.add(p3);
		
		this.p4.setBounds(210,5,40,40);
		this.add(p4);
		
		this.clue1.setBounds(305,5,20,20);
		this.clue1.setBackground(Color.gray);
		this.clue1.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(clue1);
		
		this.clue2.setBounds(335,5,20,20);
		this.clue2.setBackground(Color.gray);
		this.clue2.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(clue2);
		
		this.clue3.setBounds(335,30,20,20);
		this.clue3.setBackground(Color.gray);
		this.clue3.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(clue3);
		
		this.clue4.setBounds(305,30,20,20);
		this.clue4.setBackground(Color.gray);
		this.clue4.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(clue4);
		
		this.clues.add(clue1);
		this.clues.add(clue2);
		this.clues.add(clue3);
		this.clues.add(clue4);
		
	}
	
	

}