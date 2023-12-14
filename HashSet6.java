 import java.util.*; 
 import java.util.Collections; 

 public class HashSet6{ 
    public static void main(String[] args) { 
        int arr[] ={1,2,3,3,4,5,3,9};  

        int size = arr.length;
        HashSet<Integer> set = new HashSet<>(size);  

        for(int i=0; i<size; i++){ 
            set.add(arr[i]);
        } 
        System.out.println(set); 
        set.add(50); 
        set.add(40); 
        System.out.println(set); 
          
        
    }
}