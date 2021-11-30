public static void convertToWave(int arr[], int n){
       
       // Your code here
       int temp=0;
       int j=1;
       for(int i=0; i<n-1; i=i+2){
           
           
              temp =  arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
                  
               j=j+2;
           
       }
