public class PrintCake extends Cake
{
	//declare variables
	private String Icing;
	
	private double flatFee = 7.50;
	private double Cost;
	
	public PrintCake ( String cName, String cFlavour, String cShape , String cColour , double cSize, double inCost )
	{
		super( cName, cFlavour, cShape ,  cColour , cSize, inCost ); // pass to cake super class 
		// six-argument constructor
	} 
		
	// get price
	public double calculatePrice()
	{
			// take cake class cost add flat fee cost
		this.Cost = (super.getCakeSize()* super.getInchCost() ) + flatFee;
			return this.Cost;
	}
	
	// return icing 
	public String getCakeIcing()
	{
		this.Icing = "Printed"; //set icing 
		return this.Icing;
	}
		
}
