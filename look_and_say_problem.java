class Main
 {
  public static void main(String[] args)
   {
    System.out.println(look_and_say(4));
   }

public static String look_and_say(int n)
{
String s = "1";
for (int i = 1; i < n; ++i)
{
s = generate(s);
}
return s;
}

private static String generate(String s)
{
StringBuilder ob = new StringBuilder();
int l=s.length();
for (int j = 0; j < l; j++) 
{
int count = 1 ;
while (j + 1 < l && s.charAt(j) == s.charAt(j + 1))
{
count++ ;
j++;
}
ob.append(count);
ob.append(s.charAt(j));

}
return ob.toString();
}
}
