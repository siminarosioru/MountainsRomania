package images; 

import javax.swing.ImageIcon;

public class Images
{
	private String m_name;
	private String m_description;
	private ImageIcon m_icon;
		
	//constructor
	public Images(String name, String description, String imagePath)
	{
		this.m_name = name;
		this.m_description = description;
		this.m_icon = new ImageIcon(getClass().getResource(imagePath));
	}
		
	//method must return a result of type String
	public String getName() 
	{
		return m_name;
	}
	
	public String getDescription()
	{
		return m_description;
	}
	
	public ImageIcon getIcon()
	{
		return m_icon;
	}
  
	public String toString()
	{
		return m_name; 
	}
	
}
