public class orderTest {

	//testing the class functionality for part b of the question 
	  
	public static void main(String[] args) {

		   //create test constructors
	       Cake standardCake = new Cake("Fudge Cake", "Chocolate", "Circle", "None", 22.0, 1.50);
	       PrintCake pCake = new PrintCake("BirthdayCake", "Vanilla   ", "Circle", "Blue", 29.0, 3.50);
	       HandmadeCake hCake = new HandmadeCake("Red velvet", "Red Velvet", "Heart", "Red", 22.5, 1.50, 9);
	       HandmadeCake gCake = new HandmadeCake("Red velvet", "Red Velvet", "Heart", "Red", 22.0, 1.50, 122);
	       order testOrder = new order(23, "22-03-21", "25-03-21", 45);
	       
	       //add to array of cakes in order class
	       testOrder.addCakeToCart(standardCake);
	       testOrder.addCakeToCart(pCake);
	       testOrder.addCakeToCart(gCake);
	       testOrder.addCakeToCart(hCake);
	       
	       //print out info stored within order class
	       System.out.printf("Order Number: %d\n", testOrder.getOrderNum());
	       System.out.printf("Number of cakes in the order: %d\n", testOrder.getNumberOfCakes());
	       System.out.printf("Order Cost: €%.2f\n", testOrder.calculatePrice());
	       System.out.printf("Cakes:\n");
	       //print titles 
	       System.out.printf("Cake Name\t\tFlavour \t\tDiameter\t\tShape:\t\tColour\t\tIcing\n");
	       //print out cakes array from order class
	       for (Cake cake : testOrder.getCakes()) 
	       {
	         if (cake != null)
	           System.out.printf( "%s\t\t%s\t\t%.2f    \t\t%s\t\t%s\t\t%s\t\t\n", cake.getCakeName(), cake.getCakeFlavour(), cake.getCakeSize(), cake.getCakeShape(), cake.getCakeColour(), cake.getCakeIcing());
	         }
	       //create test constructors
	       customer testCustomer = new customer(45, "John Smith", "10 Smith Street, Dublin", "0851234567"," john@smith.com");
	       //print out info stored within customer class
	       System.out.printf("\nCustomer Name: %s\n", testCustomer.getName());
	       System.out.printf("Phone Number: %s\n", testCustomer.getPhone());
	       System.out.printf("Address: %s\n", testCustomer.getAddress());
	       System.out.printf("Email Address: %s\n", testCustomer.getEmail());
	       System.out.printf("Orders: %d\n", testOrder.getOrderNum());
	   }
	}
