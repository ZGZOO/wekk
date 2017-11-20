package redo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{
	World gameWorld;
	Frame gameFrame;
	
	public Panel(World gameWorld) {
		this.gameWorld = gameWorld;	
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0, 0, 500, 600);
		g.setColor(Color.black);
		int side = this.getWidth();
		//horizontal lines
		g.drawLine(0, 0, side, 0);
		g.drawLine(0, side/4, side, side/4);
		g.drawLine(0, side/2, side, side/2);
		g.drawLine(0, side*3/4, side, side*3/4);
		g.drawLine(0, side, side, side);
		//vertical lines
		g.drawLine(0, 0, 0, side);
		g.drawLine(side/4, 0, 0, side);
		g.drawLine(0, 0, 0, side);
		g.drawLine(0, 0, 0, side);
		g.drawLine(0, 0, 0, side);	
	}	
}
