package ClubWeek_1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{
	private static int x;
	private static int y;
	public Panel(){
		
	}
	
	public void paint(Graphics g) {
//		g.setColor(Color.WHITE);
//		g.fillRect(0, 0, 1, 10);
		g.setColor(Color.BLACK);
		g.fillOval(x, y, 20, 20);
	}
		
	public void setCoor(int x1, int y1) {
		x = x1;
		y = y1;
		repaint();
	}
	
}
