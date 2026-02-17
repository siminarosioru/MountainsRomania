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

		//connection with the Images class
		combo.addItem(new Images(
				"Omu peak",
				"Omu Peak has 2507 m. \n"
				+ "It is the highest peak in the Bucegi Mountains \n"
				+ " and the sixth in Romania.",
				"/resurse/omu.png"
		));
		
		combo.addItem(new Images(
				"Retezat peak",
				"Retezat Peak has 2482 m. \n"
				+ "It is located in the Retezat Mountains \n"
				+ " and is known for its specta",
				"/resurse/retezat.png"
		));
		
		combo.addItem(new Images(
				"Peleaga peak",
				"Peleaga Peak has 2509 m.\n"
				+ "The highest peak in the Retezat Mountains, \n"
				+ "easily accessible via the ridge.",
				"/resurse/peleaga.png"
		));
		
		combo.addItem(new Images(
				"Papusa peak",
				"Papusa Peak has 2391 m.\n"
				+"A peak in the Parâng massif, \n"
				+ "which offers very beautiful views.",
				"/resurse/papusa.png"
		));

		//the ActionListener will receive an ActionEvent when a selection has been made
		combo.addActionListener(e -> {
			Images selected = (Images) combo.getSelectedItem();
			if(selected != null) 
			{
				descriptionArea.setText(selected.getDescription());
				
				Image img = selected.getIcon().getImage()
						.getScaledInstance(
								imageLabel.getWidth(),
								imageLabel.getHeight(),
								Image.SCALE_SMOOTH
						);
				imageLabel.setIcon(new ImageIcon(img));
			}
		});
		
