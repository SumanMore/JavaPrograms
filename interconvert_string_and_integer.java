import java.util.*;
class Main {
  public static void main(String[] args) {
    /*String s="-123";
  int n=Integer.parseInt(s);
  System.out.println(n);
  int num=567;
  System.out.println(Integer.toString(num));*/
  String s="-123";
  System.out.println(stringToInt(s));
  int num=-123;
  System.out.println(intToString(num));

  }
public static int stringToInt(String s)
{
int r=0;
int i=s.charAt(0)=='-'? 1:0;
for(int j=i;j<s.length();j++)
{
int d=s.charAt(j)-'0';
r= r*10+d;
}
if(i==1)
  return -r;
else
  return r;  
}
public static String intToString(int n)
{
  /*
  int c=-210;
  String s=""+c;
  System.out.println(s);*/
  int num=Math.abs(n);
  StringBuilder s=new StringBuilder();
while (num!=0)
{
  int r=num%10;
  s.append(r);
  num/=10;
}
if(n<0)
{
  s.append('-');
}
return s.reverse().toString();
}

}

