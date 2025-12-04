package mainGraphicalInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

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

		//positioning in the window
		myComboBox.setBounds(400, 100, 200, 50);

		//add the comboBox to the current window 
		myFrame.add(myComboBox);

		//the area where the description appears
		JTextArea descriptionArea = new JTextArea();

		descriptionArea.setBounds(50, 100, 300, 150);
		descriptionArea.setEditable(false);
		descriptionArea.setLineWrap(true);
		descriptionArea.setWrapStyleWord(true);
		myFrame.add(descriptionArea);

		//descriptions for each peak
		String retezatInfo = "Retezat Peak has 2482 m.\n"
						+"It is located in the Retezat Mountains and "
						+"is known for its spectacular glacial lakes.";
		String omuInfo = "Omu Peak has 2507 m.\n"
						+"It is the highest peak in the Bucegi Mountains and the sixth in Romania.";
		String peleagaInfo = "Peleaga Peak has 2509 m.\n"
						+"The highest peak in the Retezat Mountains, easily accessible via the ridge.";
		String papusaInfo = "Papusa Peak has 2391 m.\n"
						+"A peak in the Parâng massif, which offers very beautiful views.";

		//add an ActionListener that will receive an ActionEvent when a selection has been made
		myComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
						
		
  }
  
