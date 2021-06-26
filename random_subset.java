import java.util.*;
class Main {
  public static void main(String[] args)
   {
     randomSubset(10,4);
    }

    
public static void  randomSubset(int n, int k) 
{
Map<Integer , Integer> ob= new HashMap<>();
Random r = new Random();
for (int i = 0; i < k; ++i) 
{
    int r1 = i + r.nextInt(n - i);
    Integer p1 = ob.get(r1);
    Integer p2 = ob.get(i);
if (p1 == null && p2 == null)
{
   ob.put(r1 , i);
   ob.put(i, r1);
} 
else if (p1 == null &&  p2 != null)
{
  ob.put(r1 , p2);
  ob.put(i, r1);
} 
else if (p1!= null && p2 == null)
{
 ob.put(i , p1);
 ob.put(r1 , i);
}
else 
{
  ob.put(i , p1);
  ob.put(r1 , p2);
}
}
List<Integer> result = new ArrayList<Integer>(k);
for (int i = 0; i < k; ++i)
 {
result.add(ob.get(i));
}
System.out.println(result);
}
}
