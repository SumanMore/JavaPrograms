public class  Main{
public static void main (String[] args) {
    
        int arr[]={1,4,3,5,2,7,2};
        for (int i = 0; i < arr.length; i++)
        {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
        
    }
}
/
