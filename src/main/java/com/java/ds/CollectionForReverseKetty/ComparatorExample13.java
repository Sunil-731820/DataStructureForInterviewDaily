package com.java.ds.CollectionForReverseKetty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

//This is the Age comparator i.e it is going to compare the age of the student then sort 
class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.age==s2.age) {
			return 0;
		}else if(s1.age>s2.age) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

//This is the NameComaparator i.e it will sort the student according the name properties
class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return (s1.name.compareTo(s2.name));
	}
	
}


//This is the EXample of the Both NamedAndAgeComparator i.e it is going to sort the student data by using both 
// Name and Age

//class NamedAndAge implements Comparator<Student>{
//
//	@Override
//	public int compare(Student s1, Student s2) {
//		return (s1.name.compareTo(s2.name)) && (s1.age.);
//	}
//	
//}

public class ComparatorExample13 {
	public static void main(String[] args) {
		System.out.println("This is the example of the comparator");
		
		//Creating a list of students  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21)); 
		
		// Now sorting using the collections.sort(list,properties)
		System.out.println("the list is ");
		System.out.println(al.toString());

		Collections.sort(al , new AgeComparator());
		
		//printing the objects on the console using for each loop 
		System.out.println("This is the Age comparator ");
		for(Student st : al) {
			System.out.println(st.rollno+ " " + st.name + " " + st.age);
		}
		
		
		//Now Sorting the student objects using Name 
		System.out.println("This is the Named Comparator ");
		Collections.sort(al,new NameComparator());
		
		//printing the objects using for each loop
		
		for(Student st : al) {
			System.out.println(st.rollno + " "+ st.name + " " + st.age);
		}
		
		
	}

}
