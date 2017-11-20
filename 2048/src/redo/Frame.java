package redo;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	public Frame() {
		this.setVisible(true);
		this.setTitle("2048");
		this.setResizable(false);
		this.setSize(500, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
}
