
import java.util.*;
public class Main{

public static void main(String args[])
{
    int arr[]={2,1,-3,4,-1,2,1,-5,4};
    int max_so_far=Integer.MIN_VALUE;
    int max_ending=0;
    for(int i=0;i<arr.length;i++)
    {
        max_ending=max_ending+arr[i];
        if(max_so_far<max_ending)
        {
            max_so_far=max_ending;
        }
        if(max_ending<0)
        {
            max_ending=0;
        }
    }
   System.out.println(max_so_far);
    
}
