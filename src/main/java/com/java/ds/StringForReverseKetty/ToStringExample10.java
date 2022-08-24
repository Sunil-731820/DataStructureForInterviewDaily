package com.java.ds.StringForReverseKetty;


class Student{
	int rollNumber;
	String name;
	String city;
	
	public Student(int rollNumber, String name, String city) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
}
public class ToStringExample10 {
	public static void main(String[] args) {
		System.out.println("this is the example of the to String method");
		// now creating the object of the Student 
		Student s1 = new Student(1, "Harish", "Lucknow");
		Student s2 = new Student(2, "Omkar", "Bangalore");
		System.out.println("the first Student Details is " + s1); // This will give the hashcode of the data only if you are not using toString()
		System.out.println("the Second Student Details is " + s2);// This will give the hashcode of the data only if you are not using toString()
		
		// Now i am going to use the toString() 
		System.out.println("The first Student detail is  "+ s1.toString());
		System.out.println("The Second Student details is   "+ s2.toString());
//		
	}

}
