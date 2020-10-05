
//Write a java program to display the words of the input string in reverse order without changing their position
import java.util.*;
public class String_program_1 {
    public static void main( String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        str=str+" ";
       int i;String wr="";
for(i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch!=' ')
{
wr=ch+wr; // to reverse the word
}
else
{
System.out.print(wr+" ");
wr=""; // reinitialization
    }
    }
    }
    }