public class ReverseArr3{  
    public static void reverseArr(int arr[],int n){ 
     int start =0; 
     int end = n-1;  
     //for reversing array
     while(start < end){  

        int temp = arr[start]; 
        arr[start] = arr[end]; 
        arr[end] = temp; 
         
        start++; 
        end--;
     } 
     //for printing arr 
     for(int i: arr){ 
        System.out.print(i+" ");
     } 
     System.out.println();
    }
    public static void main(String []as){ 
        int arr[] = {1,2,3,4,5}; 
        int n = arr.length;  
        reverseArr(arr , n);

    }
}