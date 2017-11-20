import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import javax.swing.JPanel;

public class BallPanel extends JPanel implements ActionListener{
	private static int x = 20;
	private static int y = 20;
	int clockSpeed = 10;
	int ballSpeedX = 2;
	int ballSpeedY = 2;
	Timer clock = new Timer(clockSpeed,this);

	
	public BallPanel(){
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 20, 20);
		clock.start();
	}
	
	public void setCoor(int x1, int y1) {
		x = x1;
		y = y1;
		repaint();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		x += ballSpeedX;
		y += ballSpeedY;
		
		if(x == this.getWidth() - 20 || x == 0) {
			ballSpeedX = -ballSpeedX;
		}
		if(y == this.getHeight() - 20 || y == 0){
			ballSpeedY = -ballSpeedY;
		}
		
		repaint();
	}
}
