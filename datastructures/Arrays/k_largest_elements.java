class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int j=0;
        int ar[]=new int[k];
        for(int i=0;i<k;i++)
        {
            ar[i]=arr[n-j-1];
            j++;
        }
        return ar;
    }
}
