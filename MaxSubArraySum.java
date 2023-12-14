 //Kadane's Algorithm
 public class MaxSubArraySum{ 
    public static void maxSubArrSum(int arr[],int n){ 
        int currentSum =0;  
        int maxSum =Integer.MIN_VALUE; 
        
        for(int i=0; i<n; i++){ 
        currentSum =  Math.max(arr[i] , currentSum + arr[i]); 
        maxSum = Math.max(maxSum , currentSum);
        } 
        System.out.println("MaxSubArraySum is "+maxSum);
    } 
    public static void main(String []args){ 
        int arr[] ={1,2,3,-2,5}; 
        int n = arr.length; 
        maxSubArrSum(arr,n);
    }
}