package chalet;

//The data regarding the Reception class contains information about clients.
public class Reception
{
  //private members for client data
  private int nrInregistrare;
	private String numeClient;
	private String prenumeClient;
	private String buletinClient;

	//constructor with parameters
	public Reception(int nr, String nume, String prenume, String buletin) 
	{
		this.nrInregistrare = nr;
		this.numeClient = nume;
		this.prenumeClient = prenume;
		this.buletinClient = buletin;
	}

	//add getter function for the registration number
	public int getNrInregistrare()
	{
		return nrInregistrare;
	}

	//add setter function for automatic renumbering
	public void setNrInregistrare(int nrInregistrare)
	{
		this.nrInregistrare = nrInregistrare;
	}

	//add the String class to the function for returning the client's name
	public String getNumeClient()
	{
		return numeClient;
	}

	//add the String class to the function for returning the client's first name
	public String getPrenumeClient()
	{
		return prenumeClient;
	}

	//add the String class to the function for returning the client's identity card or passport
	public String getBuletinClient()
	{
		return buletinClient;
	}

	//the toString function returns a string representation of the object
	public String toString()
	{
		return nrInregistrare + ". " + numeClient + " " + prenumeClient + " " + buletinClient;
	}
  
}
