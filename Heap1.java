 // inser in heap
 import java.util.*;

 public class Heap1 {  
     
    
       // ArrayList<Integer> arr = new ArrayList<>(); 
         
        public  static void add1(int data){ 
            ArrayList7<Integer> arr = new ArrayList7<>();  
            //add at last index; 
            arr.add(data); 
             
            int x = arr.size()-1;// x is child index 
            int par = (x-1)/2;// par index 
 
            while(arr.get(x) < arr.get(par)){ //O(logn)
                //swap 
                int temp = arr.get(x); 
                arr.set(x,arr.get(par)); 
                arr.set(par, temp);
            }
    
         
    System.out.print(arr);
        }
    
    public static void main(String[] args) {
        add1(3);  
        add1(4); 
        add1(10); 
        add1(5); 
        add1(4);  
    }
    
}
