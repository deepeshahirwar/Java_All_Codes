  import java.util.*; 

  class SecondLargest1{ 
    public static void main(String[]args) 
    { 
        int[] a={6,2,8,9,4,7,10,1};  
        int n = a.length;
         Arrays.sort(a);
        
            System.out.print("SecondLargest1 element is : "+a[n-2]); 
         
        
    }
    
}
