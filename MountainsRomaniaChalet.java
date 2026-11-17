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
			new ReceptionUI();
		});


		//create the Room button
		JButton butonCamera = new JButton("Room");
		butonCamera.setBounds(150, 200, 180, 50);
		frame1.add(butonCamera);

		butonCamera.addActionListener(e -> {
			new RoomUI();
		});


		//create the "Book a room" button
		JButton btnRezervaCamera = new JButton("Book a room");
		btnRezervaCamera.setBounds(150, 300, 180, 50);
		
  }
}
