 import java.util.*; 

 public class CountDistinctIntegers {   
    //for reverse num 
  public static int reverse(int num){  
        int rev=0; 
         
        while(num !=0){ 
            int digit = num%10; 
            rev = (rev * 10)+ digit; 
             
            num /=10;
        }
      return rev;
    } 
// arr = 1 23 47 19 37  
//arr2 =1 23 47 19 37 //1 32 74 91 73 

    public static int countDistinctIntegers(int[] nums) {  
        int n = nums.length; 
         int arr[] = new int[n*2];  
         //copy
         for(int i=0; i<n; i++){ 
            arr[i]=nums[i];  
         }
         
          for(int i=0; i<n; i++){ 
           arr[i+n]=reverse(nums[i]);
          }
         //for arr copy in set
          HashSet<Integer> set = new HashSet<>(); 
          for( int i=0; i<arr.length; i++){ 
            set.add(arr[i]);
          } 
           
          return set.size();

    }
    public static void main(String[] args) {
       int nums[] = {2,1,3}; 
        
       System.out.println(countDistinctIntegers(nums));

    }
    
}
