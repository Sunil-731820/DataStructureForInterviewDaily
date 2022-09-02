package com.java.ds.StringForReverseKetty;

public class TryStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Durga");
//		StringBuffer sb2 = new StringBuffer("Software");
//		StringBuffer sb3 = new StringBuffer("Solutions");
		System.out.println("the first String Buffer is " + sb1);
		StringBuffer sb2 = sb1.append("Software");
		System.out.println("the second String is " + sb2);
		StringBuffer sb3 = sb1.append("Solutions");
		System.out.println("the third one is " + sb3);
		
		System.out.println("the first String buffer" + sb1);
//		System.out.println("the second String Buffer" + sb2);
//		System.out.println("the third one is " + sb3);
	}

}
