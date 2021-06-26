import java.util.*;
class Main {
  public static void main(String[] args) {
    String p="23";
    System.out.println("Input :"+p);
    System.out.println("output: "+phoneMnemonic(p));
    
  }

public static List<String> phoneMnemonic(String phn_no) 
{
   char [] partialMnemonic = new char[phn_no.length()];
   List<String> mnemonics = new ArrayList <>();
   phn_mnemonics_helper(
   phn_no , 0, partialMnemonic , mnemonics);
   return mnemonics;
}

private static final String[] p= {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
private static void phn_mnemonics_helper(String phn_no, int digit,char[] partialMnemonic,List<String> mnemonics) 
{
  if (digit == phn_no.length())
   {
    mnemonics.add(new String(partialMnemonic));
   } 

  else 
    {
    for (int i = 0; i < p[phn_no.charAt(digit)-'0'].length();++i)
     {
     char c = p[phn_no.charAt(digit) -'0'].charAt(i);
     partialMnemonic[digit] = c;
     phn_mnemonics_helper(phn_no , digit + 1, partialMnemonic, mnemonics);
     }
    }
}
}
