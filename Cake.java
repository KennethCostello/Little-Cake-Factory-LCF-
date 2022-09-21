public class Cake {
	
	
	//declare variables
	private String cakeName;
	private String cakeFlavour;
	private String cakeShape;
	private String cakeColour;
	private String Icing;
	
	private double cakeSize;
	private double inchCost;
	private double Cost;
	
	
	public Cake( String cName, String cFlavour, String cShape , String cColour , double cSize, double inCost )
	   {
		
		this.cakeName = cName;
		this.cakeFlavour = cFlavour;
		this.cakeShape = cShape;
		this.cakeColour = cColour;
		
		this.cakeSize = cSize;
		this.inchCost = inCost; 
		
		// six-argument constructor
	   } 

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
	
	
	// set cake flavour
	public void setCakeFlavour( String cFlavour )
	{
		this.cakeFlavour = cFlavour;
	}
	// get cake flavour
	public String getCakeFlavour()
	{
		return this.cakeFlavour;
	}
	
	
	// set cake shape 
	public void setCakeShape( String cShape )
	{
		this.cakeShape = cShape;
	}
	// get cake shape
	public String getCakeShape()
	{
		return this.cakeShape;
	}
		
	
	// set cake Colour
	public void setCakeColour( String cColour )
	{
		this.cakeColour = cColour;
	}
	// get cake Colour
	public String getCakeColour()
	{
		return this.cakeColour;
	}
	
	// set cake size
	public void setCakeSize( double cSize )
	{
		this.cakeSize = ( cSize >= 6.0 ) ?
		cSize: 6.0;
	}
	// return cakeSize
	public double getCakeSize()
	{
		return this.cakeSize;
	} 

	//set inchCost
	public void setInchCost( double inCost )
	{
		this.inchCost = ( inCost < 0.0 ) ? 0.0 : inCost;
	}
	// return inchCost
	public double getInchCost()
	{
		return this.inchCost;
	} 
	
	// get price
	public double calculatePrice()
	{
		this.Cost = cakeSize * inchCost;
			return this.Cost;
	}
	
	//get Icing 
	public String getCakeIcing()
	{
		Icing = "None";
		return Icing;
	}
	
}
