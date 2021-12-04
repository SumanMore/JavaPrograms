import java.util.*;
class Main{
    
    public static void main (String args[]) 
    {
        int nums[]={2,7,11,15};
        int target=9;
        int arr[]=new int[2];
    
        HashSet<Integer> ob=new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            int curr=target-nums[i];
            if(ob.contains(curr))
            {
                arr[0]=nums[i];
                arr[1]=curr;
                break;
            }
            else
            {
                ob.add(nums[i]);
            }
        }
        for(int i=0;i<2;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }
        
    
}
