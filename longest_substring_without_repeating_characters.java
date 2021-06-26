
//Write a java code to find the longest substring without repeating characters in the given string.

import java.util.*;
public class longest_substring_without_repeating_characters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(); 
		int arr[] = new int[256];
		 Arrays.fill(arr,-1); 
		 int c=0,j=0;  
		 for (int i=0;i<str.length();i++) { 
			j=Math.max(j,arr[str.charAt(i)]+1); 
			 c = Math.max(c,i-j+1); 
			 arr[str.charAt(i)]=i;  
		 }
		System.out.println(c);
	}

}
/*
output
hello people
5
*/