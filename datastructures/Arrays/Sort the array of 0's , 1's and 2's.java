class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int k=0;
        int ar[]=new int[n];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[j]==i)
                {
                    ar[k++]=a[j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            a[i]=ar[i];
            
        }
    }
}
