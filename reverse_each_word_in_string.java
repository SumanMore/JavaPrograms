//Write a java program to input a string from user and reverse each word of the string

import java.util.*;
public class reverse_each_word_in_string {

	public static void main(String[] args) {
		String st,st1="";
		int i;
		char ch,ch1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		st=sc.nextLine();
		st=st+' ';
		for(i=0;i<st.length();i++)
		{
			ch=st.charAt(i);
			if(ch!=' ')
				st1=ch+st1;
			else {
				System.out.print(st1+" ");
				st1="";
		}
	}

}}
/*
output
enter the string
i love programming
i evol gnimmargorp 
*/