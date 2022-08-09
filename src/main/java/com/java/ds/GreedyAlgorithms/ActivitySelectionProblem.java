package com.java.ds.GreedyAlgorithms;

public class ActivitySelectionProblem {
	
	public static void PrintMaximumActivity(int s[] , int f[],int n) {
		int i,j;
		i =0;
		System.out.println(i + " ");
		for(j=1;j<n;j++) {
			if(s[j]>=f[i]) {
				System.out.println(j + " ");
				i = j;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int s[] =  {10,12,20};
	    int f[] =  {20,25,30};
	    int n = s.length;
	    PrintMaximumActivity(s, f, n);
	}

}
