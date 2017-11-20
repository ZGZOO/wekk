package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Buttons extends JButton implements ActionListener{
	
	private static final int BUTTON_LOCATION_X = 180;  
	private static final int BUTTON_LOCATION_Y = 500;   
	private static final int BUTTON_SIZE_X = 140;      
	private static final int BUTTON_SIZE_Y = 50;
	
	public Buttons() {
		this.setBounds(BUTTON_LOCATION_X, BUTTON_LOCATION_Y, BUTTON_SIZE_X, BUTTON_SIZE_Y);
		this.setText("Start Game");  
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Start the game.");
	}

}
