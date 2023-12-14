  //program for count Distinct element
  import java.util.*;
 public class contDistinctE { 
    public static void main(String[] args) { 
        int arr[] ={4,3,2,5,6,7,3,4,2,1};  
        int size =arr.length; 
         
        HashSet<Integer> set = new HashSet<>(); 
         
        for(int i=0; i<size; i++){ 
            set.add(arr[i]);
        } 
        System.out.println("All Distnct element is "+set);
        System.out.println("count of Distinct element is :"+set.size()); 
    
        
    }
    
}
