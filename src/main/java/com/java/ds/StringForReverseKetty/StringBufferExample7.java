package com.java.ds.StringForReverseKetty;

public class StringBufferExample7 {
	public static void main(String[] args) {
		System.out.println("This is the example of the Stringbuffer");
		
		//StringBuffer is used to create the mutable String i.e it can be changed or modified 
		
		//Now I am going to create the stringBuffer() 
		StringBuffer sb = new StringBuffer("Hello  ");
		sb.append("Java");
		System.out.println("the After the modification of the String is ");
		System.out.println(sb);
		
		//How to insert the String at the specific index using insert()
		sb.insert(1, "PythoN");
		System.out.println("after inserting the String is at the specified index is ");
		System.out.println(sb);
		
		// The use of replace() in String buffer
		
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.replace(1, 3,"KAVA");
		System.out.println("the string is after the use of the replace()");
		System.out.println(sb1);
		
		// The use of delete() in String Buffer()
		
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.delete(1, 3);
		System.out.println("after the deletion of the STring is ");
		System.out.println(sb2);
		
		
		// the use of the reverse() in StringBuffer()
		
		StringBuffer sb3 = new StringBuffer("linus");
		System.out.println("the current String is ");
		System.out.println(sb3);
		System.out.println("after the use of the reverse() ");
		sb3.reverse();
		System.out.println(sb3);
		
		// the use of the capacity in StringBuffer()
		
		StringBuffer sb4 = new StringBuffer();// by default the capacity is 16 
		System.out.println("the initial capacity  of the STring Buffer is ");
		System.out.println(sb4.capacity());
		sb4.append("Java is very simple and easy language for the developer and this langauge can be used for the different development");
		System.out.println("the string is ");
		System.out.println(sb4);
		System.out.println("the new capacity is ");
		System.out.println(sb4.capacity());
		System.out.println("the length of the STring is ");
		System.out.println(sb4.length());
		
		
		
		
	}

}
