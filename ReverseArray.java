 import java.util.Collections; 
 import java.util.Arrays; 
 //Array sort in decsending order 
 
 public class ReverseArray{ 
    public static void main(String []args){ 
        Integer[] arr = {2 , 3 , 12 , 32 , 23}; 
         // Sorts arr[] in descending order using
        // reverseOrder() method of Collections class 
         
        Arrays.sort(arr, Collections.reverseOrder()); 
         
        for(int i: arr){ 
            System.out.print(i+" ");
        }
    }
}