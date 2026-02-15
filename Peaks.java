package peaks;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import images.Images;

public class Peaks
{
	//constructor
	public Peaks()
	{
		JFrame frame = new JFrame("The highest mountain peaks in Romania");
		frame.setBounds(200, 100, 600, 450);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JComboBox<Images> combo = new JComboBox<>();
		combo.setBounds(350, 50, 200, 30);
		
		//the area where the description appears
		JTextArea descriptionArea = new JTextArea();

		descriptionArea.setBounds(30, 50, 280, 120);
		//sets the specified boolean value to indicate whether or not this TextComponent should be editable
		descriptionArea.setEditable(false); 
		
		JLabel imageLabel = new JLabel();
		imageLabel.setBounds(30, 200, 280, 180);
		
