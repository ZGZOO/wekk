import javax.swing.JFrame;

public class BallFrame extends JFrame {
	public BallFrame (int x, int y) {
		this.setVisible(true);
		this.setSize(x, y);
		this.setTitle("Click your mouse to move the ball.");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
