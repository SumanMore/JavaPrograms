//8.	Write a program to check whether the entered string is a pallindrome or not.
import java.util.Scanner;

public class check_pallindromic_string{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.nextLine();
		String str="";
		int i;
		for(i=s.length()-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		}
		if(s.equalsIgnoreCase(str))
	
			System.out.println("pallindrome.");
			else
			
				System.out.println("not pallindrome.");
}
}
/*
output
Enter String
madam
pallindrome.
*/