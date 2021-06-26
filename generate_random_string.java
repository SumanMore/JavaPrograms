//Write a java code to generate random string of a given size.


import java.util.*;
public class generate_random_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the string:");
		int n=sc.nextInt();
		String s="";
		char c;
		for(int i=0;i<n;i++) {
			c=(char)(65+Math.random()*26);  //c=(char)(97+Math.random()*26);
			s=s+c;
		}
		System.out.println(s);
	}
}
/*
output
enter the size of the string:
5
DLKEC
*/