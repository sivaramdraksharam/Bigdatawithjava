
public class Bird {
	//abstraction
	public String birdName;
	public String birdColor;
	
	public  int legs;
	public int wings;

	//encapsulation
	private boolean singStatus;
	
	
	
//constructor - used to initialize common values to the properties
	public Bird() {
		// TODO Auto-generated constructor stub
		legs=2;
		wings=2;
	}



	public boolean isSingStatus() {
		return singStatus;
	}



	public void setSingStatus(boolean singStatus) {
		this.singStatus = singStatus;
	}
	public void sing()
	{
		if(this.birdName.equals("Cokoo"))
		{
			System.out.println(this.birdName+" says..."+"la...ra...looo");
		}else
		{
			System.out.println(this.birdName+"says.."+"Can not sing!!!!");
		}
	}

}
