import java.util.*;
class Main {
  public static void main(String[] args) 
  {
    System.out.println(romanToInteger("CIV"));
  }

public static int romanToInteger(String s)
 {
 HashMap<Character,Integer> ob = new HashMap<Character , Integer>();

ob.put('I', 1);
ob.put('V', 5);
ob.put('X' ,10);
ob.put('L', 50);
ob.put('C', 100);
ob.put('D', 500);
ob.put('M', 1000);

int sum = ob.get(s.charAt(s.length() - 1));
for (int i = s.length() - 2 ; i >= 0; --i) 
{
if (ob.get(s.charAt(i)) < ob.get(s.charAt(i + 1)))
{
sum -= ob.get(s.charAt(i));
} 
else
{
sum += ob.get(s.charAt(i));
}
}
return sum;
 }}
