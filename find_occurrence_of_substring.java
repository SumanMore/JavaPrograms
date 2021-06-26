class Main 
{
  public static void main(String[] args)
   {
    System.out.println(rabinKarp("GACGCCA","CCA"));
   }

public static int rabinKarp(String t, String s)
{
if (s.length() > t.length()) 
{
return -1; 
}
final int base = 10;
int thash = 0, shash = 0 ; 
int power = 1; 

for (int i = 0; i < s.length(); i++)
{
power = i > 0 ? power * base : 1;
thash = thash * base + t.charAt(i);
shash = shash * base + s.charAt(i);
}

for (int i = s.length(); i < t.length(); i++) 
{
if (thash == shash && t.substring(i-s.length(), i).equals(s))
{
return i - s.length(); 
}
thash -= t.charAt(i - s.length()) * power;
thash = thash * base + t.charAt(i);
}

if (thash == shash && t.substring(t.length() - s.length()).equals(s)) 
{
return t.length() - s.length();
}
return -1;
}}
