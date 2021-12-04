import java.util.*;
public class Main{

public static void main(String args[])
{
    ArrayList<Integer> ob = new ArrayList<Integer>();
    Collections.addAll(ob,6,5,4,3,2,3,2,1,0);
    int k=ob.size()-2;
    while(k>=0 && ob.get(k)>ob.get(k+1))
    {
        k=k-1;
    }
    for(int i=ob.size()-1;i>k;i--)
    {
        if(ob.get(i)>ob.get(k))
        {
            Collections.swap(ob,i,k);
            break;
        }
    }
    Collections.sort(ob.subList(k+1,ob.size()));
    System.out.println(ob);
}
}
