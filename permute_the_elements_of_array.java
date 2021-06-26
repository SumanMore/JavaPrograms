import java.util.*;
class Main
{
  public static void main(String args[]){

  
List<Character> A=new ArrayList<Character>();
Collections.addAll(A ,'a','b','c','d');
List<Integer> P=new ArrayList<Integer>();

Collections.addAll(P,3,1,2,0);
Permutation(A,P);
}
public static void Permutation(List<Character> A,List<Integer>P)
{
  int next,temp;
  int size=A.size();
  for(int i=0;i<size;i++)
  {
    next=i;
    while(P.get(next)>=0)
    {
      Collections.swap(A,i,P.get(next));
      temp=P.get(next);
      P.set(next,P.get(next)-size);
      next=temp;
    }
  }
  System.out.println(P);
  System.out.println(A);
}
}
