package com.java.ds.CollectionForReverseKetty;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
	SUNDAY , MONDAY, TUESDAY,WEDNESDAY,FRIDAY,THURSDAY,SATURDAY
}

public class EnumSetExample11 {
	public static void main(String[] args) {
		System.out.println("This is the example of the enumSet");
	    Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY,days.FRIDAY,days.SATURDAY);  
	    System.out.println("the Enum Set is ");
	    System.out.println(set);
	    
	    //Iterating the set is
	    System.out.println("after iteration of the objects is ");
	    Iterator itr = set.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    // The use of allOf() function in java
	    
	    Set<days> set1 = EnumSet.allOf(days.class);
	    System.out.println("the all the days is ");
	    System.out.println(set1);
	    
	    // The use of NoneOf() in java
	    Set<days> set2 = EnumSet.noneOf(days.class);
	    System.out.println("this will print nothing to the console because i have nonOf()");
	    System.out.println(set2);
	    
	    
	    
	}

}
