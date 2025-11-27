package mainGraphicalInterface;

import javax.swing.JFrame;

public class Peaks {

	//constructor
  public Peaks() 
	{
		//create a new window
		JFrame myFrame = new JFrame("The highest mountain peaks in Romania ");
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setBounds(200, 100, 600, 400);
		myFrame.setLayout(null);

		//list of the highest mountain peaks in Romania
		String[]peaks = {"the Retezat peak", "the Omu peak", "the Peleaga peak"};

		//create JComboBox
		JComboBox<String> myComboBox = new JComboBox<String>(peaks);
		myComboBox.addItem("the Papusa peak");
		

  }
  
