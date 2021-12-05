import java.util.*;

class Main {
  public static void main(String[] args)
   {
    List<Integer> l=new ArrayList<Integer>();
	
		Collections.addAll(l,2,3,5,5,7,11,11,11,13);
	
		System.out.println(deleteDuplicates(l));
  }

public static int  deleteDuplicates(List<Integer> A) {
if (A.isEmpty())
{
return 0;
}
int writelndex = 1;
for (int i = 1; i < A.size(); ++i) 
{
if (!A .get(writelndex - 1).equals(A.get (i))) 
{
A.set(writelndex++, A.get(i));
}
}
return writelndex;
}
}
