public class order{
	//declare variables
	private String orderDate;
	private String deliveryDate;
	private int orderNumber;
	private int customerNumber;
	private double TCost;

	private Cake[] cakes; // array to store cakes 
	private int numberOfCakes; // number of cakes ordered
	
public order ( int orderNo, String orderD, String deliveryD , int customerNo)
	{
		this.orderNumber = orderNo;
		this.orderDate = orderD;
		this.deliveryDate = deliveryD;
		this.customerNumber = customerNo;
	    this.numberOfCakes = 0;
	    this.cakes = new Cake[10];
	    this.TCost = 0;
	 }
	
	//add cakes to array 
	public void addCakeToCart(Cake cake) 
	{
		this.cakes[numberOfCakes] = cake; //add cake
		this.numberOfCakes++; //increase number of cakes
	}
	
	//get total price for all cakes in order
	public double calculatePrice()
	{
		for (int i=0; i<numberOfCakes; i++) 
	      {  
			this.TCost = TCost + cakes[i].calculatePrice();
			//adds price of all cakes in array 
	      }
		
		return this.TCost;
	}
	
	//return cakes in order 
	public Cake[] getCakes() 
	{
		return this.cakes;
	}

	//return number of cakes in order 
	public int getNumberOfCakes() 
	{
	    return this.numberOfCakes;
	}
	
	// set order number
	public void setOrderNum( int orderNo )
	{
		this.orderNumber = orderNo;
	}
		
	// get order number 
	public int getOrderNum()
	{
		return this.orderNumber;
	}
	
	//Set order DATE
	public void setOrderDate(String orderD )
	{
		this.orderDate = orderD;
	}
		
	// get order DATE
	public String getOrderDate()
	{
		return this.orderDate;
	}
	
	//Set del DATE
	public void setDelDate(String deliveryD )
	{
		this.deliveryDate = deliveryD;
	}
		
	// get del DATE
	public String getDelDate()
	{
		return this.deliveryDate;
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
}



