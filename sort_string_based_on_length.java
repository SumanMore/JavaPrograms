/*30.	Write a Program to sort String on their length in Java? Your method should accept an array of String
 *  and return a sorted array based upon the length of String.
 */
import java.util.*;
public class sort_string_based_on_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
sc.nextLine();
String words[]=new String[n];
String temp="";
for(int i=0;i<n;i++)
{   
	System.out.print("enter string");
	words[i]=sc.nextLine();
	
}
for(int i=0;i<n-1;i++)
{
	for(int j=0;j<n-i-1;j++)
	{
		
		if(words[j].length()>words[j+1].length())
		{
			temp=words[j];
			words[j]=words[j+1];
			words[j+1]=temp;
		}
			
	}
	
	
	
}
for(int i=0;i<n;i++)
{
	System.out.print(words[i]+" ");
	
}
	}}

/*
 * output
 * enter a number
4
enter stringsuman
enter stringis
enter stringmy
enter stringname
is my name suman
*/ 
 


