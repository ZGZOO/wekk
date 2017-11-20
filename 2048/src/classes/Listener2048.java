package classes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener2048 implements KeyListener{
	
	World2048 newGame;
    public Listener2048(World2048 newGame) {
        this.newGame = newGame;
    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 newGame.Calculation(e.getKeyCode());
	     System.out.println("key");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
