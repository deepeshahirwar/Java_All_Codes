public class MergeSort3{ 
    public static void  merge(int arr[], int low, int mid, int high ){ 
        //create temprar array 
        int temp[] = new  int[high - low+1];

        int i = low ; 
        int j = mid+1; 
        int k=0; //index for temp
        
         
            while(i<= mid && j<= high){ 
                if(arr[i] < arr[j]){ 
                    temp[k]= arr[i]; 
                    i++;
                } 
                else { 
                    temp[k]= arr[j]; 
                    j++;
                } 
                k++; 
            } 
            //for leftOver element of 1st sorted part
            while(i <= mid){ 
                temp[k++] = arr[i++] ;  
                 
                    
            } 
            //for rightOver element of 2st sorted part 
            while(j <= high){ 
                temp[k++] = arr[j++] ;  
                  
            } 
             
            //for copy from temp to initial arr 
            for( k=0, i=low; k<temp.length; k++,i++){ 
                arr[i] = temp[k];
            }
          
        } 
            
    public static void mergeSort(int arr[], int low, int high) { 
       
        if(low >= high){ 
            return;
        }
          
            int mid = (low + high)/2; 
            mergeSort(arr, low ,  mid); 
            mergeSort(arr, mid+1 , high); 

            merge(arr, low , mid , high);
         
    } 
 
       
    /* Function to print the array */   
    public static void printArray(int arr[], int n){ 
        for(int i=0; i<n; i++){ 
     System.out.print(arr[i]+" ");
        }
    }
     
    public static void main(String []args){ 
       int arr[] = {4,3,2,8,6,5};  
       int  n = arr.length; 
  
       System.out.println("befor  sorting arr is : ");
       printArray(arr , n);  
       
       System.out.println();
       mergeSort(arr, 0, n-1); 

       System.out.println("after  sorting arr is : ");
       printArray(arr , n);
    }
}