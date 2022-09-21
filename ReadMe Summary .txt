To satisfy the requirements of part (a) of the question I have created 3 classes. 
•	Cake.java
•	PrintCake.java 
•	HandmadeCake.java

Cake.java contains all required data members: 
	private String cakeName;
	private String cakeFlavour;
	private String cakeShape;
	private String cakeColour;
	private String Icing;
	
	private double cakeSize;
	private double inchCost;
	private double Cost;

The cake class is the super class which is inherited by PrintCake.java and HandmadeCake.java. The cake class has setters and getters for each of the above data members.
	// set cake name 
	public void setCakeName( String cName )
	{
		this.cakeName = cName;
	}
	// get cake name
	public String getCakeName()
	{
		return this.cakeName;
	}
It also has a calculatePrice() method which takes in the information provided and returns the price of the cake. 
public double calculatePrice()
	{
		this.Cost = cakeSize * inchCost;
			return this.Cost;
	}
It also has a getCakeIcing() method which sets the icing to none. 
PrintCake.java extends Cake class. The key difference here is the icing data member will be set differently and the calculatePrice() method implements a flat fee as instructed by the question.
public double calculatePrice()
	{
			// take cake class cost add flat fee cost
this.Cost = (super.getCakeSize()* super.getInchCost() ) + flatFee;
			return this.Cost;
	}
Again HandmadeCake.java extends cake but has the same two differences. HandmadeCake requires another data member to implement calculatePrice() which is the number of letters needed. 
	public double calculatePrice()
	{
		// take cake class cost add to letter cost
this.Cost=((super.getCakeSize()*super.getInchCost())+(letterFee*letterNum)); 
		return this.Cost;
	}
CakeTest was created to test the above worked as desired. 

To satisfy the requirements of part (b) of the question I created  a further 2 classes. 
•	order.java
•	customer.java 
order.java contains all required data members as well as array to store the cakes in the order: 
	private String orderDate;
	private String deliveryDate;
	private int orderNumber;
	private int customerNumber;
	private double TCost;

	private Cake[] cakes; // array to store cakes 
	private int numberOfCakes; // number of cakes ordered

customer.java contains all required data also and uses setters and getters to obtain and return data.  
	private int customerNumber;
	private String name; 
	private String deliveryAddress; 
	private String phoneNumber; 
	private String emailAddress;

order.java implements getter and setter methods to safely require the data from main the same as in cake.java.  order.java has a addCakeToCart() method which saves the cake to an array and increments the count of cakes in the order.
	//add cakes to array 
	public void addCakeToCart(Cake cake) 
	{
		this.cakes[numberOfCakes] = cake; //add cake
		this.numberOfCakes++; //increase number of cakes
	}
The calculatePrice() method is also different within the order class> we need to get the combined price of all cakes in the order. To do this we implement a for loop using the number of cakes. Each pass adds the cost of a cake to the total cost until it has reached the end.  
	for (int i=0; i<numberOfCakes; i++) 
	      {  
			this.TCost = TCost + cakes[i].calculatePrice();
			//adds price of all cakes in array 
	      }
		
		return this.TCost
OrderTest.java was created to test these two classes. See source code 

