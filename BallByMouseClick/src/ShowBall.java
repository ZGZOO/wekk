import java.awt.BorderLayout;

public class ShowBall {
	public static void main(String[] args) {
		BallFrame frame1 = new BallFrame(600,600);
		BallPanel panel1 = new BallPanel();
		frame1.add(panel1, BorderLayout.CENTER);
		MouseClick lis = new MouseClick(panel1);
		panel1.addMouseListener(lis);
	}
}
