int MissingNumber(int arr[], int n)
{
int givensum=0;
int totalsum = n*(n+1)/2;

for(int i =0 ; i<n-1; i++ )
givensum = givensum+arr[i];

return totalsum-givensum;

}
