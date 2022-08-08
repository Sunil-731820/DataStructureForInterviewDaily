package com.java.ds.array;

import java.util.Arrays;
import java.util.List;

public class pickFromBothEndToGetMaxSum {
	public static void main(String[] args) {
		 Integer[] arr = { 5, -2, 3, 1, 2 };
         System.out.println(solve(Arrays.asList(arr), 3));
		
	}
	
	
	public static int solve(List<Integer> A , int B) {
		int n = A.size();
		int result = 0;
		for(int i=0;i<B;i++) {
			result = result + A.get(i);
		}
		
		int sum = result;
		for(int i=0;i<B;i++) {
			sum = sum - A.get(B-1-i);
			sum = sum + A.get(n-1-i);
			result = Math.max(sum, result);
		}
		
		
		return result;
		
	}
}
