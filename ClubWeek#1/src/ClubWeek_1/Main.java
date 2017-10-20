package ClubWeek_1;

import java.awt.BorderLayout;

public class Main 
{	
	private static int yDimentionSize = 800;
	private static int xDimentionSize = 800;
	
	public Main() 
	{
		Frame frameA = new Frame(xDimentionSize, yDimentionSize);
		Panel panelA = new Panel();
		frameA.add(panelA, BorderLayout.CENTER);
		MouseListen lis = new MouseListen (panelA);
		panelA.addMouseListener(lis);
	}


	public static void main(String[] args) {
		new Main();
	}
}