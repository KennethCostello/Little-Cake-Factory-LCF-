public class CakeTest {
	
	//testing the class functionality for part a of the question 

	public static void main(String[] args) {
		//declare variables
		int MAX = 4;
		
		//create test constructors
		Cake standardCake = new Cake("Fudge Cake", "Chocolate", "Circle", "Chocolate", 22.0 , 1.50 );
		PrintCake pCake = new PrintCake("Birthday Cake", "Vanilla", "Rectangle", "Blue", 22.0 , 1.50 );
		HandmadeCake hCake = new HandmadeCake("Red velvet", "Red Velvet", "Heart", "Red", 22.0 , 1.50 , 9 );
		HandmadeCake gCake = new HandmadeCake("Red velvet", "Red Velvet", "Heart", "Red", 22.0 , 1.50 , 122 );
		
		// create array
		Cake cakes[] = new Cake[MAX]; 
		
		//add cakes to array
		cakes[0] = standardCake;
		cakes[1] = pCake;
		cakes[2] = hCake;
		cakes[3] = gCake;
		
		//print titles
		System.out.printf("Cake Name:     Flavour:     Diameter:     Shape:     Colour:     Icing:\n");
		
		//print array of cakes
		for (int i=0; i<cakes.length; i++) 
	      {  
	         System.out.printf("%s     %s     %f     %s     %s     %s      Costs: $%,.2f\n", cakes[i].getCakeName(), cakes[i].getCakeFlavour(), cakes[i].getCakeSize(), cakes[i].getCakeShape(), cakes[i].getCakeColour(), cakes[i].getCakeIcing(), cakes[i].calculatePrice());
	      } 
	}
}
