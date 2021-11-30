class GfG
{
    int maxLen(int arr[], int n)
    {
 
  int max=0;
	 int sum=0,res=0,c=0;
        for(int i=0;i<n-1;i++)
        {
            sum=arr[i];
            c=1;
            for(int j=i+1;j<n;j++)
            {
                c++;
                sum+=arr[j];
                
                if(sum==0)
                {
                   max=Math.max(c,max);
                   res=max;
                }
                
            }
        }
      return res;
    }
}
