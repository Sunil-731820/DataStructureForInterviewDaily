package com.java.ds.StringForReverseKetty;

public final class Employee  
{    
final String pancardNumber;    
public Employee(String pancardNumber)  
{    
this.pancardNumber=pancardNumber;    
}  
public String getPancardNumber(){    
return pancardNumber;    
}    
}    

public class ImmutableClassInJavaExample9 {
	
	public static void main(String[] args) {
		System.out.println("This is the example of the immutable class in java");
		Employee emp = new Employee("123122");
		String emp1 = emp.getPancardNumber();
		System.out.println("the pancard Number is "+ emp1);
	}

}
