
import javax.swing.*;


public class OpenGUI {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Learning Management System.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		JButton button = new JButton("Press");
		frame.getContentPane().add(button);
		frame.setVisible(true);
	}
}