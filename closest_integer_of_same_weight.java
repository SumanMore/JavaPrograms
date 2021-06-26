class Main {
  public static void main(String[] args)
   {
     
    long  x=0b01111;
    System.out.println(Long.toBinaryString(closestinteger(x)));
    }

   

public static long closestinteger(long x) {
int n=5;
for (int i = 0; i < n- 1; ++i) {
if ((((x >> i) & 1) != ((x >> (i + 1)) & 1))) 
{
x ^= (1 << i) | (1 << (i + 1)); 
}}
return x;
//System.out.println(16&~(16-1));
}
}
