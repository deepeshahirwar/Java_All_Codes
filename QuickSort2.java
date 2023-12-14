public class QuickSort2{  
    //for partition of element 
   public static  int partition(int arr[], int low, int high){ 
        int pivot = arr[high];//pivot element 
        int i = low-1; 
         
        for(int  j=low; j<=high-1; j++){ 
              // If current element is smaller than the pivot   
            if (arr[i] < pivot){ 
                i++; 
                int temp = arr[i]; 
                arr[i] =arr[j]; 
                arr[j]=temp;
            } 
        }
         i++;
        
        int temp = arr[i];  
        arr[i] = arr[high]; 
        arr[high] = temp; 
        return i;//pivot index; 
        }   
    
         
       public static   void quickSort(int arr[], int low, int high){ 
           
             
                if(low < high){ 
                    int pi= partition(arr,low,high); 
                    quickSort(arr,low , pi-1); 
                    quickSort(arr, pi+1, high);
                
            }
        } 
    //main method 
    public static  void main(String args[]){  
        int arr[]={4,2,7,5,1}; 
        int n = arr.length;  
        
     quickSort(arr, 0, n-1); 
     

        //for array print 
        for(int i=0; i<n; i++){ 
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
    } 
}