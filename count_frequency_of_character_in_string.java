//Write a program to enter a string and count the frequency each character present in it.
import java.util.*;
public class count_frequency_of_character_in_string {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	str=str.toLowerCase();
	int c=0,i;
	char chr,ch;
	for(chr='a';chr<='z';chr++)
	{
		c=0;
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch==chr)
				c++;
		}
		if(c>0)
			System.out.println("the frequency of " +chr+ ":" +c);
	}
}}

/*
output
hello suman
Enter a string
the frequency of a:1
the frequency of e:1
the frequency of h:1
the frequency of l:2
the frequency of m:1
the frequency of n:1
the frequency of o:1
the frequency of s:1
the frequency of u:1
*/
