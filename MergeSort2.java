public class MergeSort2{  
    public static void mergeSort(int arr[], int low, int high ){ 
        low  = 0; 
        high = arr.length -1; 
        while(low < high){ 
            int mid = (low + high)/2; 
            mergeSort(arr, low, mid); 
            mergeSort(arr,mid+1,end);
        }
    }
    public static void main(String []args){ 
        int arr[] = { 7,4,2,9,1 }; 
        int n = arr.length; 

    }
}