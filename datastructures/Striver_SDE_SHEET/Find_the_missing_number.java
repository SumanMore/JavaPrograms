static int getMissingNo(int a[], int n)
{
    int n_elements_sum = n * (n + 1) / 2;
    int sum = 0;
 
    for(int i = 0; i < n - 1; i++)
        sum += a[i];
         
    return n_elements_sum - sum;
}



