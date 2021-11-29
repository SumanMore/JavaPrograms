import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		int ar[]={2,2,2,2,2,2};
		 HashSet<Integer> ob=new  HashSet<Integer>();
        for(int i=0;i<ar.length;i++)
        {
            ob.add(ar[i]);
        }
        System.out.println(ob);
	}
}
