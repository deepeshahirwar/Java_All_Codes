 public class QuickSort5{  
    //for patition 
    public static  int partition(int a[], int low, int high) 
    { 

       int  pivot = a[high]; //pivot index 
       int i = (low-1); 

       for(int j=low; j<high; j++) 
       { 
         
            if(a[j] < pivot) 
            {  
                i++; 
                int temp=a[i]; 
                a[i] = a[j]; 
                a[j] = temp;
            } 
           
        }  
        int temp = a[i+1]; 
            a[i+1] = a[high]; 
            a[high]=temp;
        
       return (i+1); 
    }
        
    
      
   public static  void quickSort(int a[],int low,int high){  
         if(low < high){  
             int pi = partition(a,low,high); 
             quickSort(a, low, pi-1); 
              quickSort(a, pi+1, high);
         } 
     } 
    public static void main(String []args){  
        int a[]={ 5,3,1,6,4}; 
        int  n= a.length;
        quickSort(a,0,n-1); 
         
        for(int i=0;  i<n; i++){ 
            System.out.print(a[i]+" ");
        }
    }
}