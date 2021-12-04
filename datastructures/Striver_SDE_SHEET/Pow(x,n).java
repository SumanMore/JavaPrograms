int pow(x,n)
{
  int p=1;
  while(n>0)
  {
    p*=x;n--;
  }
  return p;
