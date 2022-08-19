package com.java.ds.CollectionForReverseKetty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	
	//This is the constructor using fields
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}



	@Override
	public int compareTo(Student st) {
		if(age==st.age) {
			return 0;
		}else if(age>st.age) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
}

public class ComparableExample12 {
	public static void main(String[] args) {
		System.out.println("This is the Example of the Comparable in Collections");
		
		//Creating the arrayList For Storing the objects 
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(101,"Vijay",23));  
		list.add(new Student(106,"Ajay",27));  
		list.add(new Student(105,"Jai",21)); 
		// Sorting the list of the objects 
		
		Collections.sort(list);
		
		//printing the objects using for each loop
		for(Student st : list) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		
	}
}
