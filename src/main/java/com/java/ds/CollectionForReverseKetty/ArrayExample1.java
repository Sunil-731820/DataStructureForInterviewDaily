package com.java.ds.CollectionForReverseKetty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayExample1 {
	public static void main(String[] args) {
		System.out.println("this is the example of arraylist");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("grapes");
		System.out.println("the list of the objects is ");
		
		//without iterating the list of the objects
		System.out.println(list1);
		
		//This is iterating each objects using iterator method
		System.out.println("Iterating the list of the objects using iterator");
		Iterator itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Iterating the objects of the list using for each loop
		System.out.println("The list of the objects is using for each loop");
		for(String obj : list1) {
			System.out.println(obj);
		}
		
		//The use of set() i.e. for the updation of the element 
		
		list1.set(1, "Orange");
		System.out.println("after the updation of the list is");
		System.out.println(list1);
		
		//Iterating the objects of the list after updation using for each loop
		System.out.println("the list of the objects is after updating the single objects ");
		for(String obj1: list1) {
			System.out.println(obj1);
		}
		
		//Now sorting the list of the objects using Collection.sort() 
		Collections.sort(list1);
		System.out.println("after sorting the list of the objects is ");
		System.out.println(list1);
		for(String obj2 : list1) {
			System.out.println(obj2);
		}
		
		
		//The use of addAll() in the array
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("radiish");
		list2.add("guava");
		System.out.println("the list of the second objects is ");
		System.out.println(list2);
		
		// Now adding the list of the second objects into the first list 
		list1.addAll(list2);
		System.out.println("the objects of the first list + second list will be ");
		System.out.println(list2);
		System.out.println("the list of the both the objects is ");
		for(String obj3 : list1) {
			System.out.println(obj3);
		}
		
		
		// Removing the element from the arrayList using remove() 
		
		//Removing the specific element from the list by name
		System.out.println("after removing ");
		list1.remove("guava");
		System.out.println("the list of the objects is after removing ");
		System.out.println(list1);
		
		//Removing the element from the specific index
		
		list1.remove(0);
		System.out.println("after removing the element from the specific position is ");
		System.out.println(list1);
		
		//Creating the new List 
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("Ravi");
		list3.add("Ravi");
		list3.add("Ajay");
		list3.add("Vijay");
		list3.add("Anuj");
		list3.add("guarav");
		
		System.out.println("the new list3 is ");
		System.out.println(list3);
		
		list3.remove("Ajay");
		System.out.println("after removing the single objects from the arrayList by Name");
		System.out.println(list3);
		
		System.out.println("after removing the single obejcts from the arrayList by Index ");
		System.out.println(list3.remove(0));
		
		//Again Creating the new List for using RemoveAll()
		
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("Ravi");
		list4.add("Hanumant");
		System.out.println("the list4 is ");
		System.out.println(list4);
		
		//the use of removeAll() in java
		
		list3.removeAll(list4);
		System.out.println("after this objects will be ");
		System.out.println(list3);
		
		//Now Removing the element by using specified conditions 
		System.out.println("This is removing the objects using specified conditions ");
		list3.removeIf(str->str.contains("Ajay"));
		System.out.println("the list 3 after applying the conditions");
		System.out.println(list3);
		list3.removeIf(str->str.contains("Vijay"));
		System.out.println("the list of the objects is ");
		System.out.println(list3);
		
		
		// The use of the size() in the arrayList
		
		ArrayList<String> list5 = new ArrayList<String>();
		System.out.println("the size of the array is ");
		System.out.println(list5.size());
		
		
		// the use of IsEmpty() in java
		System.out.println("after the use of isEmpty() ");
		System.out.println(list5.isEmpty());
		
		
		
		
	}

}
