class Main 
{
  public static void main(String[] args) 
  {
   double x=3;
   int y=4;
   System.out.println(power(x,y));
  }

public static double power(double x, int y)
{
double result = 1.0;
long p = y;
if (y < 0) 
{
p = -p;
x = 1.0/ x ;
}
while (p != 0) 
{
if ((p & 1) != 0) 
{
result *= x;
}
x *= x ;
p= p>>1 ;
}
return result ;
}}
