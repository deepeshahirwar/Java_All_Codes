 //print maximum element 
 import java.util.*;
public  class SwapTwoNum{ 
 public  static void swap(ArrayList7<Integer> arr, int idx1,int idx2){  
    int temp = arr.get(idx1); 
    arr.set(idx1,arr.get(idx2)); 
    arr.set(idx2,temp);
        
 }
public static void main(String[]args){    
ArrayList7<Integer> arr = new ArrayList7<>();  
arr.add(1); 
arr.add(2); 
arr.add(3); 
arr.add(4);  
 int idx1 = 1, idx2 = 3;
 
 System.out.println("before swaping : "+arr);
 swap(arr,idx1,idx2); 
 System.out.println("after swaping : "+arr); 

} 
}