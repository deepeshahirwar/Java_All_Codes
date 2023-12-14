 //print maximum element 
 import java.util.*;
public  class MaxElement{ 
 public  static void maxElement(ArrayList7<Integer> arr, int size){ 
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){ 
            max = Math.max(max, arr.get(i)); 

        } 
        System.out.println("max element : "+max);
    }
public static void main(String[]args){    
ArrayList7<Integer> arr = new ArrayList7<>();  
arr.add(1); 
arr.add(2); 
arr.add(3); 
arr.add(4);  
int size = arr.size();

maxElement(arr,size); 

} 
}