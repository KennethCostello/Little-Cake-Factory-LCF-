public class customer {
	
	//declare variables
	private int customerNumber;
	private String name; 
	private String deliveryAddress; 
	private String phoneNumber; 
	private String emailAddress;
	
	public customer ( int customerNo , String cName, String cAddress, String cPhone, String cEmail)
	{
		this.customerNumber = customerNo;
		this.name = cName; 
		this.deliveryAddress = cAddress; 
		this.phoneNumber = cPhone; 
		this.emailAddress = cEmail;
		// five-argument constructor
	}
	
	// set customer number
	public void setCustNum( int customerNo)
	{
		this.customerNumber = customerNo;
	}
	// get customer number
	public int getCustNum()
	{
		return this.customerNumber;
	}
	
	//set name
	public void setName(String cName )
	{
		this.name = cName;
	}
	// get name
	public String getName()
	{
		return this.name;
	}
	
	// set address
	public void setAddress(String cAddress )
	{
		this.deliveryAddress = cAddress;
	}
	// get address
	public String getAddress()
	{
		return this.deliveryAddress;
	}
	
	// set Phone
	public void setPhone(String cPhone )
	{
		this.phoneNumber = cPhone;
	}	
	// get Phone
	public String getPhone()
	{
		return this.phoneNumber;
	}
	
	// set email
	public void setEmail(String cEmail )
	{
		this.emailAddress = cEmail;
	}
	// get email
	public String getEmail()
	{
		return this.emailAddress;
	}

}

