package mainGraphicalInterface;

import javax.swing.JFrame;

public class MountainsRomania {

	public static void main(String[] args) {
		//create JFrame window
		JFrame window = new JFrame("first graphical interface");
		window.setVisible(true);
		window.setSize(500, 800);
		window.setLocationRelativeTo(null);
		
		//close the execution program
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
