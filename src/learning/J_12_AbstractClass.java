package learning;

/*
	Abstract or Abstraction :-
	________________________________________
	
	- When we want to hide the actual mechanism or code, and just want to show those thing 
		which are required to show, then, Abstract or Abstraction is used.
		
	- Abstract methods have only declaration in Abstract class, its definition is defined 
		in those classes which extends it.
		
	- Only abstract class will have abstract methods, but, an abstract class can have 
		a normal, final and an abstract methods too, and the class extending it have to 
		override the abstract methods only.
		
	- After extending the abstract class, it is mandatory to Override all those 
		methods which are abstract methods.
		
	- Abstract Class cannot be instantiated, there should always be a class which extends the 
		abstract class.
*/

abstract class BMW {

	public final void welcomeMessage() {
		System.out.println("Welcome to BMW Showroom.");
	}

	public void details() {
		System.out.println("This is BMW model.");
	}

	public abstract void enginePerformance();

	public abstract void suspensionDetails();
};

//below class is extending the above class.

class BMW_G7 extends BMW {

	@Override
	public void enginePerformance() {
		// we have to implement all the abstract methods of abstract class.
	}

	@Override
	public void suspensionDetails() {
		// we have to implement all the abstract methods of abstract class.
	}

};

public class J_12_AbstractClass {

	public static void main(String args[]) {

//		BMW bmw = new BMW();		error
		BMW bmw = new BMW_G7();

	}
}
