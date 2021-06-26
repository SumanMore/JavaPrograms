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

public class Main {
  public static void main(String[] args) {
   String str="Ram is costly";
   char ch[]=str.toCharArray();
   int l=str.length();
  System.out.println(reverseWords(ch));
  }


public static char[] reverseWords(char[] input)
{

reverse ( input , 0, input . length) ;
int start = 0, end;
while ((end = find(input, ' ' , start)) != -1)
{
reverse (input , start, end);
start = end + 1;
}
reverse(input , start, input.length);
return input;
}

public static void reverse(char[] array, int start, int stoplndex)
{
if (start >= stoplndex) 
{
return ;
}
int last = stoplndex - 1;
for (int i = start; i <= start + (last - start) / 2; i++)
{
char tmp = array[i];
array[i] = array[last - i + start];
array[last - i + start] = tmp;
}

}



public static int find(char[] array, char c, int start) 
{
for (int i = start; i < array.length ; i++) 
{
if (array[i] == c)
{
return i ;
}}
return -1;
}}
output
enter the string
i love programming
i evol gnimmargorp 
*/
