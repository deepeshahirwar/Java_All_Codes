 import java.util.Arrays;
 public class findKthLargest{ 
    public static void main(String []args){ 
        int arr[]={3,2,1,5,6,4}; 
        int k=2; 
        int n= arr.length; 
         
       Arrays.sort(arr);
     System.out.print(arr[(n-1) - (k-1)]);
    }
}