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




class GfG {
    int maxLen(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int res = 0, sum = 0;
        
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(map.containsKey(sum))
                res = Math.max(res, i - map.get(sum));
            else
                map.put(sum, i);
        }
        return res;
    }
}
