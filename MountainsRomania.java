package mainGraphicalInterface;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MountainsRomania {

	public static void main(String[] args) {
		//create JFrame window
		JFrame window = new JFrame("first graphical interface");
		window.setVisible(true);
		window.setSize(500, 800);
		window.setLocationRelativeTo(null);
		
		//close the execution program
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//set the minimum size of application
		window.setMinimumSize(new Dimension(400, 400));
		
		//create panels
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();

		//add panels to window
		window.add(leftPanel);
		window.add(rightPanel);
		
		//Layout - see every window
		window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.X_AXIS));

		//import the colors
		leftPanel.setBackground(Color.green);
		rightPanel.setBackground(Color.orange);

		//create button
		JButton b = new JButton("Mountains");
		leftPanel.add(b); //add a button to the green panel
		
		//create a new window
		JFrame myFrame = new JFrame("the highest mountain peaks in Romania ");

		//close the execution program
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
