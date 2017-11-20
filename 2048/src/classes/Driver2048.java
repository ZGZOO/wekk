package classes;

import java.awt.BorderLayout;

public class Driver2048 {
	public static void main(String [] args) {
		World2048 game2048 = new World2048(); 
		game2048.randomGenerator();
		Listener2048 fourKeys = new Listener2048(game2048);
		Frame2048 gameFrame = new Frame2048();
		Panel2048 gamePanel = new Panel2048(game2048);
		Buttons startButton = new Buttons();
		gameFrame.add(startButton);
		gameFrame.addKeyListener(fourKeys);
		gameFrame.add(gamePanel,BorderLayout.CENTER);  
	}
	
}
