package logic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class RoundedPanel extends JPanel {
	
        private Color backgroundColor;
        private int cornerRadius = 10;
        
        
        public RoundedPanel (LayoutManager layout, int radio) {
            super (layout);
            cornerRadius = radio;
        }
        public RoundedPanel (LayoutManager layout, int radio, Color bgColor) {
            super (layout);
            cornerRadius = radio;
            backgroundColor = bgColor;
        }
        public RoundedPanel (int radio) {
            super();
            cornerRadius = radio;
            
        }
        public RoundedPanel (int radio, Color bgColor) {
            super();
            cornerRadius = radio;
            backgroundColor = bgColor;
        }
        
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent (g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int ancho = getWidth ();
            int altura = getHeight ();
            
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            // Dibuja el panel redondeado con bordes.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect (0, 0, ancho-1, altura-1, arcs.width, arcs.height); // pintar fondo
            graphics.setColor (getForeground ());
            //graphics.drawRoundRect (0, 0, ancho-1, alto-1, arcs.width, arcs.height); // pintar borde
//
        }
    }