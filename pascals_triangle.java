class Main {
  public static void main(String[] args) {
   int n=5;
   pascal(n);
  }
  public static void pascal(int n)
  {
    int a0=1;
     System.out.print(a0+" ");
    for(int r=1;r<=n;r++)
    {
      int b=(a0*(n-r+1))/r;
      a0=b;
      System.out.print(a0+" ");
    }
  }
  
}






import java.util.*;
class Main 
{
public static List<List<Integer>> generatePascal(int numRows)
  {
    List <List <Integer>> pascal = new ArrayList<>();
    for(int i=0; i<numRows;i++)
    {
      List <Integer> currRow = new ArrayList<>();
      for(int j=0;j<=i;j++)
      {
        currRow.add((j>0 && i>j)? 
        pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j)
        :1);
      }
      pascal.add(currRow);
    }
    return pascal;
  }

  public static void main(String[] args) {
   List  <List <Integer>> pascalTriangle = generatePascal(5);
   for(int i=0; i<pascalTriangle.size(); i++){
     for(int j=0; j<pascalTriangle.get(i).size(); j++){
       System.out.print(pascalTriangle.get(i).get(j)+" ");
     }
     System.out.println();
   }
  }
}
