package chalet;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MountainsRomaniaChalet 
{
  //constructor
	public MountainsRomaniaChalet() 
	{
    	JFrame frame1 = new JFrame("the MountainsRomania chalet");

		frame1.setSize(500, 600);
		frame1.setLayout(null);
		frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);


		//create the Reception button
		JButton butonReceptie = new JButton("Reception");

		butonReceptie.setBounds(150, 100, 180, 50);

		frame1.add(butonReceptie);

		butonReceptie.addActionListener(e -> {
			
		});
		
  }
}
