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

	
  
}
