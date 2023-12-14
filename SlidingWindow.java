 /* find the max subarray sum  in the given range k */
 public class SlidingWindow { 
    public static void main(String[] args) {
        int arr[] ={1,6,2,8,3,9}; 
        int k =2;//window size 
        int size = arr.length; 
         
        //sliding window approach 
        int i=0; 
        int j=0; 
          
        int sum =0; 
        int max = Integer.MIN_VALUE;
        while(j < size){  
            sum += arr[j]; 

            if(j-i+1 < k){ 
                j++;
            } 
            else if(j-i+1 == k ){ 
                max = Math.max(max, sum); 
                 
                sum -=arr[i]; 
                i++; 
                j++;//for next window
            }
        } 
        System.out.println("max sum is : "max);
    }
    
}
