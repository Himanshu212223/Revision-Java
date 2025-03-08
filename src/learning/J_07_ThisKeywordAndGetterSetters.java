package learning;

/*
	This Keyword :
	_______________________
	
	Sometimes, when the class attribute have same name as that of formal parameter of methods of the class.
	So, to it is better to use the class attribute referred through this keyword.
	
	This keyword is always used inside the class only, and is used to refer that the attribute 
	belongs to this class only.
	
	
	Getter Setter Methods :
	_____________________________ 
	
	It is nothing but just a way to give name to methods so that it would be easy what the 
	method does.
	Like, the method name begins with get will give the values of attributes of class.
	Like, the method name begins with set will set the values of attributes of class.
	
	- Fields of a class are often made private to hide their implementation details and
	 to prevent direct access from outside the class. 
	 Getters and setters provide a controlled way to access and modify these fields.
*/


class Employee1{
	
	private String CompanyName ;
	private long EmpId ;
	private String FirstName ;
	private String LastName ;
	
	//Setter method
	public void setEmployeeDetails(String CompanyName, long EmpId, String FirstName, String LastName) {
		CompanyName = CompanyName ;		//	it will not initialize the class attribute and hence, Company Name will be null only.
		//	hence, we are using this keyword.
		this.CompanyName = CompanyName ;
		this.EmpId = EmpId ;
		this.FirstName = FirstName ;
		this.LastName = LastName ;
	}
	
	//Getter method
	public String getEmployeeDetails() {
		String details = "Company Name  : " + this.CompanyName +
						 "Employee Id   : " + this.EmpId + 
						 "Employee Name : " + this.FirstName + this.LastName ;
		
		return details ;
	}
}


public class J_07_ThisKeywordAndGetterSetters {
	
	
	public static void main(String args[]) {
		
	
		
		
		
	}
}
