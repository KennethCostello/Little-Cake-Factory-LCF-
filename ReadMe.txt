(a) The Little Cake Factory (LCF) hired your company to design their order system. As a cake shop, they have different cakes options. Create an inheritance hierarchy to represent the different cakes. The base class should be Cake and then include two different icings, PrintedCake and HandmadeCake options that derive from Cake. The customer can still order a cake without icing options, in this case, the Cake class should be called to create a concrete instance of Cake and icing can be set to None. The base class Cake should only include: 
o	Private data members of type String for:
o	cakeName
o	Flavour 
o	shape (Circle, Rectangle, Heart) 
o	colour of the Cake 
o	icing 
o	data members that: 
o	Store the diameter (in inches) 
o	Cost per inch. 

The constructor should initialise these members with parameter corresponding to all data members. Ensure that diameter is a positive integer with a minimum value of 6 and cost is a floating-point number greater than 0. The public interface should contain a method calculatePrice() that determines the cost by multiplying the diameter by cost per inch. 

PrintedCake and HandmadeCake should inherit directly from Cake. They should each contain one additional data member to represent additional fees. The PrintedCake has an additional flat fee, and the HandmadeCake has an additional fee per letter to be written on the cake. Each class will have to implement their versions of calculatePrice(). Write the code for each class.


(b) Create an Order class and a Customer class. An order object is made up of one or more cakes. The Order class should also include: 
o	order number String or integer 
o	order date: Date  
o	delivery date: Date 
o	Customer number: Integer 

A customer can have zero or more orders. Customer number (integer to be customer ID), name, delivery address, along with phone number and email address for orders can be derived from the customer object.


(c) As a part of the application, the kitchen, packing, and delivery departments in LCF need information about every day’s orders. Create a Java program that maintains a collection of all orders and provides functionality to output the following for a specific day: 
o	All the cakes that the kitchen needs to prepare. Loop through orders and display order number and the cakes in each order.
o	A list of orders for the packing team: Loop through the array of objects and for each object invoke get() methods to obtain cake information, then print to the console all cakes info in one order. Also, print the cost for each order, call the calculatePrice() method from Cake
