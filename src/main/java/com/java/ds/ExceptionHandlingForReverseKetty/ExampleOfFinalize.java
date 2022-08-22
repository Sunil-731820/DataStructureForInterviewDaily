package com.java.ds.ExceptionHandlingForReverseKetty;

public class ExampleOfFinalize {
	   // defining the finalize method   
    public void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    }    
	public static void main(String[] args) {
		System.out.println("This is the example of the finalize ");
		
//		finalize is the method in Java which is used to perform clean up processing 
//		just before object is garbage collected.
		
//		finalize() method is used with the objects.
		
//		finalize method performs the cleaning activities with respect to 
//		the object before its destruction.
		
//		finalize method is executed just before the object is destroyed.
		
		ExampleOfFinalize obj = new ExampleOfFinalize();
		System.out.println("the hashcode of the Objects is " + obj.hashCode());
		
		// Now i am going to call garbage() i.e gc()
		System.gc();
		System.out.println("this is the end of the garbage collector ");
		
		
	}
	
	 

}
