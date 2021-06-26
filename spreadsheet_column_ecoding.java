class Main {
  public static void main(String[] args)
   {
    int n=Decode("YZ");
    System.out.println(n);

  }
  public static int Decode(String col)
   {
int r = 0;
for (int i = 0; i < col .length() ; i++)
{
char c = col . charAt(i);
r = r* 26 + c - 'A' + 1;
}
return r;
}

}
