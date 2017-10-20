package ClubWeek_1;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Frame extends JFrame
{
	public Frame(int x, int y ) {
		this.setSize(x,y);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
