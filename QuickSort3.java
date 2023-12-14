public class QuickSort3{  
    public static int partition(int arr[], int low, int high){ 
        int pivot =  arr[high]; 
        int i= low-1; 
         
        for(int j=low; j <= high-1; j++){ 
            if(arr[i] < pivot){ 
                i++; 
                int temp = arr[i]; 
                arr[i]= arr[j]; 
                arr[j]= temp;
            }
        } 
        //nahi to  
        i++; 
        int temp=arr[i]; 
        arr[i] = arr[high]; 
        arr[high]= temp; 
        return i; 

    } 
    public static void  quickSort(int arr[],  int low , int high){ 
        while(low < high){ 
            int  pi = partition(arr, low, high ); 
             
            quickSort(arr,low, pi-1); 
            quickSort(arr, pi+1, high);
        }
    }
    public static void main(String[]args){ 
    int arr[] = { 7,4,2,1,9,3}; 
     
    int n = arr.length;  

    quickSort(arr, 0, n-1);  

    for(int i=0; i<n; i++){ 
        System.out.print(arr[i]+" " );
    } 
    System.out.println();
    }
}