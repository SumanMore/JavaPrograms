class Solution {
    public boolean isPalindrome(int x)
    {
       
    if (x < 0) 
    {
      return false;
    }
    return x - reverse(x) == 0;
    }
  
 public static  int reverse(int n) 
  {
    int r = 0;
    while (n > 0)
    {
      r = r * 10 + n % 10;
      n /= 10;
    }
    return r;
 
    }
}
