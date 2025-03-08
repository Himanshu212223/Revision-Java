package learning;

/*
	Interface :-
	__________________
	
	- Interface is like abstract, but, in interface, only static or default methods can 
		have their definition or implementation, all other methods should be abstract 
		only and their definition  or implementation is allowed in their child class.
		
	-	Any method declared without abstract keyword will automatically becomes 
		abstract method.
		
	-	implements is used in place of extends to implement or inherit the interface.
	
	-	a class can implements multiple interface.
*/



interface InterfaceOfTataMotors {
	
	public static void motorDetails() {
		System.out.println("Hii.., this is the body of static method of interface.");
	}
	
	default void motorLifeTime() {
		System.out.println("Hii.., this is the body of default method of interface.");
	}
	
	//	It will automatically acts as abstract method as it is defined in interface.
	public void motorPerformance() ;
	
	public abstract void motorPowerRating() ;
}


class Nexon implements InterfaceOfTataMotors{

	@Override
	public void motorPerformance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void motorPowerRating() {
		// TODO Auto-generated method stub
		
	}
	
}


public class J_13_Interface {

	public static void main(String args[]) {

		InterfaceOfTataMotors car = new Nexon();

	}
}
